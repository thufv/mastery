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
        var copiedChildren = new ArrayList<Tree>();
        for (var child : children) {
            copiedChildren.add(child.deepCopy());
        }
        Tree copiedOrderedList = new OrderedList(label, name, copiedChildren);
        copiedOrderedList.assignment = assignment;
        copiedOrderedList.actionId = actionId;
        copiedOrderedList.dfsIndex = dfsIndex;
        return copiedOrderedList;
    }

    @Override
    @SafeVarargs
    public final <C> void accept(Visitor<C> visitor, C... ctx) {
        visitor.visitOrderedList(this, ctx);
    }

    @Override
    public <T> T accept(RichVisitor<T> visitor) {
        return visitor.visitOrderedList(this);
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public String toString() {
        return name + " [ordered] assignment " + assignment;
    }
}
