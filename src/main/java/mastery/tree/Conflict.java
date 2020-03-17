package mastery.tree;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Conflict extends Tree {
    @Nullable
    public final Tree base;

    @Nullable
    public final Tree left;

    @Nullable
    public final Tree right;

    private Conflict(@Nullable Tree base, @Nullable Tree left, @Nullable Tree right) {
        super(-1, "?", List.of(left, right));
//                new Leaf(-1, "", "\n//////// Base\n"), base,
//                new Leaf(-1, "", "\n//////// Left\n"), left,
//                new Leaf(-1, "", "\n//////// Right\n"), right));
        this.base = base;
        this.left = left;
        this.right = right;
    }

    public static Conflict of(Tree base, Tree left, Tree right) {
        return new Conflict(base.deepCopy(), left.deepCopy(), right.deepCopy());
    }

    public static Conflict ofTwoWay(Tree left, Tree right) {
        return new Conflict(new Nothing(), left.deepCopy(), right.deepCopy());
    }

    public static Conflict ofLeft(Tree base, Tree left) {
        return new Conflict(base.deepCopy(), left.deepCopy(), new Nothing());
    }

    public static Conflict ofRight(Tree base, Tree right) {
        return new Conflict(base.deepCopy(), new Nothing(), right.deepCopy());
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
        return new Conflict(base == null ? null : base.deepCopy(),
                            left == null ? null : left.deepCopy(), right == null ? null : right.deepCopy());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConflict(this);
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
