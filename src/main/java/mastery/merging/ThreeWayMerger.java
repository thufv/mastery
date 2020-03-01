package mastery.merging;

import mastery.diff.MatchingSet;
import mastery.tree.*;
import mastery.util.Pair;
import mastery.util.log.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;

public final class ThreeWayMerger implements MergeScenario.Visitor<Tree> {
    public ThreeWayMerger(MatchingSet m, Map<Tree, Tree> t) {
        this.m = m;
        this.t = t;
    }

    @Override
    public Tree visitLeaves(Leaf base, Leaf left, Leaf right) {
        // realizing that the following trivial cases have already been checked
        assert !m.treesEqual(base, left) && !m.treesEqual(base, right) && !m.treesEqual(left, right);
        // the only possibility is conflict
        Log.finest("conflict: %s <-> %s", left, right);
        return Conflict.of(base, left, right);
    }

    @Override
    public Tree visitConstructors(Constructor base, Constructor left, Constructor right) {
        Log.finest("merging constructor %s", base.name);

        var targets = new ArrayList<Tree>();
        for (int i = 0; i < base.arity; i++) {
            var b = base.children.get(i);
            var l = left.children.get(i);
            var r = right.children.get(i);

            if (m.relevant(b, l) && m.relevant(b, r)) {
                targets.add(threeWay(b, l, r));
                continue;
            }

            if (!m.relevant(b, l) && m.relevant(b, r)) {
                targets.add(leftInsert(b, l, r));
                continue;
            }

            if (m.relevant(b, l) && !m.relevant(b, r)) {
                targets.add(rightInsert(b, l, r));
                continue;
            }

            targets.add(twoWay(l, r));
        }

        return new Constructor(base.label, base.name, targets);
    }

    @Override
    public Tree visitOrderedLists(OrderedList base, OrderedList left, OrderedList right) {
        Log.finest("merging ordered list %s", base.name);

        var targets = ordered.apply(left, right, establishMappings(base, left, right));
        return new OrderedList(base.label, base.name, targets);
    }

    @Override
    public Tree visitUnorderedLists(UnorderedList base, UnorderedList left, UnorderedList right) {
        Log.finest("merging unordered list %s", base.name);

        var targets = unordered.apply(left, right, establishMappings(base, left, right));
        return new UnorderedList(base.label, base.name, targets);
    }

    // read-only contexts
    private MatchingSet m;
    private Map<Tree, Tree> t;

    // helper mergers for lists
    private OrderedListMerger ordered = new OrderedListMerger();
    private UnorderedListMerger unordered = new UnorderedListMerger();

    /**
     * Two-way merge.
     * <p>
     * No conflict iff both variants are equal to each other.
     *
     * @param left  left version
     * @param right right version
     * @return merge result
     */
    private Tree twoWay(Tree left, Tree right) {
        Log.finest("two way: %s <-> %s", left, right);
        return m.treesEqual(left, right) ? left : Conflict.ofTwoWay(left, right);
    }

    /**
     * A trivial three-way merge that handles lifting (if exists).
     * <p>
     * REQUIRE: both variants are relevant to `base`.
     *
     * @param base  base version
     * @param left  left version
     * @param right right version
     * @return merge result
     */
    private Tree threeWay(Tree base, Tree left, Tree right) {
        var l = m.getLeftMatch(base);
        var r = m.getRightMatch(base);

        Objects.requireNonNull(l);
        Objects.requireNonNull(r);

        if (l == left && r == right) { // no lifting needed
            return t.get(base);
        }

        if (l != left && r == right) { // lift left
            Log.config("lift left: %s -> %s", l, left);
            return TreeBuilders.fromUpdate(left, l, t.get(base));
        }

        if (l == left && r != right) { // lift right
            Log.config("lift right: %s -> %s", r, right);
            return TreeBuilders.fromUpdate(right, r, t.get(base));
        }

        // lift both
        Log.config("lift both: %s -> %s and %s -> %s", l, left, r, right);
        return Conflict.of(base, left, right);
    }

