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
        Tree copiedConstructor = new UnorderedList(label, name, copiedChildren);
        return copiedConstructor;
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
    public String toString() {
        return name + " [unordered] height " + height + " assignment " + assignment;
    }

    @Override
    public boolean identicalTo(Tree that) {
        System.out.println("Check " + this + " if identical to " + that);

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
            System.out.println("children.size = " + children.size() + ", that.children.size = " + that.children.size());
            return false;
        }

        children.sort(new AssignmentComparator());
        that.children.sort(new AssignmentComparator());

        System.out.print("Sorted children of " + this + ":");
        for (Tree child : children) {
            System.out.print(" " + child);
        }
        System.out.println("");

        System.out.print("Sorted children of " + that + ":");
        for (Tree child : that.children) {
            System.out.print(" " + child);
        }
        System.out.println("");


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
