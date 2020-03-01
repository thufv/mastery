package mastery.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * A constructor, i.e. an internal node that has a fixed number of children.
 * 
 * namasikanam: I don't like this ambiguous name.
 */
public class Constructor extends Tree {
    public final int arity;

    public Constructor(int label, String name, List<Tree> children) {
        super(label, name, children);
        this.arity = children.size();
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public boolean isConstructor() {
        return true;
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
        var copied = new ArrayList<Tree>();
        for (var child : children) {
            copied.add(child.deepCopy());
        }
        return new Constructor(label, name, copied);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConstructor(this);
    }

    @Override
    public <T> T accept(RichVisitor<T> visitor) {
        return visitor.visitConstructor(this);
    }

    @Override
    public String toString() {
        return name + " (" + arity + "-ary)";
    }
}
