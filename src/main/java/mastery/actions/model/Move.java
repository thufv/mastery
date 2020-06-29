package mastery.actions.model;

import mastery.tree.Tree;

public class Move extends Addition {

    public Move(Tree node, Tree parent, int pos) {
        super(node, parent, pos);
    }

    @Override
    public String getName() {
        return "MOV";
    }
}
