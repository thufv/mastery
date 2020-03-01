package mastery.diff;

import mastery.tree.Tree;

import java.util.HashMap;
import java.util.Map;

public class MatchingSet {

    public final Tree base;
    public final Tree left;
    public final Tree right;

    public MatchingSet(Tree base, Tree left, Tree right) {
        this.base = base;
        this.left = left;
        this.right = right;
    }

    public final boolean treesEqual(Tree root1, Tree root2) {
        return root1.treeHash == root2.treeHash;
    }

    public final boolean hasLeftMatch(Tree base) {
        return leftMatches.containsKey(base);
    }

    public final boolean hasRightMatch(Tree base) {
        return rightMatches.containsKey(base);
    }

    public final <E extends Tree> E getLeftMatch(E base) {
        // TODO: unchecked mapping
        return (E) leftMatches.get(base);
    }

    public final <E extends Tree> E getRightMatch(E base) {
        // TODO: unchecked mapping
        return (E) rightMatches.get(base);
    }

    public final boolean matched(Tree base, Tree variant) {
        return leftMatches.get(base) == variant || rightMatches.get(base) == variant;
    }

    /**
     * Check if `variant` is <em>relevant</em> to `base`, i.e. it has a descendant (could be itself) `u` such that
     * `u` and `base` are matched.
     *
     * @param base    base Tree
     * @param variant Tree from left or right
     * @return if they are relevant
     */
    public final boolean relevant(Tree base, Tree variant) {
        var u = leftMatches.get(base);
        while (u != null) {
            if (u == variant) {
                return true;
            }
            u = u.getParent();
        }

        u = rightMatches.get(base);
        while (u != null) {
            if (u == variant) {
                return true;
            }
            u = u.getParent();
        }

        return false;
    }

    public final int size() {
        return leftMatches.size() + rightMatches.size();
    }

    final void setLeftMatch(Tree base, Tree left) {
        leftMatches.put(base, left);
    }

    final void setRightMatch(Tree base, Tree right) {
        rightMatches.put(base, right);
    }

    private Map<Tree, Tree> leftMatches = new HashMap<>();
    private Map<Tree, Tree> rightMatches = new HashMap<>();
}
