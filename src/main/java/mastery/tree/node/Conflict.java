package mastery.tree.node;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Conflict extends Node {
    @Nullable
    public final Node base;

    @Nullable
    public final Node left;

    @Nullable
    public final Node right;

    private Conflict(@Nullable Node base, @Nullable Node left, @Nullable Node right) {
        super(-1, "?", List.of(base, left, right));
        this.base = base;
        this.left = left;
        this.right = right;
    }

    public static Conflict of(Node base, Node left, Node right) {
        return new Conflict(base, left, right);
    }

    public static Conflict ofTwoWay(Node left, Node right) {
        return new Conflict(null, left, right);
    }

    public static Conflict ofLeft(Node base, Node left) {
        return new Conflict(base, left, null);
    }

    public static Conflict ofRight(Node base, Node right) {
        return new Conflict(base, null, right);
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
    public boolean isOrderedList() {
        return false;
    }

    @Override
    public boolean isUnorderedList() {
        return false;
    }

    @Override
    public boolean isConflict() {
        return true;
    }

    @Override
    public String toString() {
        return "<CONFLICT>";
    }

    @Override
    public Node updated(Node target, Node replacement) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return null;
    }
}
