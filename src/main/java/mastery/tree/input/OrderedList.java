package mastery.tree.input;

import java.util.List;

public class OrderedList extends ListNode {
    public OrderedList(int label, String name, List<Node> children) {
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
    public String toString() {
        return name + " [ordered]";
    }
}
