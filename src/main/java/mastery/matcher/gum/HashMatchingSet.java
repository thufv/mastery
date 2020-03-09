package mastery.matcher.gum;

import mastery.tree.Tree;
import mastery.matcher.MatchingSet;

public class HashMatchingSet extends MatchingSet {
    public HashMatchingSet(Tree base, Tree left, Tree right) {
        super(base, left, right);
    }

    public final boolean treesEqual(Tree root1, Tree root2) {
        return root1.treeHash == root2.treeHash;
    }
}