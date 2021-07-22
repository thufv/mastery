package mastery.tree;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.metamodel.BaseNodeMetaModel;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import com.github.javaparser.metamodel.PropertyMetaModel;
import mastery.tree.extensions.ConflictWrapper;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static mastery.tree.extensions.ConflictWrapper.CONFLICT_KEY;

public final class TreeTransformer {
    private static final Map<String, Integer> LABELS = new HashMap<>();
    private static final Map<Class<?>, Class<?>> CONCRETE_CLASSES = new HashMap<>();

    static String getTransformedName(BaseNodeMetaModel nodeMetaModel) {
        return nodeMetaModel.getTypeName();
    }

    static String getTransformedName(Node node) {
        return getTransformedName(node.getMetaModel());
    }

    static String getTransformedName(PropertyMetaModel propertyMetaModel) {
        return propertyMetaModel.getContainingNodeMetaModel().getTypeName() + "#" + propertyMetaModel.getName();
    }

    static void createLabelFor(String name) {
        LABELS.put(name, LABELS.size());
    }

    static int getLabel(BaseNodeMetaModel baseNodeMetaModel) {
        return LABELS.get(getTransformedName(baseNodeMetaModel));
    }

    static int getLabel(Node node) {
        return getLabel(node.getMetaModel());
    }

    static int getLabel(PropertyMetaModel propertyMetaModel) {
        return LABELS.get(getTransformedName(propertyMetaModel));
    }

    static {
        for (BaseNodeMetaModel nodeMetaModel : JavaParserMetaModel.getNodeMetaModels()) {
            createLabelFor(getTransformedName(nodeMetaModel));
            for (PropertyMetaModel propertyMetaModel : nodeMetaModel.getDeclaredPropertyMetaModels()) {
                createLabelFor(getTransformedName(propertyMetaModel));
            }
            Class<?> c = nodeMetaModel.getType();
            if (!Modifier.isAbstract(c.getModifiers())) {
                while (true) {
                    Class<?> p = c.getSuperclass();
                    if (p == null || CONCRETE_CLASSES.containsKey(p)) {
                        break;
                    }
                    CONCRETE_CLASSES.put(p, c);
                }
            }
        }
    }

    static boolean isOrderedListProperty(PropertyMetaModel property) {
        if (property.isNodeList()) {
            return true; // TODO
        }
        return false;
    }

    static boolean isUnorderedListProperty(PropertyMetaModel property) {
        if (property.isNodeList()) {
            return false; // TODO
        }
        if (property.isNode()) {
            return property.isOptional();
        }
        return false;
    }

    static boolean isChildProperty(PropertyMetaModel property) {
        if (property.isAttribute()) {
            return property.getType() != boolean.class || property.is("value");
        }
        return true;
    }

    static OrderedList generateOrderedList(Node node, PropertyMetaModel property) {
        List<Tree> children = new ArrayList<>();
        Object value = property.getValue(node);
        if (value != null) {
            for (Node child : (NodeList<?>) value) {
                children.add(generate(child));
            }
        }
        return new OrderedList(
            getLabel(property),
            getTransformedName(property),
            children
        );
    }

    static UnorderedList generateUnorderedList(Node node, PropertyMetaModel property) {
        List<Tree> children = new ArrayList<>();
        Object value = property.getValue(node);
        if (value != null) {
            if (property.isNodeList()) {
                for (Node child : (NodeList<?>) value) {
                    children.add(generate(child));
                }
            } else {
                children.add(generate((Node) value));
            }
        }
        return new UnorderedList(
            getLabel(property),
            getTransformedName(property),
            children
        );
    }

    static Tree generateChild(Node node, PropertyMetaModel property) {
        if (property.isAttribute()) {
            return generateLeaf(node, property);
        }
        Object child = property.getValue(node);
        return generate((Node) child);
    }

    static Leaf generateLeaf(Node node) {
        return new Leaf(
            getLabel(node),
            getTransformedName(node),
            node.toString()
        );
    }

    static Leaf generateLeaf(Node node, PropertyMetaModel property) {
        return new Leaf(
            getLabel(property),
            getTransformedName(property),
            property.getValue(node).toString() // this may not be appropriate
        );
    }

    // TODO: handle simple property
    // TODO: compute identifier
    // TODO: record code position
    public static Tree generate(Node node) {
        List<Tree> children = new ArrayList<>();
        Map<String, Object> attributes = new HashMap<>();

        for (PropertyMetaModel property : node.getMetaModel().getAllPropertyMetaModels()) {
            if (isChildProperty(property)) {
                Tree child;
                if (isOrderedListProperty(property)) {
                    child = generateOrderedList(node, property);
                } else if (isUnorderedListProperty(property)) {
                    child = generateUnorderedList(node, property);
                } else {
                    child = generateChild(node, property);
                }
                children.add(child);
            }
            if (property.isAttribute()) {
                attributes.put(property.getName(), property.getValue(node));
            }
        }

        if (children.isEmpty()) {
            return generateLeaf(node);
        }

        Constructor constructor = new Constructor(
            getLabel(node),
            getTransformedName(node),
            children
        );
        constructor.nodeMetaModel = node.getMetaModel();
        constructor.attributes = attributes;
        return constructor;
    }

    public static class RestorationVisitor implements Tree.GenericVisitor<Visitable, Object> {
        @Override
        public Node visit(Constructor tree, Object arg) {
            int i = 0;
            Map<String, Object> parameters = tree.attributes;
            for (PropertyMetaModel property : tree.nodeMetaModel.getAllPropertyMetaModels()) {
                if (isChildProperty(property)) {
                    Tree child = tree.childAt(i++);
                    if (property.isNodeList()) {
                        parameters.put(property.getName(), child.accept(this, property));
                    } else if (isUnorderedListProperty(property)) {
                        if (!child.children.isEmpty()) {
                            assert child.children.size() == 1;
                            parameters.put(property.getName(), child.children.get(0).accept(this, property));
                        }
                    } else {
                        //noinspection StatementWithEmptyBody
                        if (property.isAttribute()) {
                        } else {
                            parameters.put(property.getName(), child.accept(this, property));
                        }
                    }
                }
            }
            return tree.nodeMetaModel.construct(parameters);
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
            try {
                Class<?> nodeClass = CONCRETE_CLASSES.get(((PropertyMetaModel) arg).getType());
                Node node = (Node) nodeClass.getConstructor().newInstance();
                node.setData(CONFLICT_KEY, new ConflictWrapper(left, right));
                return node;
            } catch (Exception e) {
                throw new IllegalStateException();
            }
        }
    }

    public static Node restore(Tree tree) {
        return (Node) tree.accept(new RestorationVisitor(), false);
    }
}
