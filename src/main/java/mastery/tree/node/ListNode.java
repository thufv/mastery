package mastery.tree.node;

import java.util.List;

public abstract class ListNode extends Node {
    protected ListNode(int label, String name, List<Node> children) {
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
