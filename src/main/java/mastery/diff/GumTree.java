package mastery.diff;

import mastery.tree.input.Node;
import mastery.tree.input.Tree;
import mastery.util.MultiMap;
import mastery.util.Pair;
import mastery.util.WeightedQueue;

import java.util.*;

public abstract class GumTree {

    protected final int minHeight;

    protected final double minDice;

    public GumTree(int minHeight, double minDice) {
        this.minHeight = minHeight;
        this.minDice = minDice;
    }

    public void apply(Tree tree1, Tree tree2) {
        var nodesByHash = new MultiMap<Integer, Node>();
        for (var node : tree2.preOrder()) {
            nodesByHash.put(node.treeHash, node);
        }

        var suspended = new ArrayList<Pair<Pair<Node, Node>, Double>>();

        // top-down pass

        var queue1 = new WeightedQueue<Node>(node -> node.height);
        var queue2 = new WeightedQueue<Node>(node -> node.height);
        queue1.add(tree1.root);
        queue2.add(tree2.root);

        while (!queue1.isEmpty() && !queue2.isEmpty() &&
                queue1.maxWeight() > minHeight && queue2.maxWeight() > minHeight) {
            // case 1: queue1 has a larger height
            if (queue1.maxWeight() > queue2.maxWeight()) {
                for (var node : queue1.removeMax()) {
                    queue1.addAll(node.children);
                }
                continue;
            }

            // case 2: queue2.maxWeight() > queue1.maxWeight()
            if (queue2.maxWeight() > queue1.maxWeight()) {
                for (var node : queue2.removeMax()) {
                    queue2.addAll(node.children);
                }
                continue;
            }

            // case 3: two queues contain nodes of the same height
            var nodes1 = queue1.removeMax();
            var nodes2 = queue2.removeMax();

            // collect tree hash values of all nodes from tree 2 in a set for efficient comparison
            var hashes = new HashSet<Integer>();
            for (var node : nodes2) {
                hashes.add(node.treeHash);
            }

            // check if any node from tree 1 has one (directly record) or more (suspend first) match
            for (var source : nodes1) {
                if (hashes.contains(source.treeHash)) {
                    var targets = nodesByHash.get(source.treeHash);
                    if (targets.size() == 1) {
                        match(source, targets.get(0), MappingType.isomorphic);
                    } else {
                        for (var target : targets) {
                            System.out.println("suspend " + source + " <-> " + target);
                            suspended.add(Pair.of(Pair.of(source, target), dice(source, target)));
                        }
                    }
                }
            }

            // push their children (if not handled) into queue
            for (var node : nodes1) {
                for (var child : node.children) {
                    if (!child.matched) {
                        queue1.add(child);
                    }
                }
            }

            for (var node : nodes2) {
                for (var child : node.children) {
                    if (!child.matched) {
                        queue2.add(child);
                    }
                }
            }
        }

        System.out.println("handle suspended " + suspended.size());

        // handle suspended
        suspended.sort(Collections.reverseOrder(Comparator.comparing(p -> p.second)));
        while (!suspended.isEmpty()) {
            var it = suspended.iterator();
            var q = it.next().first;
            match(q.first, q.second, MappingType.isomorphic);
            it.remove();

            while (it.hasNext()) {
                var p = it.next().first;
                if (p.first == q.first || p.second == q.second) {
                    it.remove();
                }
            }
        }

        // bottom-up pass
        var unmatchedNodesByLabel = new MultiMap<Integer, Node>();
        for (var node : tree2.preOrder()) {
            if (!node.matched) {
                unmatchedNodesByLabel.put(node.label, node);
            }
        }

        for (var node : tree1.postOrder()) {
            if (!node.children.isEmpty() && !node.matched) {
                var candidates = unmatchedNodesByLabel.get(node.label);
                if (candidates.isEmpty()) continue;

                var it = candidates.iterator();
                var bestCandidate = it.next();
                double maxScore = dice(node, bestCandidate);

                while (it.hasNext()) {
                    var candidate = it.next();
                    var score = dice(node, candidate);
                    if (score > maxScore) {
                        maxScore = score;
                        bestCandidate = candidate;
                    }
                }

                Objects.requireNonNull(bestCandidate);
                if (maxScore > minDice) { // proper match
                    match(node, bestCandidate, MappingType.container);
                    candidates.remove(bestCandidate);

                    if (node.isConstructor()) { // detect recovery matching
                        if (node.children.size() != bestCandidate.children.size()) {
                            throw new IllegalStateException(node + " has " + node.children.size() + " children, but " +
                                    bestCandidate + " has " + bestCandidate.children.size() + " children");
                        }

                        for (int i = 0; i < node.children.size(); i++) {
                            var u = node.children.get(i);
                            var v = bestCandidate.children.get(i);

                            if (!u.matched && !v.matched) {
                                match(u, v, MappingType.recovery);
                            }
                        }
                    }
                }
            }
        }
    }

    private enum MappingType {
        isomorphic,
        container,
        recovery
    }

    private void match(Node node1, Node node2, MappingType type) {
        node1.matched = true;
        node2.matched = true;

        System.out.println(type + " mapping: " + node1 + " <-> " + node2);
    }

    public abstract double dice(Node node1, Node node2);
}
