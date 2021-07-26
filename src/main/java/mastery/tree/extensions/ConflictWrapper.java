package mastery.tree.extensions;

import com.github.javaparser.ast.DataKey;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.type.VoidType;

import java.util.List;
import java.util.stream.Stream;

public class ConflictWrapper {
    public static final DataKey<ConflictWrapper> CONFLICT_KEY = new DataKey<>() {
    };

    public List<Node> left;
    public List<Node> right;

    public ConflictWrapper(List<Node> left, List<Node> right) {
        this.left = left;
        this.right = right;
    }

    static Node constructEmpty(Class<? extends Node> nodeClass) {
        // There are few types have no public empty constructor:
        // - ArrayType
        // - IntersectionType
        // - ImportDeclaration
        if (Type.class.isAssignableFrom(nodeClass) || nodeClass == ImportDeclaration.class) {
            // VoidType is compatible with other subclasses of Type.
            // For ImportDeclaration, the actual class is unimportant.
            nodeClass = VoidType.class;
        }
        try {
            return nodeClass.getConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalStateException("cannot construct Node");
        }
    }

    public static Node construct(List<Node> left, List<Node> right) {
        Node child = Stream.concat(left.stream(), right.stream()).findAny().orElseThrow();
        Node node = constructEmpty(child.getMetaModel().getType());
        node.setData(CONFLICT_KEY, new ConflictWrapper(left, right));
        return node;
    }

    public static Node construct(Node left, Node right) {
        return construct(List.of(left), List.of(right));
    }
}
