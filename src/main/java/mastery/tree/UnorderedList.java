package mastery.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * An unordered list assumes permutation of children is allowed.
 */
public class UnorderedList extends ListNode {
    public UnorderedList(int label, String name, List<Tree> children) {
        super(label, name, children);
    }

    @Override
    public boolean isOrderedList() {
        return false;
    }

    @Override
    public boolean isUnorderedList() {
        return true;
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
        visitor.visitUnorderedList(this);
    }

    @Override
    public <T> T accept(RichVisitor<T> visitor) {
        return visitor.visitUnorderedList(this);
    }

    @Override
    public String toString() {
        return name + " [unordered]";
    }
}
