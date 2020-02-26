package mastery.tree.input;

import java.util.List;

public class Constructor extends Node {
    public final int arity;

    public Constructor(int label, String name, List<Node> children) {
        super(label, name, children);
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
    public String toString() {
        return name + " (" + arity + "-ary)";
    }
}
