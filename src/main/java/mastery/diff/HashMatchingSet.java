package mastery.diff;

import mastery.tree.Tree;

import java.util.HashMap;
import java.util.Map;

public class HashMatchingSet extends MatchingSet {
    public HashMatchingSet(Tree base, Tree left, Tree right) {
        super(base, left, right);
        // TODO: compute hash values of these trees
    }

    @Override
    public boolean treesEqual(Tree tree1, Tree tree2) {
        return hashValues.get(tree1).equals(hashValues.get(tree2));
    }

    private Map<Tree, Integer> hashValues = new HashMap<>();
}
