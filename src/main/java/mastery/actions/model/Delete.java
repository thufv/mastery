package mastery.actions.model;

import mastery.tree.Tree;

public class Delete extends Action {

    public Delete(Tree node) {
        super(node);
    }

    @Override
    public String getName() {
        return "DEL";
    }
}
