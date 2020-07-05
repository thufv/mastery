package mastery.actions.model;

import mastery.tree.Tree;

public class Update extends Action {

    private String value;

    public Update(Tree node, String value) {
        super(node);
        this.value = value;
    }

    @Override
    public String getName() {
        return "UPD";
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return getName() + " " + node + " from " + node.name + " to " + value;
    }
}
