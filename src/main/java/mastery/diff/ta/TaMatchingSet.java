package mastery.diff.ta;

import mastery.diff.MatchingSet;
import mastery.tree.Tree;

public class TaMatchingSet extends MatchingSet {
    public TaMatchingSet(Tree base, Tree left, Tree right) {
        super(base, left, right);
    }

    @Override
    public final boolean treesEqual(Tree root1, Tree root2) {
        // TODO: implement
        return true;
    }
}