package mastery.actions.model;

import mastery.tree.Tree;
// import mastery.tree.TreeContext;

public abstract class Action {

    protected Tree node;

    public Action(Tree node) {
        this.node = node;
    }

    public Tree getNode() {
        return node;
    }

    public void setNode(Tree node) {
        this.node = node;
    }

    public abstract String getName();
}
