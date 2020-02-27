package mastery.tree.node;

import java.util.List;

public abstract class ListNode extends Node {
    protected ListNode(int label, String name, List<Node> children, int depth) {
        super(label, name, children, depth);
    }
}
