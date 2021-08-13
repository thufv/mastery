package mastery.tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * An unordered list assumes permutation of children is allowed.
 */
public final class UnorderedList extends ListNode {
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
        var copiedChildren = new ArrayList<Tree>();
        for (var child : children) {
            copiedChildren.add(child.deepCopy());
        }
        Tree copiedUnorderedList = new UnorderedList(label, name, copiedChildren);
        copiedUnorderedList.assignment = assignment;
        copiedUnorderedList.actionId = actionId;
        copiedUnorderedList.dfsIndex = dfsIndex;
        return copiedUnorderedList;
    }

    @Override
    @SafeVarargs
    public final <C> void accept(Visitor<C> visitor, C... ctx) {
        visitor.visitUnorderedList(this, ctx);
    }

    @Override
    public <T> T accept(RichVisitor<T> visitor) {
        return visitor.visitUnorderedList(this);
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public String toString() {
        return name + " [unordered] assignment " + assignment
            + (interval != null ? " dfs [" + interval.l + ", " + interval.r + "]" : "")
            ;
    }

    // This method is only for debug
    @Override
    public boolean identicalTo(Tree that) {
        if (label != that.label) {
            return false;
        }
        if (height != that.height) {
            return false;
        }
        if (size != that.size) {
            return false;
        }
        if (children.size() != that.children.size()) {
            return false;
        }

        children.sort(new AssignmentComparator());
        that.children.sort(new AssignmentComparator());

        var it = children.iterator();
        var jt = that.children.iterator();
        while (it.hasNext()) {
            if (!it.next().identicalTo(jt.next())) {
                return false;
            }
        }

        return true;
    }

    private class AssignmentComparator implements Comparator<Tree> {
        @Override
        public int compare(Tree o1, Tree o2) {
            return  Integer.compare(o1.assignment, o2.assignment);
        }
    }
}