    /**
     * Handle deletion entailed by left, i.e. left has no match with `base`.
     * <p>
     * No conflict iff no change is introduced by `right`.
     * REQUIRE: `right` is relevant to `base`.
     *
     * @param base  base version
     * @param right right version
     * @return merge result
     */
    private Tree leftDelete(Tree base, Tree right) {
        if (m.matched(base, right) && m.treesEqual(base, right)) {
            Log.fine("delete by left: %s", base);
            return new Nothing(); // TODO: is optional suitable here?
        }

        return Conflict.ofRight(base, right);
    }

    /**
     * Handle deletion entailed by right, i.e. right has no match with `base`.
     * <p>
     * Similar to leftDelete.
     *
     * @param base base version
     * @param left left version
     * @return merge result
     */
    private Tree rightDelete(Tree base, Tree left) {
        if (m.matched(base, left) && m.treesEqual(base, left)) {
            Log.fine("delete by right: %s", base);
            return new Nothing();
        }

        return Conflict.ofLeft(base, left);
    }

    /**
     * Handle insertion entailed by left, i.e. `left` is not matched with `base`.
     * <p>
     * No conflict iff no change is introduced by `right`.
     * REQUIRE: `right` is relevant to `base`.
     *
     * @param base  base version
     * @param left  left version
     * @param right right version
     * @return merge result
     */
    private Tree leftInsert(Tree base, Tree left, Tree right) {
        var r = m.getRightMatch(base);
        var t = m.treesEqual(base, r) ? left : Conflict.of(base, left, r);

        if (r == right) return t;

        return TreeBuilders.fromUpdate(right, r, t);
    }

    /**
     * Handle insertion entailed by right, i.e. `right` is not matched with `base`.
     * <p>
     * Similar to leftInsert.
     *
     * @param base  base version
     * @param left  left version
     * @param right right version
     * @return merge result
     */
    private Tree rightInsert(Tree base, Tree left, Tree right) {
        var l = m.getLeftMatch(base);
        var t = m.treesEqual(base, l) ? right : Conflict.of(base, l, right);

        if (l == left) return t;

        return TreeBuilders.fromUpdate(left, l, t);
    }

    /**
     * Establish mappings among three list Trees, and produce the merge result for each mapping.
     * <p>
     * REQUIRE: the three lists are matched each other.
     *
     * @param baseList  base version
     * @param leftList  left version
     * @param rightList right version
     * @return a list of mappings `((left, right), target)` where
     *         * `left \in leftList` and `right \in rightList` are the matched element
     *         * `target` is the merge result
     */
    private List<Pair<Pair<Tree, Tree>, Tree>> establishMappings(ListNode baseList,
                                                                 ListNode leftList, ListNode rightList) {
        var mappings = new ArrayList<Pair<Pair<Tree, Tree>, Tree>>();
        for (var base : baseList.children) {
            Tree left = null, right = null;

            if (m.hasLeftMatch(base)) {
                left = m.getLeftMatch(base);
                if (left.getParent() != leftList)
                    while (left.getParent() != leftList) {
                        left = left.getParent();
                    }
                Objects.requireNonNull(left);
            }

            if (m.hasRightMatch(base)) {
                right = m.getRightMatch(base);
                while (right.getParent() != rightList) {
                    right = right.getParent();
                }
                Objects.requireNonNull(right);
            }

            if (left != null && right != null) {
                mappings.add(Pair.of(Pair.of(left, right), threeWay(base, left, right)));
            } else if (left == null && right == null) {
                continue;
            } else if (left != null) {
                mappings.add(Pair.of(Pair.of(left, null), rightDelete(base, left)));
            } else {
                mappings.add(Pair.of(Pair.of(null, right), leftDelete(base, right)));
            }
        }

        Log.finest("mappings:");
        Log.ifLoggable(Level.FINEST, printer -> {
            printer.incIndent();
            for (var p : mappings) {
                printer.formatLn("%s --- %s", p.first.first, p.first.second);
            }
            printer.decIndent();
        });

        return mappings;
    }
}
