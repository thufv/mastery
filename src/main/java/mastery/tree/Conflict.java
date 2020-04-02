package mastery.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conflict extends Tree {
    public final List<Tree> left;
    public final List<Tree> right;

    private Conflict(List<Tree> left, List<Tree> right) {
        super(-2, "<CONFLICT>");
        this.left = left;
        this.right = right;
    }

    public static Conflict of(Tree left, Tree right) {
        return new Conflict(List.of(left), List.of(right));
    }

    public static Conflict ofLeft(Tree left) {
        return new Conflict(List.of(left), Collections.emptyList());
    }

    public static Conflict ofRight(Tree right) {
        return new Conflict(Collections.emptyList(), List.of(right));
    }

    public static Conflict of(List<Tree> left, List<Tree> right) {
        return new Conflict(left, right);
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
    public Tree deepCopy() {
        var leftCopy = new ArrayList<Tree>();
        for (var node : left) {
            leftCopy.add(node.deepCopy());
        }

        var rightCopy = new ArrayList<Tree>();
        for (var node : right) {
            rightCopy.add(node.deepCopy());
        }

        return new Conflict(leftCopy, rightCopy);
    }

    @Override
    public boolean identicalTo(Tree that) {
        if (that.isConflict()) {
            Conflict c = (Conflict) that;
            if (left.size() != c.left.size() || right.size() != c.right.size()) {
                return false;
            }

            // zip(left.children, that.left.children).forall(_ isomorphicTo _)
            var it = left.iterator();
            var jt = c.left.iterator();
            while (it.hasNext()) {
                if (!it.next().identicalTo(jt.next())) {
                    return false;
                }
            }

            // zip(right.children, that.right.children).forall(_ isomorphicTo _)
            it = right.iterator();
            jt = c.right.iterator();
            while (it.hasNext()) {
                if (!it.next().identicalTo(jt.next())) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    @Override
    @SafeVarargs
    public final <C> void accept(Visitor<C> visitor, C... ctx) {
        visitor.visitConflict(this, ctx);
    }

    @Override
    public <T> T accept(RichVisitor<T> visitor) {
        return visitor.visitConflict(this);
    }

    @Override
    public String toString() {
        return "<CONFLICT>";
    }
}
