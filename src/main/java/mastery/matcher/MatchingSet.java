package mastery.matcher;

import mastery.tree.Tree;
import mastery.util.Interval;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

public abstract class MatchingSet {

    public final Tree base;
    public final Tree left;
    public final Tree right;

    public MatchingSet(Tree base, Tree left, Tree right) {
        this.base = base;
        this.left = left;
        this.right = right;
    }

    public abstract boolean treesEqual(Tree root1, Tree root2);

    public final boolean hasLeftMatch(Tree base) {
        return leftMatches.containsKey(base);
    }

    public final boolean hasRightMatch(Tree base) {
        return rightMatches.containsKey(base);
    }

    public final <E extends Tree> E getLeftMatch(E base) {
      Tree leftMatch = leftMatches.get(base);
      if (base.getClass() == leftMatch.getClass()) {
          return (E) leftMatch;
      }
      else {
          throw new IllegalStateException("class " + base.getClass().getName() + " and class " + leftMatch.getClass().getName() + " are mapped.");
      }
    }

    public final <E extends Tree> E getRightMatch(E base) {
        Tree rightMatch = rightMatches.get(base);
        if (base.getClass() == rightMatch.getClass()) {
            return (E) rightMatch;
        }
        else {
            throw new IllegalStateException("class " + base.getClass().getName() + " and class " + rightMatch.getClass().getName() + " are mapped.");
        }
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
        assertNotNull(variant);

        var u = leftMatches.get(base);
        if (u != null && Interval.isSubinterval(u.interval, variant.interval)) {
            return true;
        }

        u = rightMatches.get(base);
        if (u != null && Interval.isSubinterval(u.interval, variant.interval)) {
            return true;
        }

        return false;
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
