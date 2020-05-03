package mastery.merger;

import mastery.matcher.MatchingSet;
import mastery.tree.*;
import mastery.util.Interval;
import mastery.util.MultiMap;
import mastery.util.log.Log;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.*;
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
        var pi = new MultiMap<Tree, Candidate>();
        var visited = new HashSet<Tree>();

        for (var b : base) {
            var l = m.hasLeftMatch(b) ? lift(m.getLeftMatch(b), left) : null;
            var r = m.hasRightMatch(b) ? lift(m.getRightMatch(b), right) : null;

            if (l != null && r != null) {
                visited.add(l);
                visited.add(r);

                var t = threeWay(b, l, r);
                Log.finer("+ %s (3-way)", t.toReadableString());

                var c = Candidate.of(t, b, l, r);
                candidates.add(c);

                Log.finer("candidates.size() = %d", candidates.size());

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
                    c = Candidate.ofLeft(t.get(), b, l);
                } else {
                    Log.finer("- %s (left)", l.toReadableString());
                    c = Candidate.ofRightDeletion(b, l);
                }
                candidates.add(c);

                Log.finer("candidates.size() = %d", candidates.size());

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
                    c = Candidate.ofRight(t.get(), b, r);
                } else {
                    Log.finer("- %s (right)", r.toReadableString());
                    c = Candidate.ofLeftDeletion(b, r);
                }
                candidates.add(c);

                Log.finer("candidates.size() = %d", candidates.size());

                pi.put(b, c);
                pi.put(r, c);
                continue;
            }

            Log.finer("- %s (base)", b);
        }

        for (var l : left) {
            if (!visited.contains(l)) {
                Log.finer("+ %s (left)", l.toReadableString());
                var c = Candidate.ofLeft(l.deepCopy(), null, l);
                candidates.add(c);

                Log.finer("candidates.size() = %d", candidates.size());

                pi.put(l, c);
            }
        }

        for (var r : right) {
            if (!visited.contains(r)) {
                Log.finer("+ %s (right)", r.toReadableString());
                var c = Candidate.ofRight(r.deepCopy(), null, r);
                candidates.add(c);

                Log.finer("candidates.size() = %d", candidates.size());

                pi.put(r, c);
            }
        }

        // encode
        succ = new MultiMap<Candidate, Candidate>();
        pred = new MultiMap<Candidate, Candidate>();

        // be careful that in pi, some elements may not be mapped to a candidate
        for (var list : List.of(base, left, right)) {
            var it = list.iterator();
            Candidate prev = null;
            while (it.hasNext()) {
                var e = it.next();
                if (pi.containsKey(e)) {
                    var nodes = pi.get(e);
                    for (int i = 0; i + 1 < nodes.size(); ++i) {
                         succ.put(nodes.get(i), nodes.get(i + 1));
                         pred.put(nodes.get(i + 1), nodes.get(i));
                    }
                    if (nodes.size() > 1) {
                        succ.put(nodes.get(nodes.size() - 1), nodes.get(0));
                        succ.put(nodes.get(0), nodes.get(nodes.size() - 1));
                    }
                    prev = nodes.get(0);
                    break;
                }
            }

            while (it.hasNext()) {
                var e = it.next();
                if (pi.containsKey(e)) {
                    var nodes = pi.get(e);
                    for (int i = 0; i + 1 < nodes.size(); ++i) {
                         succ.put(nodes.get(i), nodes.get(i + 1));
                         pred.put(nodes.get(i + 1), nodes.get(i));
                    }
                    if (nodes.size() > 1) {
                        succ.put(nodes.get(nodes.size() - 1), nodes.get(0));
                        succ.put(nodes.get(0), nodes.get(nodes.size() - 1));
                    }

                    var next = nodes.get(0);
                    succ.put(prev, next);
                    pred.put(next, prev);
                    Log.finest("constraint: %s precedes %s", prev, next);
                    prev = next;
                }
            }
        }

        // calculate strongly connected component by tarjan algorithm
        sccs = new ArrayList<>();
        sccOf = new HashMap<>();
        dfn = new HashMap<>();
        low = new HashMap<>();
        in_stack = new HashSet<>();
        stack = new Stack<>();
        dfncnt = 0;
        Log.finer("candidates.size() = %d", candidates.size());
        for (Candidate candidate: candidates) {
            Log.finer("A candidate %s", candidate);
            if (!dfn.containsKey(candidate))
                tarjan(candidate);
        }

        // topology sort
        var targets = new ArrayList<Tree>();
        var leftSuspended = new ArrayList<Tree>();
        var rightSuspended = new ArrayList<Tree>();

        Log.finer("topo sort");

        var inDeg = new HashMap<StronglyConnectedComponent, Integer>();
        Queue<StronglyConnectedComponent> zero = new LinkedList<>();
        for (var scc : sccs) {
            int deg = scc.countPred();
            inDeg.put(scc, deg);
            if (deg == 0) zero.add(scc);
        }

        Set<StronglyConnectedComponent> issued = new HashSet<>();
        while (!zero.isEmpty()) {
            var valid = new ArrayList<StronglyConnectedComponent>();
            final int choices = zero.size();
            Log.finer("there're %d choices", choices);
            for (int i = 0; i < choices; i++) {
                var u = zero.poll();
                issued.add(u);

                Log.finer("%s", u);

                if (u.hasValid()) {
                    valid.add(u);
                }

                for (var v : u.getSuccs()) {
                    int deg = inDeg.get(v);
                    deg--;
                    inDeg.put(v, deg);
                    if (deg == 0) zero.add(v);
                }
            }

            if (valid.size() == 1) {
                if (!leftSuspended.isEmpty() || !rightSuspended.isEmpty()) { // handle suspended
                    handleSuspended(leftSuspended, rightSuspended, targets);
                }
                var scc = valid.get(0);
                if (scc.countValid() == 1) {
                    for (Candidate node: scc.nodes)
                        if (node.valid) {
                            Log.finer("unique choice: %s", node.target);
                            targets.add(node.target);
                            break;
                        }
                }
                else {
                    if (scc.leftIsAnswer()) {
                        Log.finer("left is answer");
                        for (Candidate node: scc.sortedByLeft())
                            targets.add(node.target);
                    }
                    else if (scc.rightIsAnswer()) {
                        Log.finer("right is answer");
                        for (Candidate node: scc.sortedByRight())
                            targets.add(node.target);
                    }
                    else {
                        Log.finer("there is no answer");
                        for (Candidate node: scc.sortedByLeft())
                            leftSuspended.add(node.getLeftOrigin());
                        for (Candidate node: scc.sortedByRight())
                            rightSuspended.add(node.getRightOrigin());
                    }
                }
            } else if (valid.size() > 1) { // conflict
                // In fact, in this case, valid.size() == 2, a LeftOrigin and a RightOrigin
                Log.finer("disambiguated choices: %s", valid);
                for (var scc : valid) {
                    for (Candidate node: scc.sortedByLeft())
                        leftSuspended.add(node.getLeftOrigin());
                    for (Candidate node: scc.sortedByRight())
                        rightSuspended.add(node.getRightOrigin());
                }
            }
        }
        if (!leftSuspended.isEmpty() || !rightSuspended.isEmpty()) { // handle suspended
            handleSuspended(leftSuspended, rightSuspended, targets);
        }

        return new OrderedList(base.label, base.name, targets);
    }

    MultiMap<Candidate, Candidate> succ;
    MultiMap<Candidate, Candidate> pred;
    List<StronglyConnectedComponent> sccs;
    Map<Candidate, StronglyConnectedComponent> sccOf;
    Map<Candidate, Integer> dfn;
    Map<Candidate, Integer> low;
    Integer dfncnt;
    Set<Candidate> in_stack;
    Stack<Candidate> stack;

    private final void tarjan(Candidate u) {
        Log.finer("tarjan %s", u);

        low.put(u, ++dfncnt);
        dfn.put(u, dfncnt);
        stack.push(u);
        in_stack.add(u);
        for (Candidate v: succ.get(u))
            if (!dfn.containsKey(v)) {
                tarjan(v);
                if (low.get(v) < low.get(u))
                    low.put(u, low.get(v));
            }
            else if (in_stack.contains(v)) {
                if (low.get(v) < low.get(u))
                    low.put(u, low.get(v));
            }
        
        Log.finer("for %s, dfn = %d, low = %d", u, dfn.get(u), low.get(u));

        if (dfn.get(u) == low.get(u)) {
            StronglyConnectedComponent scc = new StronglyConnectedComponent();
            Log.finer("nodes in a scc:");
            for (Candidate top; (top = stack.pop()) != u;) {
                Log.finer("%s", top);

                in_stack.remove(top);
                scc.nodes.add(top);
                sccOf.put(top, scc);
            }

            Log.finer("%s", u);

            in_stack.remove(u);
            scc.nodes.add(u);
            sccOf.put(u, scc);

            scc.calStart();

            sccs.add(scc);
        }
    }

    private final class StronglyConnectedComponent {
        public List<Candidate> nodes = new ArrayList<>();
        public Integer left_start, base_start, right_start;

        StronglyConnectedComponent() {}

        public void calStart() {
            left_start = nodes.stream()
                .filter(node -> node.hasLeftOrigin())
                .mapToInt(node -> Integer.valueOf(node.getLeftOrigin().childno))
                .min()
                .orElse(-1);
            base_start = nodes.stream()
                .filter(node -> node.hasBaseOrigin())
                .mapToInt(node -> Integer.valueOf(node.getBaseOrigin().childno))
                .min()
                .orElse(-1);
            right_start = nodes.stream()
                .filter(node -> node.hasRightOrigin())
                .mapToInt(node -> Integer.valueOf(node.getRightOrigin().childno))
                .min()
                .orElse(-1);
        }

        public int countPred() {
            var sscc = new HashSet<StronglyConnectedComponent>();
            for (Candidate node: nodes)
                for (Candidate prev: pred.get(node)) {
                    var v = sccOf.get(prev);
                    if (v != this)
                        sscc.add(v);
                }
            return sscc.size();
        }
        public List<StronglyConnectedComponent> getSuccs() {
            var lscc = new HashSet<StronglyConnectedComponent>();
            for (Candidate node: nodes)
                for (Candidate successor: succ.get(node)) {
                    var v = sccOf.get(successor);
                    if (v != this)
                        lscc.add(v);
                }
            return new ArrayList<StronglyConnectedComponent>(lscc);
        }

        public boolean hasValid() {
            for (Candidate node: nodes)
                if (node.valid)
                    return true;
            return false;
        }

        public boolean leftIsAnswer() {
            var rightbases = new ArrayList<Candidate>();
            for (Candidate node: nodes) {
                if (!node.hasRightOrigin() && node.hasBaseOrigin()
                    || node.hasRightOrigin() && !node.hasBaseOrigin())
                    return false;
                if (node.hasRightOrigin() && node.hasBaseOrigin())
                    rightbases.add(node);
            }
            for (Candidate rightbase: rightbases)
                if (rightbase.getRightOrigin().childno - right_start != rightbase.getBaseOrigin().childno - base_start)
                    return false;
            return true;
        }

        public boolean rightIsAnswer() {
            var leftbases = new ArrayList<Candidate>();
            for (Candidate node: nodes) {
                if (!node.hasLeftOrigin() && node.hasBaseOrigin()
                    || node.hasLeftOrigin() && !node.hasBaseOrigin())
                    return false;
                if (node.hasLeftOrigin() && node.hasBaseOrigin())
                    leftbases.add(node);
            }
            for (Candidate leftbase: leftbases)
                if (leftbase.getLeftOrigin().childno - left_start != leftbase.getBaseOrigin().childno - base_start)
                    return false;
            return true;
        }

        public List<Candidate> sortedByLeft() {
            List<Candidate> sorted = new ArrayList<Candidate>();
            for (Candidate node: nodes)
                if (node.hasLeftOrigin()) {
                    int i = node.getLeftOrigin().childno - left_start;
                    while (sorted.size() <= i)
                        sorted.add(null);
                    sorted.set(i, node);
                }
            
            for (Candidate node: sorted)
                assertNotNull(node);
            
            sorted = sorted.stream().filter(node -> node.valid).collect(Collectors.toList());

            return sorted;
        }

        public List<Candidate> sortedByRight() {
            List<Candidate> sorted = new ArrayList<Candidate>();
            for (Candidate node: nodes)
                if (node.hasRightOrigin()) {
                    int i = node.getRightOrigin().childno - right_start;
                    while (sorted.size() <= i)
                        sorted.add(null);
                    sorted.set(i, node);
                }
            
            for (Candidate node: sorted)
                assertNotNull(node);
            
            sorted = sorted.stream().filter(node -> node.valid).collect(Collectors.toList());

            return sorted;
        }

        public int countValid() {
            return (int)nodes.stream().filter(node -> node.valid).count();
        }

        @Override
        public String toString() {
            String ans = "strongly connected component (size " + nodes.size() + ")\n";
            for (Candidate node: nodes) ans += node + "\n";
            return ans;
        }
    }

    private static final class Candidate {
        final boolean valid;
        final Tree target;
        @Nullable
        final Tree baseOrigin;
        @Nullable
        final Tree leftOrigin;
        @Nullable
        final Tree rightOrigin;

        private Candidate(boolean valid, Tree target, @Nullable Tree baseOrigin, @Nullable Tree leftOrigin, @Nullable Tree rightOrigin) {
            this.valid = valid;
            this.target = target;
            this.baseOrigin = baseOrigin;
            this.leftOrigin = leftOrigin;
            this.rightOrigin = rightOrigin;
        }

        static Candidate of(Tree target, Tree base, Tree left, Tree right) {
            return new Candidate(true, target, base, left, right);
        }

        static Candidate ofLeft(Tree target, Tree base, Tree left) {
            return new Candidate(true, target, base, left, null);
        }

        static Candidate ofRight(Tree target, Tree base, Tree right) {
            return new Candidate(true, target, base, null, right);
        }

        static Candidate ofLeftDeletion(Tree base, Tree right) {
            return new Candidate(false, right, base, null, right);
        }

        static Candidate ofRightDeletion(Tree base, Tree left) {
            return new Candidate(false, left, base, left, null);
        }

        public boolean hasLeftOrigin() {
            return leftOrigin != null;
        }

        public boolean hasRightOrigin() {
            return rightOrigin != null;
        }

        public boolean hasBaseOrigin() {
            return baseOrigin != null;
        }

        public Tree getLeftOrigin() {
            return leftOrigin;
        }

        public Tree getRightOrigin() {
            return rightOrigin;
        }

        public Tree getBaseOrigin() {
            return baseOrigin;
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
            Log.finer("considering %s (base)", b.toReadableString());
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
