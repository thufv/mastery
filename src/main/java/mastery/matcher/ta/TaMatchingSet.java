package mastery.matcher.ta;

import mastery.matcher.MatchingSet;
import mastery.tree.Tree;

public class TaMatchingSet extends MatchingSet {
    public TaMatchingSet(Tree base, Tree left, Tree right) {
        super(base, left, right);
    }

    @Override
    public final boolean treesEqual(Tree root1, Tree root2) {
        if (root1.assignment == -1 || root2.assignment == -1) {
            throw new IllegalStateException("Try to check the equivalence of some unassigned tree.");
        }
        return root1.height == root2.height && root1.assignment == root2.assignment;
    }
}