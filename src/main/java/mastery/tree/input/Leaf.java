package mastery.tree.input;

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
    public String toString() {
        return name + " '" + value + "'";
    }
}
