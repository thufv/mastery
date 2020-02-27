package mastery.diff;

import mastery.tree.node.Node;
import mastery.tree.node.Tree;

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

    public final boolean treesEqual(Node root1, Node root2) {
        return root1.treeHash == root2.treeHash;
    }

    public final boolean hasLeftMatch(Node base) {
        return leftMatches.containsKey(base);
    }

    public final boolean hasRightMatch(Node base) {
        return rightMatches.containsKey(base);
    }

    public final <E extends Node> E getLeftMatch(E base) {
        return (E) leftMatches.get(base);
    }

    public final <E extends Node> E getRightMatch(E base) {
        return (E) rightMatches.get(base);
    }

    public final boolean matched(Node base, Node variant) {
        return leftMatches.get(base) == variant || rightMatches.get(base) == variant;
    }

    /**
     * Check if `variant` is <em>relevant</em> to `base`, i.e. it has a descendant (could be itself) `u` such that
     * `u` and `base` are matched.
     *
     * @param base    base node
     * @param variant node from left or right
     * @return if they are relevant
     */
    public final boolean relevant(Node base, Node variant) {
        var u = leftMatches.get(base);
        while (u != null) {
            if (u == variant) {
                return true;
            }
            u = u.parent;
        }

        u = rightMatches.get(base);
        while (u != null) {
            if (u == variant) {
                return true;
            }
            u = u.parent;
        }

        return false;
    }

    public final int size() {
        return leftMatches.size() + rightMatches.size();
    }

    final void setLeftMatch(Node base, Node left) {
        leftMatches.put(base, left);
    }

    final void setRightMatch(Node base, Node right) {
        rightMatches.put(base, right);
    }

    private Map<Node, Node> leftMatches = new HashMap<>();
    private Map<Node, Node> rightMatches = new HashMap<>();
}
