package mastery.matcher;

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

    public boolean treesEqual(Tree root1, Tree root2) {
        if (root1.assignment == -1 || root2.assignment == -1)
            throw new IllegalStateException("Try to check the equivalence of some unassigned tree.");
        return root1.assignment == root2.assignment;
    }

    public final boolean hasLeftMatch(Tree base) {
        return leftMatches.containsKey(base);
    }
    public final boolean hasRightMatch(Tree base) {
        return rightMatches.containsKey(base);
    }

    @SuppressWarnings("unchecked")
    public final <E extends Tree> E getLeftMatch(E base) {
        Tree leftMatch = leftMatches.get(base);
        if (leftMatch == null) return null;
        else if (base.getClass() == leftMatch.getClass()) return (E) leftMatch;
        else throw new IllegalStateException("class " + base.getClass().getName() + " and class " + leftMatch.getClass().getName() + " are mapped.");
    }

    @SuppressWarnings("unchecked")
    public final <E extends Tree> E getRightMatch(E base) {
        Tree rightMatch = rightMatches.get(base);
        if (rightMatch == null) return null;
        else if (base.getClass() == rightMatch.getClass()) return (E) rightMatch;
        else throw new IllegalStateException("class " + base.getClass().getName() + " and class " + rightMatch.getClass().getName() + " are mapped.");
    }

    public final boolean matched(Tree base, Tree variant) {
        return leftMatches.get(base) == variant || rightMatches.get(base) == variant;
    }

    public final int size() {
        return leftMatches.size() + rightMatches.size();
    }

    public final void setLeftMatch(Tree base, Tree left) {
        leftMatches.put(base, left);
    }

    public final void setRightMatch(Tree base, Tree right) {
        rightMatches.put(base, right);
    }

    private Map<Tree, Tree> leftMatches = new HashMap<>();
    private Map<Tree, Tree> rightMatches = new HashMap<>();
}
