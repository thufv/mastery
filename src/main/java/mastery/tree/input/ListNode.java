package mastery.tree.input;

import java.util.List;

public abstract class ListNode extends Node {
    protected ListNode(int label, String name, List<Node> children) {
        super(label, name, children);
    }
}
