package mastery.tree.extensions;

import com.github.javaparser.ast.DataKey;
import com.github.javaparser.ast.Node;

import java.util.List;

public class ConflictWrapper {
    public static final DataKey<ConflictWrapper> CONFLICT_KEY = new DataKey<>() {
    };

    public List<Node> left;
    public List<Node> right;

    public ConflictWrapper(List<Node> left, List<Node> right) {
        this.left = left;
        this.right = right;
    }
}
