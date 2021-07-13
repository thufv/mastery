package mastery.tree;

import org.eclipse.jdt.core.dom.*;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public final class TreeTransformer {
    private static final Set<String> ORDERED_LIST_PROPERTY_IDS = Set.of(
        "arguments",
        "catchClauses",
        "dimensions",
        "enumConstants",
        "expressions",
        "extendedOperands",
        "extraDimensions2",
        "fragments",
        "implementations",
        "initializers",
        "moduleDirectives",
        "modules",
        "parameters",
        "recordComponents",
        "resources",
        "statements",
        "tags",
        "typeArguments",
        "typeParameters",
        "updaters",
        "values"
    );

    private static final Map<String, Integer> LIST_PROPERTY_LABELS = new HashMap<>();

    private static String getCompoundName(Object property, Class<?> nodeClass) {
        return String.format("%s@%s", ((StructuralPropertyDescriptor) property).getId(), nodeClass.getSimpleName());
    }

    static {
        int nodeCode = 1;
        List<String> listPropertyNames = new ArrayList<>();
        for (; ; ++nodeCode) {
            try {
                Class<?> nodeClass = ASTNode.nodeClassForType(nodeCode);
                Method method = nodeClass.getMethod("propertyDescriptors", int.class);
                List<?> properties = (List<?>) method.invoke(null, AST.JLS_Latest);
                assert !properties.isEmpty();
                for (Object property : properties) {
                    if (property instanceof ChildListPropertyDescriptor) {
                        listPropertyNames.add(getCompoundName(property, nodeClass));
                    } else if (property instanceof ChildPropertyDescriptor) {
                        if (!((ChildPropertyDescriptor) property).isMandatory()) {
                            listPropertyNames.add(getCompoundName(property, nodeClass));
                        }
                    } else //noinspection StatementWithEmptyBody
                        if (property instanceof SimplePropertyDescriptor) {
//                        if (!((SimplePropertyDescriptor) property).isMandatory()) {
//                            listPropertyNames.add(getCompoundName(property, nodeClass));
//                        }
                    } else {
                        throw new IllegalStateException("Bad Property");
                    }
                }
            } catch (IllegalArgumentException e) {
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < listPropertyNames.size(); ++i) {
            LIST_PROPERTY_LABELS.put(listPropertyNames.get(i), i + nodeCode);
        }
    }

    private final String sourceCode;

    TreeTransformer(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    private Leaf generateLeaf(ASTNode node) {
        String name = node.getClass().getSimpleName();
        int label = node.getNodeType();
        int startPos = node.getStartPosition();
        int endPos = startPos + node.getLength();
        Leaf leaf = new Leaf(label, name, sourceCode.substring(startPos, endPos));
        leaf.startPos = startPos;
        leaf.endPos = endPos;
        return leaf;
    }

    public Tree generate(ASTNode node) {
        // TODO: handle SimpleProperty (currently ignored)
        List<?> properties = node.structuralPropertiesForType();
        List<StructuralPropertyDescriptor> childProperties = properties.stream()
            .map(StructuralPropertyDescriptor.class::cast)
            .filter(it -> !it.isSimpleProperty())
            .filter(it -> {
                Object v = node.getStructuralProperty(it);
                return v != null && (!(v instanceof List) || !((List<?>) v).isEmpty());
            })
            .collect(Collectors.toList());
        if (childProperties.isEmpty()) {
            return generateLeaf(node);
        }

        List<Tree> subtrees = new ArrayList<>();
        for (StructuralPropertyDescriptor property : childProperties) {
            String name = getCompoundName(property, node.getClass());
            Integer label = LIST_PROPERTY_LABELS.get(name);
            if (property instanceof ChildListPropertyDescriptor) {
                List<Tree> children = ((List<?>) node.getStructuralProperty(property)).stream()
                    .map(ASTNode.class::cast)
                    .map(this::generate)
                    .collect(Collectors.toList());
                if (!children.isEmpty()) {
                    Tree subtree;
                    if (ORDERED_LIST_PROPERTY_IDS.contains(property.getId())) {
                        subtree = new OrderedList(label, name, children);
                    } else {
                        subtree = new UnorderedList(label, name, children);
                    }
                    subtree.startPos = children.get(0).startPos;
                    subtree.endPos = children.get(children.size() - 1).endPos;
                    subtrees.add(subtree);
                }
            } else if (property instanceof ChildPropertyDescriptor) {
                Tree child = generate((ASTNode) node.getStructuralProperty(property));
                if (!((ChildPropertyDescriptor) property).isMandatory()) {
                    Tree subtree = new UnorderedList(label, name, new ArrayList<>(List.of(child)));
                    subtree.startPos = child.startPos;
                    subtree.endPos = child.endPos;
                    subtrees.add(subtree);
                } else {
                    subtrees.add(child);
                }
            } else {
                throw new IllegalStateException("Bad Property");
            }
        }

        if (subtrees.isEmpty()) {
            throw new IllegalStateException("No Subtree");
        }
        String name = node.getClass().getSimpleName();
        int label = node.getNodeType();
        Tree tree = new Constructor(label, name, subtrees);
        tree.startPos = subtrees.get(0).startPos;
        tree.endPos = subtrees.get(subtrees.size() - 1).endPos;
        return tree;
    }
}
