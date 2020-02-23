package mastery.tree;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ConflictingNode extends Node {
    public ConflictingNode(Node base, @Nullable Node left, @Nullable Node right) {
        super(-1, "ConflictingNode", List.of(base, left, right));
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public boolean isConstructor() {
        return false;
    }

    @Override
    public String toString() {
        return null;
    }
}
