package mastery.tree;

import java.util.Collections;

/**
 * A leaf node, i.e. a token.
 */
public class Leaf extends Tree {
    public final String value;

    public Leaf(int label, String name, String value) {
        super(label, name, Collections.emptyList());
        this.value = value;
    }

    @Override
    public boolean isLeaf() {
        return true;
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
        return false;
    }

    @Override
    public Tree deepCopy() {
        return new Leaf(label, name, value);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitLeaf(this);
    }

    @Override
    public <T> T accept(RichVisitor<T> visitor) {
        return visitor.visitLeaf(this);
    }

    @Override
    public String toString() {
        return name + " '" + value + "'";
    }
}
