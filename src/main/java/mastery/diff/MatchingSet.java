package mastery.diff;

import mastery.tree.input.Node;
import mastery.tree.input.Tree;

public class MatchingSet {

    public final Tree base;
    public final Tree left;
    public final Tree right;

    public MatchingSet(Tree base, Tree left, Tree right) {
        this.base = base;
        this.left = left;
        this.right = right;
    }

    public final boolean treesEqual(Node tree1, Node tree2) {
        return tree1.treeHash == tree2.treeHash;
    }

    public final boolean hasLeftMatch(Node node) {
        return false;
    }

    public final boolean hasRightMatch(Node node) {
        return false;
    }

    public final <E extends Node> E getLeftMatch(E node) {
        return (E) null;
    }

    public final <E extends Node> E getRightMatch(E node) {
        return null;
    }

    public final boolean matched(Node base, Node variant) {
        return false;
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
        return false;
    }
}
