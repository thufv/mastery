package mastery.tree;

//import org.eclipse.jdt.core.dom.*;
import com.github.javaparser.ast.*;
import com.github.javaparser.metamodel.BaseNodeMetaModel;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import com.github.javaparser.metamodel.PropertyMetaModel;

import java.lang.reflect.Method;
import java.util.*;

public final class TreeTransformer {
    private static final Set<String> ORDERED_LIST_PROPERTY_IDS = Set.of(
//        "arguments",
//        "catchClauses",
//        "dimensions",
//        "enumConstants",
//        "expressions",
//        "extendedOperands",
//        "extraDimensions2",
//        "fragments",
//        "implementations",
//        "initializers",
//        "moduleDirectives",
//        "modules",
//        "parameters",
//        "recordComponents",
//        "resources",
//        "statements",
//        "tags",
//        "typeArguments",
//        "typeParameters",
//        "updaters",
//        "values"
    );

    private static final Map<String, Integer> LABELS = new HashMap<>();

    private static String getTransformedName(BaseNodeMetaModel nodeMetaModel) {
        return nodeMetaModel.getTypeName();
    }

    private static String getTransformedName(Node node) {
        return getTransformedName(node.getMetaModel());
    }

    private static String getTransformedName(PropertyMetaModel propertyMetaModel) {
        return propertyMetaModel.getContainingNodeMetaModel().getTypeName() + "#" + propertyMetaModel.getName();
    }

    private static void addLabel(String name) {
        LABELS.put(name, LABELS.size());
    }

    private static int getLabel(BaseNodeMetaModel baseNodeMetaModel) {
        return LABELS.get(getTransformedName(baseNodeMetaModel));
    }

    private static int getLabel(Node node) {
        return getLabel(node.getMetaModel());
    }

    private static int getLabel(PropertyMetaModel propertyMetaModel) {
        return LABELS.get(getTransformedName(propertyMetaModel));
    }

    static {
        for (BaseNodeMetaModel nodeMetaModel : JavaParserMetaModel.getNodeMetaModels()) {
            addLabel(getTransformedName(nodeMetaModel));
            for (PropertyMetaModel propertyMetaModel : nodeMetaModel.getDeclaredPropertyMetaModels()) {
                addLabel(getTransformedName(propertyMetaModel));
            }
        }
    }

    private final String sourceCode;

    public TreeTransformer(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    private static boolean isOrderedListProperty(PropertyMetaModel property) {
        if (property.isNodeList()) {
//            return ORDERED_LIST_PROPERTY_IDS.contains(property.getName());
            return true;
        }
        return false;
    }

    private static boolean isUnorderedListProperty(PropertyMetaModel property) {
        if (property.isNodeList()) {
//            return !ORDERED_LIST_PROPERTY_IDS.contains(property.getName());
            return false;
        }
        if (property.isNode()) {
            return property.isOptional();
        }
        return false;
    }

    private static boolean isChildProperty(PropertyMetaModel property) {
        if (property.isAttribute()) {
            return property.getType() != boolean.class || property.is("value");
        }
        return true;
    }

    private OrderedList generateOrderedList(Node node, PropertyMetaModel property) {
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

    private UnorderedList generateUnorderedList(Node node, PropertyMetaModel property) {
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

    private Tree generateChild(Node node, PropertyMetaModel property) {
        if (property.isAttribute()) {
            return generateLeaf(node, property);
        }
        Object child = property.getValue(node);
        return generate((Node) child);
    }

    private Leaf generateLeaf(Node node) {
        return new Leaf(
            getLabel(node),
            getTransformedName(node),
            node.toString()
        );
    }

    private Leaf generateLeaf(Node node, PropertyMetaModel property) {
        return new Leaf(
            getLabel(property),
            getTransformedName(property),
            property.getValue(node).toString()
        );
    }

    NodeList<Node> restoreNodeList(Tree tree) {
        NodeList<Node> nodeList = new NodeList<>();
        for (Tree child : tree.children) {
            nodeList.add(restore((Constructor) child));
        }
        return nodeList;
    }

    Node restore(Constructor tree) {
        int i = 0;
        Map<String, Object> parameters = tree.attributes;
        for (PropertyMetaModel property : tree.nodeMetaModel.getAllPropertyMetaModels()) {
            if (isChildProperty(property)) {
                Tree child = tree.childAt(i++);
                if (property.isNodeList()) {
                    parameters.put(property.getName(), restoreNodeList(child));
                } else if (isUnorderedListProperty(property)) {
                    if (!child.children.isEmpty()) {
                        assert child.children.size() == 1;
                        parameters.put(property.getName(), restore((Constructor) child.children.get(0)));
                    }
                } else {
                    //noinspection StatementWithEmptyBody
                    if (property.isAttribute()) {
                    } else {
                        parameters.put(property.getName(), restore((Constructor) child));
                    }
                }
            }
        }
        return tree.nodeMetaModel.construct(parameters);
    }

    public Tree generate(Node node) {
        List<Tree> children = new ArrayList<>();
        String identifier = null;
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
//                    if (property.is("name")) {
//                        // child must be a constructor node
//                        identifier = sourceCode.substring(child.startPos, child.endPos);
//                    }
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
}
