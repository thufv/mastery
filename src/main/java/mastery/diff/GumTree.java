package mastery.diff;

import mastery.tree.Tree;
import mastery.util.MultiMap;
import mastery.util.Pair;
import mastery.util.WeightedQueue;
import mastery.util.log.Log;

import java.util.*;

// Based on the mapping part of GumTree algorithm
public abstract class GumTree {

    protected final int minHeight;

    protected final double minDice;

    public GumTree(int minHeight, double minDice) {
        this.minHeight = minHeight;
        this.minDice = minDice;
    }

    public final Map<Tree, Tree> apply(Tree tree1, Tree tree2) {
        m = new HashMap<Tree, Tree>();
        matched.clear();

        // Top-down Phase
        {
            var queue1 = new WeightedQueue<Tree>(Tree -> Tree.height);
            var queue2 = new WeightedQueue<Tree>(Tree -> Tree.height);
            queue1.add(tree1);
            queue2.add(tree2);
    
            while (!queue1.isEmpty() && !queue2.isEmpty() &&
                    queue1.maxWeight() > minHeight && queue2.maxWeight() > minHeight) {
                // case 1: queue1 has a larger height
                if (queue1.maxWeight() > queue2.maxWeight()) {
                    for (var Tree : queue1.removeMax()) {
                        queue1.addAll(Tree.children);
                    }
                    continue;
                }
    
                // case 2: queue2.maxWeight() > queue1.maxWeight()
                if (queue2.maxWeight() > queue1.maxWeight()) {
                    for (var Tree : queue2.removeMax()) {
                        queue2.addAll(Tree.children);
                    }
                    continue;
                }
    
                // case 3: two queues contain Trees of the same height
                var nodes1 = queue1.removeMax();
                var nodes2 = queue2.removeMax();
    
                // collect tree hash values of all nodes from tree 2 in a set for efficient comparison
                var assignmentCount = new ArrayList<Integer>();
                for (var node: nodes1) {
                    while (assignmentCount.size() <= node.assignment) {
                        assignmentCount.add(0);
                    }
                    assignmentCount.set(node.assignment, assignmentCount.get(node.assignment));
                }
                for (var node: nodes2) {
                    while (assignmentCount.size() <= node.assignment) {
                        assignmentCount.add(0);
                    }
                    assignmentCount.set(node.assignment, assignmentCount.get(node.assignment));
                }
    
                // check if any Tree from tree 1 has one (directly record) or more (suspend first) match
                for (var node: nodes1) {
                    if (hashes.contains(source.treeHash)) {
                        var targets = TreesByHash.get(source.treeHash);
                        if (targets.size() == 1) {
                            match(source, targets.get(0), MappingType.isomorphic);
                        } else {
                            for (var target : targets) {
                                Log.finest("suspend " + source + " <-> " + target);
                                suspended.add(Pair.of(Pair.of(source, target), dice(source, target)));
                            }
                        }
                    }
                }
    
                // push their children (if not handled) into queue
                for (var node : nodes1) {
                    for (var child : node.children) {
                        if (!matched.contains(child)) {
                            queue1.add(child);
                        }
                    }
                }
    
                for (var node : nodes2) {
                    for (var child : node.children) {
                        if (!matched.contains(child)) {
                            queue2.add(child);
                        }
                    }
                }
            }    
        }

        // Bottom-up Phase
        var unmatchedTreesByLabel = new MultiMap<Integer, Tree>();
        for (var tree : tree2.preOrder()) {
            if (!matched.contains(tree)) {
                unmatchedTreesByLabel.put(tree.label, tree);
            }
        }

        for (var tree : tree1.postOrder()) {
            if (!tree.children.isEmpty() && !matched.contains(tree)) {
                var candidates = unmatchedTreesByLabel.get(tree.label);
                if (candidates.isEmpty()) continue;

                var it = candidates.iterator();
                var bestCandidate = it.next();
                double maxScore = dice(tree, bestCandidate);

                while (it.hasNext()) {
                    var candidate = it.next();
                    var score = dice(tree, candidate);
                    if (score > maxScore) {
                        maxScore = score;
                        bestCandidate = candidate;
                    }
                }

                Objects.requireNonNull(bestCandidate);
                if (maxScore > minDice) { // proper match
                    match(tree, bestCandidate, MappingType.container);
                    candidates.remove(bestCandidate);

                    if (tree.isConstructor()) { // detect recovery matching
                        if (tree.children.size() != bestCandidate.children.size()) {
                            throw new IllegalStateException(tree + " has " + tree.children.size() + " children, but " +
                                    bestCandidate + " has " + bestCandidate.children.size() + " children");
                        }

                        for (int i = 0; i < tree.children.size(); i++) {
                            var u = tree.children.get(i);
                            var v = bestCandidate.children.get(i);

                            if (!matched.contains(u) && !matched.contains(v) && u.label == v.label) {
                                match(u, v, MappingType.recovery);
                            }
                        }
                    }
                }
            }
        }

        return m;
    }

    private enum MappingType {
        isomorphic,
        container,
        recovery
    }

    private Map<Tree, Tree> m;
    protected Set<Tree> matched = new HashSet<>();

    private void match(Tree Tree1, Tree Tree2, MappingType type) {
        m.put(Tree1, Tree2);
        matched.add(Tree1);
        matched.add(Tree2);

        Log.finer("%s mapping: %s <-> %s", type, Tree1, Tree2);
    }

    public abstract double dice(Tree Tree1, Tree Tree2);
}
