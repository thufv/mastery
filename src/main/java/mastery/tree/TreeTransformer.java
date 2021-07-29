package mastery.tree;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.expr.Name;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.metamodel.BaseNodeMetaModel;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import com.github.javaparser.metamodel.PropertyMetaModel;
import mastery.driver.Config.ParserConfig;
import mastery.tree.extensions.ConflictWrapper;
import mastery.tree.extensions.RawNode;

import java.util.*;

public final class TreeTransformer {
    public static final String QUALIFIED_NAME = "QualifiedName";
    public static final String QUALIFIED_NAME_IDENTIFIER = "QualifiedName#identifier";
    public static final String NULL_LIST_INDICATOR = "NullListIndicator";

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
        createLabel(QUALIFIED_NAME);
        createLabel(QUALIFIED_NAME_IDENTIFIER);
        createLabel(NULL_LIST_INDICATOR);
    }

    final ParserConfig config;

    public TreeTransformer(ParserConfig config) {
        this.config = config;
    }

    ListNode generateListNode(Node node, PropertyMetaModel property) {
        List<Tree> children = new ArrayList<>();
        Object value = property.getValue(node);
        if (value != null) {
            for (Node child : (NodeList<?>) value) {
                children.add(generate(child));
            }
        } else {
            children.add(leafOf(NULL_LIST_INDICATOR, "", false));
        }
        String name = getTransformedName(property);
        if (MetaModel.isOrderedList(property)) {
            return new OrderedList(getLabel(name), name, children);
        } else {
            return new UnorderedList(getLabel(name), name, children);
        }
    }

    UnorderedList generateOptionalNode(Node node, PropertyMetaModel property) {
        List<Tree> children = new ArrayList<>();
        Object value = property.getValue(node);
        if (value != null) {
            children.add(generate((Node) value));
        }
        String name = getTransformedName(property);
        return new UnorderedList(getLabel(name), name, children);
    }

    static Leaf leafOf(String name, String value, boolean isIdentifier) {
        return new Leaf(getLabel(name), name, value, isIdentifier);
    }

    static Leaf generateLeaf(Node node, PropertyMetaModel property) {
        String name = getTransformedName(property);
        String value = property.getValue(node).toString();
        return leafOf(name, value, property.is("identifier"));
    }

    static Constructor generateQualifiedName(String name) {
        return new Constructor(
            getLabel(QUALIFIED_NAME),
            QUALIFIED_NAME,
            List.of(leafOf(QUALIFIED_NAME_IDENTIFIER, name, true))
        );
    }

    // TODO: record code position
    public Tree generate(Node node) {
        if (node instanceof Name) {
            return generateQualifiedName(((Name) node).asString());
        }

        List<PropertyMetaModel> properties = node.getMetaModel().getAllPropertyMetaModels();
        if (!config.keepComment) {
            properties.removeIf(p -> p.is("comment"));
        }

        List<Tree> children = new ArrayList<>();
        for (PropertyMetaModel property : properties) {
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
        if (children.isEmpty()) {
            return new Leaf(getLabel(name), name, node.toString(), node.getMetaModel());
        } else {
            return new Constructor(getLabel(name), name, children, node.getMetaModel());
        }
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

    static Node constructNode(BaseNodeMetaModel nodeMetaModel, Map<String, Object> parameters) {
        return nodeMetaModel.construct(parameters)
            .setComment((Comment) parameters.get("comment"));
    }

    // restore just for printing
    public static class RestorationVisitor implements Tree.GenericVisitor<Visitable, Void> {
        @Override
        public Node visit(Constructor tree, Void arg) {
            if (tree.is(QUALIFIED_NAME)) {
                return StaticJavaParser.parseName(((Leaf) tree.getOnlyChild()).code);
            }

            Map<String, Object> leftParams = new HashMap<>();
            Map<String, Object> rightParams = new HashMap<>();
            List<PropertyMetaModel> properties = tree.meta.getAllPropertyMetaModels();
            if (!tree.hasComment()) {
                properties.removeIf(p -> p.is("comment"));
            }
            assert properties.size() == tree.children.size();

            for (int i = 0; i < properties.size(); ++i) {
                PropertyMetaModel property = properties.get(i);
                Tree child = tree.childAt(i);

                Object value = null;
                if (property.isNodeList()) {
                    if (child.children.stream().noneMatch(c -> c.is(NULL_LIST_INDICATOR))) {
                        value = child.accept(this, arg);
                    }
                } else if (property.isOptional()) {
                    if (!child.isEmpty()) {
                        value = child.getOnlyChild().accept(this, arg);
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

            Node left = constructNode(tree.meta, leftParams);
            if (leftParams.equals(rightParams)) {
                return left;
            }
            Node right = constructNode(tree.meta, rightParams);
            return ConflictWrapper.construct(left, right);
        }

        public NodeList<Node> fromList(List<Tree> children, Void arg) {
            return children.stream()
                .map(c -> (Node) c.accept(this, arg))
                .collect(NodeList.toNodeList());
        }

        @Override
        public NodeList<Node> visit(ListNode tree, Void arg) {
            return fromList(tree.children, arg);
        }

        /**
         * A conflict can be a member of a node list containing a sublist.
         * If a conflict is a node list property, it will be converted to this case.
         * After the conversion, children of a conflict must be either all Constructor or all Leaf.
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

        @Override
        public Visitable visit(Leaf tree, Void arg) {
            if (tree.meta != null) {
                return tree.meta.construct(Collections.emptyMap());
            }
            // not reached when restoring a constructor
            return new RawNode(tree.code);
        }
    }

    public static Visitable restore(Tree tree) {
        return tree.accept(new RestorationVisitor(), null);
    }
}
