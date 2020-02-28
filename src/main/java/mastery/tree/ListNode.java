package mastery.tree;

import java.util.List;

/**
 * A list node, whose number of children is arbitrary.
 */
public abstract class ListNode extends Tree {
    protected ListNode(int label, String name, List<Tree> children) {
        super(label, name, children);
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
    public boolean isConflict() {
        return false;
    }
}
