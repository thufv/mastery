package mastery.tree;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.metamodel.BaseNodeMetaModel;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import com.github.javaparser.metamodel.PropertyMetaModel;
import mastery.tree.extensions.ConflictWrapper;
import mastery.tree.extensions.RawNode;

import java.util.*;

public final class TreeTransformer {
    private static final Map<String, Integer> LABELS = new HashMap<>();

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
        }
    }

    static ListNode generateListNode(Node node, PropertyMetaModel property) {
        List<Tree> children = new ArrayList<>();
        Object value = property.getValue(node);
        if (value != null) {
            for (Node child : (NodeList<?>) value) {
                children.add(generate(child));
            }
        }
        String name = getTransformedName(property);
        if (MetaModel.isOrderedList(property)) {
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
        String value = property.getValue(node).toString();
        String identifier = property.is("identifier") ? value : null;
        return new Leaf(getLabel(name), name, value, identifier);
    }

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

    // restore just for printing
    public static class RestorationVisitor implements Tree.GenericVisitor<Visitable, Void> {
        @Override
        public Node visit(Constructor tree, Void arg) {
            Map<String, Object> leftParams = new HashMap<>();
            Map<String, Object> rightParams = new HashMap<>();
            List<PropertyMetaModel> properties = tree.meta.getAllPropertyMetaModels();
            assert properties.size() == tree.children.size();

            for (int i = 0; i < properties.size(); ++i) {
                PropertyMetaModel property = properties.get(i);
                Tree child = tree.childAt(i);

                Object value = null;
                if (property.isNodeList()) {
                    if (!child.isEmpty() || !property.isOptional()) {
                        value = child.accept(this, arg);
                    }
                } else if (property.isOptional()) {
                    if (!child.isEmpty()) {
                        assert child.children.size() == 1;
                        value = child.children.get(0).accept(this, arg);
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
                    value = child.accept(this, arg);
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
            return ConflictWrapper.construct(left, right);
        }

        public NodeList<Node> fromList(List<Tree> children, Void arg) {
            return children.stream()
                .map(child -> (Node) child.accept(this, arg))
                .collect(NodeList.toNodeList());
        }

        @Override
        public NodeList<Node> visit(ListNode tree, Void arg) {
            return fromList(tree.children, arg);
        }

        /**
         * A conflict must be either a member of a node list or a property that is not a node list.
         * Children of a Conflict must be either all Constructor or all Leaf.
         * Leaf children are handled above, so children here are all Constructor.
         *
         * Update: It seems the above does not always hold. A workaround is now used.
         */
        @Override
        public Visitable visit(Conflict tree, Void arg) {
            if (tree.getAny() instanceof ListNode) {
                assert tree.left.size() == 1;
                assert tree.right.size() == 1;
                Conflict conflict = Conflict.wrap(tree.left.get(0).children, tree.right.get(0).children);
                return fromList(List.of(conflict), arg);
            }
            List<Node> left = new ArrayList<>();
            List<Node> right = new ArrayList<>();
            for (Tree subtree : tree.left) {
                left.add((Node) subtree.accept(this, arg));
            }
            for (Tree subtree : tree.right) {
                right.add((Node) subtree.accept(this, arg));
            }
            return ConflictWrapper.construct(left, right);
        }

        /**
         * Only called when restoring a single leaf or a conflict of two leaves.
         */
        @Override
        public Visitable visit(Leaf tree, Void arg) {
            return new RawNode(tree.code);
        }
    }

    public static Visitable restore(Tree tree) {
        return tree.accept(new RestorationVisitor(), null);
    }
}
