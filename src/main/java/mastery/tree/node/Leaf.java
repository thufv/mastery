package mastery.tree.node;

import java.util.Collections;

public class Leaf extends Node {
    public final String value;

    public Leaf(int label, String name, String value) {
        super(label, name, Collections.emptyList());
        this.value = value;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public boolean isConstructor() {
        return false;
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
    public boolean isConflict() {
        return false;
    }

    @Override
    public String toString() {
        return name + " '" + value + "'";
    }

    @Override
    public Node updated(Node target, Node replacement) {
        if (this == target) return replacement;
        return this;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitLeaf(this);
    }
}
