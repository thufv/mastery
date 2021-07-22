package mastery.tree;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.metamodel.BaseNodeMetaModel;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import com.github.javaparser.metamodel.PropertyMetaModel;
import mastery.tree.extensions.ConflictWrapper;

import java.lang.reflect.Modifier;
import java.util.*;

import static mastery.tree.extensions.ConflictWrapper.CONFLICT_KEY;

public final class TreeTransformer {
    private static final Map<String, Integer> LABELS = new HashMap<>();
    private static final Map<Class<?>, Class<?>> CONCRETE_CLASSES = new HashMap<>();

    static String getTransformedName(BaseNodeMetaModel nodeMetaModel) {
        return nodeMetaModel.getTypeName();
    }

    static String getTransformedName(PropertyMetaModel propertyMetaModel) {
        return propertyMetaModel.getContainingNodeMetaModel().getTypeName() + "#" + propertyMetaModel.getName();
    }

    static void createLabel(String name) {
        LABELS.put(name, LABELS.size());
    }

    static int getLabel(String name) {
        return LABELS.get(name);
    }

    static {
        for (BaseNodeMetaModel nodeMetaModel : JavaParserMetaModel.getNodeMetaModels()) {
            assert !nodeMetaModel.getAllPropertyMetaModels().isEmpty();
            createLabel(getTransformedName(nodeMetaModel));
            for (PropertyMetaModel propertyMetaModel : nodeMetaModel.getDeclaredPropertyMetaModels()) {
                createLabel(getTransformedName(propertyMetaModel));
            }
            Class<?> c = nodeMetaModel.getType();
            if (!Modifier.isAbstract(c.getModifiers())) {
                Class<?> p = c;
                while (p != null && !CONCRETE_CLASSES.containsKey(p)) {
                    CONCRETE_CLASSES.put(p, c);
                    p = p.getSuperclass();
                }
            }
        }
    }

    static final Set<String> ORDERED_LIST_PROPERTIES = Set.of(
        "arguments",
        "catchClauses",
        "entries",
        "initialization",
        "labels",
        "levels",
        "parameters",
        "resources",
        "statements",
        "thrownExceptions",
        "typeArguments",
        "typeParameters",
        "update",
        "values",
        "variables"
    );

    static ListNode generateListNode(Node node, PropertyMetaModel property) {
        List<Tree> children = new ArrayList<>();
        Object value = property.getValue(node);
        if (value != null) {
            for (Node child : (NodeList<?>) value) {
                children.add(generate(child));
            }
        }
        String name = getTransformedName(property);
        if (ORDERED_LIST_PROPERTIES.contains(property.getName())) {
            return new OrderedList(getLabel(name), name, children);
        } else {
            return new UnorderedList(getLabel(name), name, children);
        }
    }

    static UnorderedList generateOptionalNode(Node node, PropertyMetaModel property) {
        List<Tree> children = new ArrayList<>();
        Object value = property.getValue(node);
        if (value != null) {
            children.add(generate((Node) value));
        }
        String name = getTransformedName(property);
        return new UnorderedList(getLabel(name), name, children);
    }

    static Leaf generateLeaf(Node node, PropertyMetaModel property) {
        String name = getTransformedName(property);
        return new Leaf(getLabel(name), name, property.getValue(node).toString());
    }

    // TODO: compute identifier
    // TODO: record code position
    public static Tree generate(Node node) {
        List<Tree> children = new ArrayList<>();

        for (PropertyMetaModel property : node.getMetaModel().getAllPropertyMetaModels()) {
            Tree child;
            if (property.isNodeList()) {
                child = generateListNode(node, property);
            } else if (property.isOptional()) {
                child = generateOptionalNode(node, property);
            } else if (property.isAttribute()) {
                child = generateLeaf(node, property);
            } else {
                child = generate((Node) property.getValue(node));
            }
            children.add(child);
        }

        String name = getTransformedName(node.getMetaModel());
        return new Constructor(getLabel(name), name, children, node.getMetaModel());
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static Object parseAttribute(String value, Class<?> type) {
        if (type == String.class) {
            return value;
        }
        if (type == boolean.class) {
            return Boolean.parseBoolean(value);
        }
        if (type.isEnum()) {
            return Enum.valueOf((Class<Enum>) type, value);
        }
        throw new IllegalStateException();
    }

    static Object parseAttribute(Tree tree, PropertyMetaModel property) {
        return parseAttribute(((Leaf) tree).code, property.getType());
    }

    static Node constructConflictNode(List<Visitable> left, List<Visitable> right, Class<?> type) {
        Node node;
        try {
            Class<?> nodeClass = CONCRETE_CLASSES.get(type);
            node = (Node) nodeClass.getConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalStateException();
        }
        node.setData(CONFLICT_KEY, new ConflictWrapper(left, right));
        return node;
    }

    static Node constructConflictNode(Visitable left, Visitable right, Class<?> type) {
        return constructConflictNode(List.of(left), List.of(right), type);
    }

    public static class RestorationVisitor implements Tree.GenericVisitor<Visitable, Object> {
        @Override
        public Node visit(Constructor tree, Object arg) {
            Map<String, Object> leftParams = new HashMap<>();
            Map<String, Object> rightParams = new HashMap<>();
            List<PropertyMetaModel> properties = tree.meta.getAllPropertyMetaModels();
            assert properties.size() == tree.children.size();

            for (int i = 0; i < properties.size(); ++i) {
                PropertyMetaModel property = properties.get(i);
                Tree child = tree.childAt(i);

                Object value = null;
                if (property.isNodeList()) {
                    value = child.accept(this, property);
                } else if (property.isOptional()) {
                    if (!child.isEmpty()) {
                        assert child.children.size() == 1;
                        value = child.children.get(0).accept(this, property);
                    }
                } else if (property.isAttribute()) {
                    if (child.isConflict()) {
                        Conflict conflict = (Conflict) child;
                        assert conflict.left.size() == 1;
                        assert conflict.right.size() == 1;
                        leftParams.put(property.getName(), parseAttribute(conflict.left.get(0), property));
                        rightParams.put(property.getName(), parseAttribute(conflict.right.get(0), property));
                    } else {
                        value = parseAttribute(child, property);
                    }
                } else {
                    value = child.accept(this, property);
                }

                if (value != null) {
                    leftParams.put(property.getName(), value);
                    rightParams.put(property.getName(), value);
                }
            }

            Node left = tree.meta.construct(leftParams);
            if (leftParams.equals(rightParams)) {
                return left;
            }
            Node right = tree.meta.construct(rightParams);
            return constructConflictNode(left, right, tree.meta.getType());
        }

        @Override
        public NodeList<Node> visit(ListNode tree, Object arg) {
            NodeList<Node> nodeList = new NodeList<>();
            for (Tree child : tree.children) {
                nodeList.add((Node) child.accept(this, arg));
            }
            return nodeList;
        }

        @Override
        public Visitable visit(Conflict tree, Object arg) {
            // Currently assume a conflict is not a list
            List<Visitable> left = new ArrayList<>();
            List<Visitable> right = new ArrayList<>();
            for (Tree subtree : tree.left) {
                left.add(subtree.accept(this, null));
            }
            for (Tree subtree : tree.right) {
                right.add(subtree.accept(this, null));
            }
            return constructConflictNode(left, right, ((PropertyMetaModel) arg).getType());
        }
    }

    public static Node restore(Tree tree) {
        return (Node) tree.accept(new RestorationVisitor(), false);
    }
}
