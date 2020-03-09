package mastery.matcher.ta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import mastery.matcher.TwoWayMatcher;
import mastery.tree.Tree;
import mastery.util.MultiMap;
import mastery.util.WeightedQueue;
import mastery.util.Pair;

public class TaTwoWayMatcher extends TwoWayMatcher{
    public final int minHeight;
    public final double minDice;
    public final double maxDice;

    public TaTwoWayMatcher(int minHeight, double minDice, double maxDice) {
        this.minHeight = minHeight;
        this.minDice = minDice;
        this.maxDice = maxDice;
    }
    public TaTwoWayMatcher() {
        this.minHeight = 2; // default parameter of GumTree
        this.minDice = 0.5; // default parameter of GumTree
        this.maxDice = 0.7; // default customized parameter
    }

    @Override
    public final Map<Tree, Tree> apply(Tree tree1, Tree tree2) {
        // Calculate the information about dfs order
        {
            Integer index = 0;
            for (Tree node : tree2.preOrder()) {
                node.dfsIndex = ++index;
            }
            
            tree1.AncestorInterval = Pair.of(1, index);
        }

        // Initialization of map
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
    
                // assignment count
                var nodes1Of = new ArrayList<List<Tree>>();
                for (var node: nodes1) {
                    while (nodes1Of.size() <= node.assignment) {
                        nodes1Of.add(new ArrayList<Tree>());
                    }
                    nodes1Of.get(node.assignment).add(node);
                }
                var nodes2Of = new ArrayList<List<Tree>>();
                for (var node: nodes2) {
                    while (nodes2Of.size() <= node.assignment) {
                        nodes2Of.add(new ArrayList<Tree>());
                    }
                    nodes2Of.get(node.assignment).add(node);
                }
    
                for (int assignment = 1; assignment < Math.min(nodes1Of.size(), nodes2Of.size()); ++assignment) {
                    var list1 = nodes1Of.get(assignment);
                    var list2 = nodes2Of.get(assignment);
                    if (list1.size() >= 1 && list2.size() >= 1) {
                        if (list1.size() == 1 && list2.size() == 1) {
                            // TODO: pre match
                        }
                        else {
                            Collections.shuffle(list1);
                            Collections.shuffle(list2);
                            for (var node1: list1)
                                for (var node2: list2) {

                                }
                            // TODO: pre match
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

    @Override
    public final double dice(Tree tree1, Tree tree2) {

    }
}
