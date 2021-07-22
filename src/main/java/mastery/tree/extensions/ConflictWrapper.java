package mastery.tree.extensions;

import com.github.javaparser.ast.DataKey;
import com.github.javaparser.ast.visitor.Visitable;

import java.util.List;

public class ConflictWrapper {
    public static final DataKey<ConflictWrapper> CONFLICT_KEY = new DataKey<>() {
    };

    public List<Visitable> left;
    public List<Visitable> right;

    public ConflictWrapper(List<Visitable> left, List<Visitable> right) {
        this.left = left;
        this.right = right;
    }
}
