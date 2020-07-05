package mastery.actions.model;

import mastery.tree.Tree;

public abstract class Addition extends Action {

    protected Tree parent;

    protected int pos;

    public Addition(Tree node, Tree parent, int pos) {
        super(node);
        this.parent = parent;
        this.pos = pos;
    }

    public Tree getParent() {
        return parent;
    }

    public int getPosition() {
        return pos;
    }

    @Override
    public String toString() {
        return getName() + " " + node + " to " + parent + " at " + pos;
    }
}
