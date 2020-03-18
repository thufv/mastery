package mastery.tree;

/**
 * A leaf node, i.e. a token.
 */
public class Leaf extends Tree {
    public final String code;

    public Leaf(int label, String name, String code) {
        super(label, name);
        this.code = code;
    }

    @Override
    public final boolean isLeaf() {
        return true;
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

    @Override
    public final Tree deepCopy() {
        return new Leaf(label, name, code);
    }

    @Override
    public boolean identicalTo(Tree that) {
        if (that.isLeaf()) {
            Leaf leaf = (Leaf) that;
            return label == leaf.label && code.equals(leaf.code);
        }

        return false;
    }

    @Override
    public final <C> void accept(Visitor<C> visitor, C... ctx) {
        visitor.visitLeaf(this, ctx);
    }

    @Override
    public final <T> T accept(RichVisitor<T> visitor) {
        return visitor.visitLeaf(this);
    }

    @Override
    public String toString() {
        return name + " '" + code + "'";
    }
}
