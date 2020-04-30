package mastery.merger;

import mastery.matcher.MatchingSet;
import mastery.tree.*;
import mastery.util.Interval;
import mastery.util.MultiMap;
import mastery.util.log.Log;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.logging.Level;

import static org.junit.Assert.assertNotNull;

public final class ThreeWayMerger implements MergeScenario.Visitor<Tree> {
    public ThreeWayMerger(MatchingSet m, Map<Tree, Tree> t) {
        this.m = m;
        this.t = t;
    }

    @Override
    public Tree visitLeaves(Leaf base, Leaf left, Leaf right) {
        if (m.treesEqual(base, left)) {
            Log.finest("right-change %s", right.toReadableString());
            return right.deepCopy();
        }
        if (m.treesEqual(base, right)) {
            Log.finest("left-change %s", left.toReadableString());
            return left.deepCopy();
        }
        if (m.treesEqual(left, right)) {
            Log.finest("consistent change %s", left.toReadableString());
            return left.deepCopy();
        }

        Log.finer("conflict %s <-> %s", left.toReadableString(), right.toReadableString());
        return Conflict.of(left, right);
    }

    @Override
    public Tree visitConstructors(Constructor base, Constructor left, Constructor right) {
        Log.finer("merging %s", base.name);

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
                Log.finer("+ %s (3-way)", c.toReadableString());
                targets.add(c);
            } else {
                if (m.treesEqual(b, l)) {
                    Log.finest("+ %s (right-change)", r.toReadableString());
                    targets.add(r.deepCopy());
                } else if (m.treesEqual(b, r)) {
                    Log.finest("+ left-change %s (left-change)", l.toReadableString());
                    targets.add(l.deepCopy());
                } else if (m.treesEqual(l, r)) {
                    Log.finest("+ %s (consistent-change)", l.toReadableString());
                    targets.add(l.deepCopy());
                } else {
                    Log.finer("+ conflict %s <-> %s", l.toReadableString(), r.toReadableString());
                    targets.add(Conflict.of(l, r));
                }
            }
        }

        return new Constructor(base.label, base.name, targets);
    }

    @Override
    public Tree visitOrderedLists(OrderedList base, OrderedList left, OrderedList right) {
        Log.finer("merging ordered %s", base.name);

        if (m.treesEqual(base, left)) {
            Log.finest("right-change %s", right.toReadableString());
            return right.deepCopy();
        }
        if (m.treesEqual(base, right)) {
            Log.finest("left-change %s", left.toReadableString());
            return left.deepCopy();
        }
        if (m.treesEqual(left, right)) {
            Log.finer("trivial case: consistent change %s", left.toReadableString());
            return left.deepCopy();
        }

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

                var t = threeWay(b, l, r);
                Log.finer("+ %s (3-way)", t.toReadableString());

                var c = Candidate.of(t, l, r);
                candidates.add(c);

                pi.put(b, c);
                pi.put(l, c);
                pi.put(r, c);
                continue;
            }

            if (l != null) {
                visited.add(l);

                var t = rightDelete(b, l);
                Candidate c;
                if (t.isPresent()) {
                    Log.finer("+ conflict %s <-> ε", l.toReadableString());
                    c = Candidate.ofLeft(t.get(), l);
                } else {
                    Log.finer("- %s (left)", l.toReadableString());
                    c = Candidate.ofRightDeletion(l);
                }
                candidates.add(c);

                pi.put(b, c);
                pi.put(l, c);
                continue;
            }

            if (r != null) {
                visited.add(r);

                var t = leftDelete(b, r);
                Candidate c;
                if (t.isPresent()) {
                    Log.finer("+ conflict ε <-> %s", r.toReadableString());
                    c = Candidate.ofRight(t.get(), r);
                } else {
                    Log.finer("- %s (right)", r.toReadableString());
                    c = Candidate.ofLeftDeletion(r);
                }
                candidates.add(c);
                pi.put(b, c);
                pi.put(r, c);
                continue;
            }

            Log.finer("- %s (base)", b);
        }

        for (var l : left) {
            if (!visited.contains(l)) {
                Log.finer("+ %s (left)", l.toReadableString());
                var c = Candidate.ofLeft(l.deepCopy(), l);
                candidates.add(c);

                pi.put(l, c);
            }
        }

        for (var r : right) {
            if (!visited.contains(r)) {
                Log.finer("+ %s (right)", r.toReadableString());
                var c = Candidate.ofRight(r.deepCopy(), r);
                candidates.add(c);

                pi.put(r, c);
            }
        }

        // encode
        var succ = new MultiMap<Candidate, Candidate>();
        var pred = new MultiMap<Candidate, Candidate>();

        // be careful that in pi, some elements may not be mapped to a candidate
        for (var list : List.of(base, left, right)) {
            var it = list.iterator();
            Candidate prev = null;
            while (it.hasNext()) {
                var e = it.next();
                if (pi.containsKey(e)) {
                    prev = pi.get(e);
                    break;
                }
            }

            while (it.hasNext()) {
                var e = it.next();
                if (pi.containsKey(e)) {
                    var next = pi.get(e);
                    succ.put(prev, next);
                    pred.put(next, prev);
                    Log.finest("constraint: %s precedes %s", prev, next);
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
                    handleSuspended(leftSuspended, rightSuspended, targets);
                }
                Log.finer("unique choice: %s", valid.get(0).target);
                targets.add(valid.get(0).target);
            } else if (valid.size() > 1) { // conflict
                Log.finer("disambiguated choices: %s", valid);
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
            handleSuspended(leftSuspended, rightSuspended, targets);
        }

        if (issued.size() < candidates.size()) { // cyclic
            Log.config("detect cycle");

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

            handleSuspended(leftSuspended, rightSuspended, targets);
        }

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

    private void handleSuspended(List<Tree> leftSuspended, List<Tree> rightSuspended, List<Tree> targets) {
        List<Tree> finalLeftSuspended = leftSuspended;
        List<Tree> finalRightSuspended = rightSuspended;

        boolean identical = true;
        if (leftSuspended.size() == rightSuspended.size()) {
            var leftIt = leftSuspended.iterator();
            var rightIt = rightSuspended.iterator();
            while (leftIt.hasNext()) {
                if (!m.treesEqual(leftIt.next(), rightIt.next())) {
                    identical = false;
                    break;
                }
            }
        } else {
            identical = false;
        }

        if (identical) {
            Log.finer("identical insertions made by two variants");
            leftSuspended.forEach(e -> targets.add(e.deepCopy()));
        } else {
            Log.ifLoggable(Level.FINER, printer -> {
                printer.println("conflict");
                printer.incIndent();
                finalLeftSuspended.forEach(printer::println);
                printer.decIndent();
                printer.println("<->");
                printer.incIndent();
                finalRightSuspended.forEach(printer::println);
                printer.decIndent();
            });
            targets.add(Conflict.of(leftSuspended, rightSuspended));
        }

        leftSuspended.clear();
        rightSuspended.clear();
    }

    @Override
    public Tree visitUnorderedLists(UnorderedList base, UnorderedList left, UnorderedList right) {
        Log.finer("merging unordered %s", base.name);

        if (m.treesEqual(base, left)) {
            Log.finest("right-change %s", right.toReadableString());
            return right.deepCopy();
        }
        if (m.treesEqual(base, right)) {
            Log.finest("left-change %s", left.toReadableString());
            return left.deepCopy();
        }
        if (m.treesEqual(left, right)) {
            Log.finer("trivial case: consistent-change %s", left.toReadableString());
            return left.deepCopy();
        }

        var targets = new ArrayList<Tree>();
        var visited = new HashSet<Tree>();

        for (var b : base) {
            Tree l = m.hasLeftMatch(b) ? lift(m.getLeftMatch(b), left) : null;
            Tree r = m.hasRightMatch(b) ? lift(m.getRightMatch(b), right) : null;

            if (l != null && r != null) {
                visited.add(l);
                visited.add(r);

                var t = threeWay(b, l, r);
                Log.finer("+ %s (3-way)", t.toReadableString());
                targets.add(t);
                continue;
            }

            if (l != null) {
                visited.add(l);

                var t = rightDelete(b, l);
                if (t.isPresent()) {
                    Log.finer("+ conflict %s <-> ε", l.toReadableString());
                    targets.add(t.get());
                } else {
                    Log.finer("- %s (left)", l.toReadableString());
                }
                continue;
            }

            if (r != null) {
                visited.add(r);

                var t = leftDelete(b, r);
                if (t.isPresent()) {
                    Log.finer("+ conflict ε <-> %s", r.toReadableString());
                    targets.add(t.get());
                } else {
                    Log.finer("- %s (right)", r.toReadableString());
                }
                continue;
            }

            Log.finer("- %s (base)", b.toReadableString());
        }

        Map<Integer, Tree> subtreeOfAssignment = new HashMap<>();
        Map<Integer, Integer> count1OfAssignment = new HashMap<>();
        Map<Integer, Integer> count2OfAssignment = new HashMap<>();

        for (var l : left) {
            if (!visited.contains(l)) {
                count1OfAssignment.put(l.assignment, count1OfAssignment.getOrDefault(l.assignment, 0) + 1);
                subtreeOfAssignment.put(l.assignment, l);
            }
        }
        for (var r : right) {
            if (!visited.contains(r)) {
                count2OfAssignment.put(r.assignment, count2OfAssignment.getOrDefault(r.assignment, 0) + 1);
                subtreeOfAssignment.put(r.assignment, r);
            }
        }

        for (Integer assignment : subtreeOfAssignment.keySet()) {
            for (int count = Math.max(count1OfAssignment.getOrDefault(assignment, 0),
                                      count2OfAssignment.getOrDefault(assignment, 0)); count > 0; --count) {
                Log.finer("+ %s", subtreeOfAssignment.get(assignment).toReadableString());
                targets.add(subtreeOfAssignment.get(assignment).deepCopy());
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
            return t.get(base);
        }

        if (l != left && r == right) { // lift left
            Log.config("lift left: %s -> %s", l.toReadableString(), left.toReadableString());
            return TreeBuilders.fromUpdate(left, l, t.get(base));
        }

        if (l == left && r != right) { // lift right
            Log.config("lift right: %s -> %s", r.toReadableString(), right.toReadableString());
            return TreeBuilders.fromUpdate(right, r, t.get(base));
        }

        // lift both
        Log.config("lift both: %s -> %s and %s -> %s", l.toReadableString(), left.toReadableString(),
                   r.toReadableString(), right.toReadableString());
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
