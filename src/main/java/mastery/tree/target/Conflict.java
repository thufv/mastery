package mastery.tree.target;

import mastery.tree.input.Node;
import org.jetbrains.annotations.Nullable;

public final class Conflict extends TargetNode {
    @Nullable
    public final Node base;

    @Nullable
    public final Node left;

    @Nullable
    public final Node right;

    private Conflict(@Nullable Node base, @Nullable Node left, @Nullable Node right) {
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
}
