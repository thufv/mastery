package mastery.tree.node;

import java.util.ArrayList;
import java.util.List;

public class Constructor extends Node {
    public final int arity;

    public Constructor(int label, String name, List<Node> children, int depth) {
        super(label, name, children, depth);
        this.arity = children.size();
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public boolean isConstructor() {
        return true;
    }

    @Override
    public boolean isOrderedList() {
        return false;
    }

    @Override
    public boolean isUnorderedList() {
        return false;
    }

    @Override
    public String toString() {
        return name + " (" + arity + "-ary)";
    }

    @Override
    public Node updated(Node target, Node replacement) {
        if (this == target) return replacement;

        var cs = new ArrayList<Node>();
        for (var child : children) {
            cs.add(child.updated(target, replacement));
        }
        return new Constructor(label, name, cs, depth);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitConstructor(this);
    }

}
