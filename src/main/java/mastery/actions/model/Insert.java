package mastery.actions.model;

import mastery.tree.Tree;

public class Insert extends Addition {

    public Insert(Tree node, Tree parent, int pos) {
        super(node, parent, pos);
    }

    @Override
    public String getName() {
        return "INS";
    }

    @Override
    public String toString() {
        if (node.parent == null) return getName() + " root " + node;
        else return getName() + " " + node + " into " + parent + " at " + pos;
    }
}
