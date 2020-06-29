package mastery.tree;

import java.util.Arrays;

public class FakeTree extends Tree {
    public FakeTree(Tree... trees) {
        super(-1, "", Arrays.asList(trees));
    }

    private RuntimeException unsupportedOperation() {
        return new UnsupportedOperationException("This method should not be called on a fake tree");
    }

    @Override
    public final Tree deepCopy() {
        return new FakeTree(this.children.toArray(new Tree[0]));
    }

    @Override
    public final boolean identicalTo(Tree that) {
        return false;
    }

    @Override
    @SuppressWarnings("unchecked")
    public final <C> void accept(Visitor<C> visitor, C... ctx) {
        throw unsupportedOperation();
    }

    @Override
    public final <T> T accept(RichVisitor<T> visitor) {
        throw unsupportedOperation();
    }

    @Override
    public final String toString() {
        return "FakeTree";
    }

    @Override
    public final boolean isLeaf() {
        return false;
    }

    @Override
    public final boolean isConstructor() {
        return false;
    }

    @Override
    public final boolean isOrderedList() {
        return false;
    }

    @Override
    public final boolean isUnorderedList() {
        return false;
    }

    @Override
    public final boolean isConflict() {
        return false;
    }
}