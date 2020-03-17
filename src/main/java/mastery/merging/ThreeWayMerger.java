package mastery.merging;

import mastery.diff.MatchingSet;
import mastery.tree.*;
import mastery.util.MultiMap;
import mastery.util.log.Log;

import java.util.*;

public final class ThreeWayMerger implements MergeScenario.Visitor<Tree> {
    public ThreeWayMerger(MatchingSet m, Map<Tree, Tree> t) {
        this.m = m;
        this.t = t;
    }

    @Override
    public Tree visitLeaves(Leaf base, Leaf left, Leaf right) {
        if (m.treesEqual(base, left)) {
            Log.finest("trivial merge scenario: base = left, thus target = right");
            return right;
        }

        if (m.treesEqual(base, right)) {
            Log.finest("trivial merge scenario: base = right, thus target = left");
            return left;
        }

        if (m.treesEqual(left, right)) {
            Log.finest("trivial merge scenario: left = right, thus target is either");
            return left;
        }

        Log.finest("conflict: %s <-> %s", left, right);
        return Conflict.of(base, left, right);
    }

    @Override
    public Tree visitConstructors(Constructor base, Constructor left, Constructor right) {
        Log.finest("merging constructor %s", base.name);

        var targets = new ArrayList<Tree>();
        for (int i = 0; i < base.arity; i++) {
            var b = base.childAt(i);
            var l = left.childAt(i);
            var r = right.childAt(i);

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

            // Question: What if relevant(l, b) and relevant(r, b) ?

            targets.add(twoWay(l, r));
        }

        return new Constructor(base.label, base.name, targets);
    }

    @Override
    public Tree visitOrderedLists(OrderedList base, OrderedList left, OrderedList right) {
        Log.finest("merging ordered list %s", base.name);

        // collect
        var candidates = new Vector<Tree>();
        var pi = new HashMap<Tree, Tree>();

        for (var b : base.children) {
            var l = m.hasLeftMatch(b) ? lift(m.getLeftMatch(b), left) : null;
            var r = m.hasRightMatch(b) ? lift(m.getRightMatch(b), right) : null;

            if (l != null && r != null) {
                var t = threeWay(b, l, r);
                pi.put(b, t);
                pi.put(l, t);
                pi.put(r, t);
                candidates.add(t);
                continue;
            }

            if (l != null) {
                rightDelete(b, l).ifPresent(conflict -> {
                    pi.put(b, conflict);
                    pi.put(l, conflict);
                    candidates.add(conflict);
                });
                continue;
            }

            if (r != null) {
                leftDelete(b, r).ifPresent(conflict -> {
                    pi.put(b, conflict);
                    pi.put(r, conflict);
                    candidates.add(conflict);
                });
            }
        }

        for (var l : left.children) {
            if (!pi.containsKey(l)) {
                pi.put(l, l);
                candidates.add(l);
            }
        }

        for (var r : right.children) {
            if (!pi.containsKey(r)) {
                pi.put(r, r);
                candidates.add(r);
            }
        }

        // encode
        var succ = new MultiMap<Tree, Tree>();
        var pred = new MultiMap<Tree, Tree>();

        var baseIt = base.children.iterator();
        var leftIt = left.children.iterator();
        var rightIt = right.children.iterator();

        for (var it : List.of(baseIt, leftIt, rightIt)) {
            Tree prev = null;
            while (it.hasNext()) {
                var elem = it.next();
                if (pi.containsKey(elem)) {
                    prev = pi.get(elem);
                    break;
                }
            }

            while (it.hasNext()) {
                var elem = it.next();
                if (pi.containsKey(elem)) {
                    Objects.requireNonNull(prev);
                    var next = pi.get(elem);
                    succ.put(prev, next);
                    pred.put(next, prev);
                    prev = next;
                }
            }
        }

        // topology sort
        var targets = new ArrayList<Tree>();

        var inDeg = new HashMap<Tree, Integer>();
        var zero = new ArrayList<Tree>();
        for (var node : pred.keySet()) {
            int deg = pred.get(node).size();
            inDeg.put(node, deg);
            if (deg == 0) {
                zero.add(node);
            }
        }

        while (!zero.isEmpty()) {
            if (zero.size() > 1) { // conflict
                // TODO
                return new OrderedList(base.label, base.name, targets);
            }

            var u = zero.get(0);
            zero.clear();

            targets.add(u);
            for (var v : succ.get(u)) {
                int deg = inDeg.get(v);
                deg--;
                inDeg.put(v, deg);
                if (deg == 0) {
                    zero.add(v);
                }
            }
        }

        return new OrderedList(base.label, base.name, targets);
    }

    @Override
    public Tree visitUnorderedLists(UnorderedList base, UnorderedList left, UnorderedList right) {
        Log.finest("merging unordered list %s", base.name);

        var targets = new ArrayList<Tree>();
        var visited = new HashSet<Tree>();

        for (var b : base.children) {
            Tree l = null, r = null;

            if (m.hasLeftMatch(b)) {
                l = m.getLeftMatch(b);
                while (l.getParent() != left) {
                    l = l.getParent();
                }
                Objects.requireNonNull(l);
            }

            if (m.hasRightMatch(b)) {
                r = m.getRightMatch(b);
                while (r.getParent() != right) {
                    r = r.getParent();
                }
                Objects.requireNonNull(r);
            }

            if (l != null && r != null) {
                visited.add(l);
                visited.add(r);
                targets.add(threeWay(b, l, r));
                continue;
            }

            if (l != null) {
                visited.add(l);
                rightDelete(b, l).ifPresent(targets::add);
                continue;
            }

            if (r != null) {
                visited.add(r);
                leftDelete(b, r).ifPresent(targets::add);
            }
        }

        for (var l : left.children) {
            if (!visited.contains(l)) {
                targets.add(l);
            }
        }

        for (var r : right.children) {
            if (!visited.contains(r)) {
                targets.add(r);
            }
        }

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
    private Optional<Tree> leftDelete(Tree base, Tree right) {
        if (m.matched(base, right) && m.treesEqual(base, right)) {
            Log.fine("delete by left: %s", base);
            return Optional.empty();
        }

        return Optional.of(Conflict.ofRight(base, right));
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
    private Optional<Tree> rightDelete(Tree base, Tree left) {
        if (m.matched(base, left) && m.treesEqual(base, left)) {
            Log.fine("delete by right: %s", base);
            return Optional.empty();
        }

        return Optional.of(Conflict.ofLeft(base, left));
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

    private Tree lift(Tree node, Tree parent) {
        Tree o = node;
        while (o.getParent() != parent) {
            o = o.getParent();
        }
        Objects.requireNonNull(o);

        return o;
    }
}
