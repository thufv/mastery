package mastery.tree.target;

import mastery.tree.input.Node;

public class Insertion extends TargetNode {
    public final Node inserted;
    public final boolean left;

    private Insertion(Node inserted, boolean fromLeft) {
        this.inserted = inserted;
        this.left = fromLeft;
    }

    public static Insertion fromLeft(Node left) {
        return new Insertion(left, true);
    }

    public static Insertion fromRight(Node right) {
        return new Insertion(right, false);
    }

    public static Insertion fromLeftLift(Node left, Node from, TargetNode to) {
        // TODO
        return null;
    }

    public static Insertion fromRightLift(Node right, Node from, TargetNode to) {
        // TODO
        return null;
    }
}
