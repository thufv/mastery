package mastery.merger;

import mastery.matcher.MatchingSet;
import mastery.tree.*;
import mastery.util.Interval;
import mastery.util.MultiMap;
import mastery.util.log.Log;
import org.jetbrains.annotations.Nullable;

import static org.junit.Assert.assertNotNull;

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
            return right.deepCopy();
        }

        if (m.treesEqual(base, right)) {
            Log.finest("trivial merge scenario: base = right, thus target = left");
            return left.deepCopy();
        }

        if (m.treesEqual(left, right)) {
            Log.finest("trivial merge scenario: left = right, thus target is either");
            return left.deepCopy();
        }

        Log.finest("conflict: %s <-> %s", left, right);
        return Conflict.of(left, right);
    }

    @Override
    public Tree visitConstructors(Constructor base, Constructor left, Constructor right) {
        Log.finest("merging constructor %s", base.name);

        var targets = new ArrayList<Tree>();
        for (int i = 0; i < base.arity; i++) {
            var b = base.childAt(i);
            var l = left.childAt(i);
            var r = right.childAt(i);

            boolean relevant = true;
            Tree cLeft = m.getLeftMatch(b);
            if (cLeft == null || !Interval.isSubinterval(cLeft.interval, l.interval)) {
                relevant = false;
            }
            Tree cRight = m.getRightMatch(b);
            if (cRight == null || !Interval.isSubinterval(cRight.interval, r.interval)) {
                relevant = false;
            }

            if (relevant) {
                Tree c = threeWay(b, l, r);
                assertNotNull(c);
                targets.add(c);
            }
            else {
                targets.add(Conflict.of(l, r));
            }
        }

        return new Constructor(base.label, base.name, targets);
    }

    @Override
    public Tree visitOrderedLists(OrderedList base, OrderedList left, OrderedList right) {
        Log.finest("merging ordered list %s", base.name);

        // collect
        var candidates = new ArrayList<Candidate>();
        var pi = new HashMap<Tree, Candidate>();
        var visited = new HashSet<Tree>();

        for (var b : base) {
            var l = m.hasLeftMatch(b) ? lift(m.getLeftMatch(b), left) : null;
            var r = m.hasRightMatch(b) ? lift(m.getRightMatch(b), right) : null;

            if (l != null && r != null) {
                visited.add(l);
                visited.add(r);

                var c = Candidate.of(threeWay(b, l, r), l, r);
                candidates.add(c);

                pi.put(b, c);
                pi.put(l, c);
                pi.put(r, c);
                continue;
            }

            if (l != null) {
                visited.add(l);

                var c = rightDelete(b, l).map(conflict -> Candidate.ofLeft(conflict, l))
                                         .orElse(Candidate.ofRightDeletion(l));
                candidates.add(c);

                pi.put(b, c);
                pi.put(l, c);
                continue;
            }

            if (r != null) {
                visited.add(r);

                var c = leftDelete(b, r).map(conflict -> Candidate.ofRight(conflict, r))
                                        .orElse(Candidate.ofLeftDeletion(r));
                candidates.add(c);
                pi.put(b, c);
                pi.put(r, c);
            }
        }

        for (var l : left) {
            if (!visited.contains(l)) {
                var c = Candidate.ofLeft(l.deepCopy(), l);
                candidates.add(c);

                pi.put(l, c);
            }
        }

        for (var r : right) {
            if (!visited.contains(r)) {
                var c = Candidate.ofRight(r.deepCopy(), r);
                candidates.add(c);

                pi.put(r, c);
            }
        }

        Log.finest("candidates: %s", candidates);

        // encode
        var succ = new MultiMap<Candidate, Candidate>();
        var pred = new MultiMap<Candidate, Candidate>();

        for (var list : List.of(base, left, right)) {
            if (!list.isEmpty()) {
                var it = list.iterator();
                var prev = pi.get(it.next());

                while (it.hasNext()) {
                    var next = pi.get(it.next());
                    succ.put(prev, next);
                    pred.put(next, prev);
                    Log.finest("%s -> %s", prev, next);
                    prev = next;
                }
            }
        }

        // topology sort
        var targets = new ArrayList<Tree>();
        var leftSuspended = new ArrayList<Tree>();
        var rightSuspended = new ArrayList<Tree>();

        var inDeg = new HashMap<Candidate, Integer>();
        Queue<Candidate> zero = new LinkedList<>();
        for (var c : candidates) {
            int deg = pred.get(c).size();
            inDeg.put(c, deg);
            if (deg == 0) {
                zero.add(c);
            }
        }

        Set<Candidate> issued = new HashSet<>();
        while (!zero.isEmpty()) {
            Log.finest("zero-inDeg: %s", zero);

            var valid = new ArrayList<Candidate>();
            final int choices = zero.size();
            for (int i = 0; i < choices; i++) {
                var u = zero.poll();
                issued.add(u);

                if (u.valid) {
                    valid.add(u);
                }

                for (var v : succ.get(u)) {
                    int deg = inDeg.get(v);
                    deg--;
                    inDeg.put(v, deg);
                    if (deg == 0) {
                        zero.add(v);
                    }
                }
            }

            if (valid.size() == 1) {
                if (!leftSuspended.isEmpty() || !rightSuspended.isEmpty()) { // handle suspended
                    targets.add(Conflict.of(leftSuspended, rightSuspended));
                    leftSuspended = new ArrayList<>();
                    rightSuspended = new ArrayList<>();
                }
                targets.add(valid.get(0).target);
            } else if (valid.size() > 1) { // conflict
                Log.fine("disambiguated choices: %s", valid);
                for (var node : valid) {
                    if (node.hasLeftOrigin()) {
                        leftSuspended.add(node.leftOrigin);
                    } else {
                        rightSuspended.add(node.rightOrigin);
                    }
                }
            }
        }
        if (!leftSuspended.isEmpty() || !rightSuspended.isEmpty()) { // handle suspended
            targets.add(Conflict.of(leftSuspended, rightSuspended));
        }

        if (issued.size() < candidates.size()) { // cyclic
            for (var l : left) {
                var c = pi.get(l);
                if (!issued.contains(c)) {
                    leftSuspended.add(l);
                }
            }

            for (var r : right) {
                var c = pi.get(r);
                if (!issued.contains(c)) {
                    rightSuspended.add(r);
                }
            }

            targets.add(Conflict.of(leftSuspended, rightSuspended));
        }

        Log.finest("targets: %s", targets);
        return new OrderedList(base.label, base.name, targets);
    }

    private static final class Candidate {
        final boolean valid;
        final Tree target;
        @Nullable
        final Tree leftOrigin;
        @Nullable
        final Tree rightOrigin;

        private Candidate(boolean valid, Tree target, @Nullable Tree leftOrigin, @Nullable Tree rightOrigin) {
            this.valid = valid;
            this.target = target;
            this.leftOrigin = leftOrigin;
            this.rightOrigin = rightOrigin;
        }

        static Candidate of(Tree target, Tree left, Tree right) {
            return new Candidate(true, target, left, right);
        }

        static Candidate ofLeft(Tree target, Tree left) {
            return new Candidate(true, target, left, null);
        }

        static Candidate ofRight(Tree target, Tree right) {
            return new Candidate(true, target, null, right);
        }

        static Candidate ofLeftDeletion(Tree right) {
            return new Candidate(false, right, null, right);
        }

        static Candidate ofRightDeletion(Tree left) {
            return new Candidate(false, left, left, null);
        }

        boolean hasLeftOrigin() {
            return leftOrigin != null;
        }

        @Override
        public String toString() {
            return target + (valid ? "" : " (removed)");
        }
    }

    @Override
    public Tree visitUnorderedLists(UnorderedList base, UnorderedList left, UnorderedList right) {
        Log.finest("merging unordered list %s", base.name);

        var targets = new ArrayList<Tree>();
        var visited = new HashSet<Tree>();

        for (var b : base) {
            Tree l = m.hasLeftMatch(b) ? lift(m.getLeftMatch(b), left) : null;
            Tree r = m.hasRightMatch(b) ? lift(m.getRightMatch(b), right) : null;

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

        for (var l : left) {
            if (!visited.contains(l)) {
                targets.add(l);
            }
        }

        for (var r : right) {
            if (!visited.contains(r)) {
                targets.add(r);
            }
        }

        return new UnorderedList(base.label, base.name, targets);
    }

    // read-only contexts
    private MatchingSet m;
    private Map<Tree, Tree> t;

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
            Log.config("no lifting needed: %s", base);
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
        return Conflict.of(left, right);
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
        if (m.treesEqual(base, right)) {
            Log.fine("delete by left: %s", base);
            return Optional.empty();
        }

        return Optional.of(Conflict.ofRight(right));
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
        if (m.treesEqual(base, left)) {
            Log.fine("delete by right: %s", base);
            return Optional.empty();
        }

        return Optional.of(Conflict.ofLeft(left));
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
