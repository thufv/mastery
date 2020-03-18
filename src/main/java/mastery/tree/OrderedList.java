package mastery.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * An ordered list assumes no permutation of children is allowed.
 */
public final class OrderedList extends ListNode {
    public OrderedList(int label, String name, List<Tree> children) {
        super(label, name, children);
    }

    @Override
    public boolean isOrderedList() {
        return true;
    }

    @Override
    public boolean isUnorderedList() {
        return false;
    }

    @Override
    public Tree deepCopy() {
        var copied = new ArrayList<Tree>();
        for (var child : children) {
            copied.add(child.deepCopy());
        }
        return new OrderedList(label, name, copied);
    }

    @Override
    public <C> void accept(Visitor<C> visitor, C... ctx) {
        visitor.visitOrderedList(this, ctx);
    }

    @Override
    public <T> T accept(RichVisitor<T> visitor) {
        return visitor.visitOrderedList(this);
    }

    @Override
    public String toString() {
        return name + " [ordered]";
    }
}
