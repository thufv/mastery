package mastery.tree.node;

import java.util.ArrayList;
import java.util.List;

public class OrderedList extends ListNode {
    public OrderedList(int label, String name, List<Node> children) {
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
    public String toString() {
        return name + " [ordered]";
    }

    @Override
    public Node updated(Node target, Node replacement) {
        if (this == target) return replacement;

        var cs = new ArrayList<Node>();
        for (var child : children) {
            cs.add(child.updated(target, replacement));
        }
        return new OrderedList(label, name, cs);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitOrderedList(this);
    }
}
