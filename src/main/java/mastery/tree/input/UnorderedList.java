package mastery.tree.input;

import java.util.List;

public class UnorderedList extends ListNode {
    public UnorderedList(int label, String name, List<Node> children) {
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
        return name + " [unordered]";
    }
}
