package mastery.tree.target;

import mastery.tree.input.Node;

public final class Deletion extends TargetNode {
    public final Node deleted;
    public final boolean left;

    private Deletion(Node deleted, boolean byLeft) {
        this.deleted = deleted;
        this.left = byLeft;
    }

    public static Deletion byLeft(Node base) {
        return new Deletion(base, true);
    }

    public static Deletion byRight(Node base) {
        return new Deletion(base, false);
    }
}
