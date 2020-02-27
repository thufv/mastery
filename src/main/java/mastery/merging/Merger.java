package mastery.merging;

import mastery.diff.MatchingSet;
import mastery.tree.node.*;
import mastery.util.log.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

public final class Merger implements Function<MatchingSet, Tree> {
    @Override
    public Tree apply(MatchingSet m) {
        var targets = new HashMap<Node, Node>();

        var mergeScenarios = new ArrayList<MergeScenario>();
        for (var node : m.base.postOrder()) {
            if (m.hasLeftMatch(node) && m.hasRightMatch(node)) {
                if (node.isLeaf()) {
                    Leaf b = (Leaf) node;
                    mergeScenarios.add(MergeScenario.of(b, m.getLeftMatch(b), m.getRightMatch(b)));
                } else if (node.isConstructor()) {
                    Constructor b = (Constructor) node;
                    mergeScenarios.add(MergeScenario.of(b, m.getLeftMatch(b), m.getRightMatch(b)));
                } else if (node.isOrderedList()) {
                    OrderedList b = (OrderedList) node;
                    mergeScenarios.add(MergeScenario.of(b, m.getLeftMatch(b), m.getRightMatch(b)));
                } else if (node.isUnorderedList()) {
                    UnorderedList b = (UnorderedList) node;
                    mergeScenarios.add(MergeScenario.of(b, m.getLeftMatch(b), m.getRightMatch(b)));
                } else {
                    throw new IllegalStateException("unknown type of node " + node);
                }
            }
        }

        Log.fine("%d three-way merge scenarios", mergeScenarios.size());

        var threeWayMerger = new ThreeWayMerger(m, targets);
        for (var scenario : mergeScenarios) {
            var target = m.treesEqual(scenario.getBase(), scenario.getLeft()) ? scenario.getRight()
                    : m.treesEqual(scenario.getBase(), scenario.getRight()) ? scenario.getLeft()
                    : m.treesEqual(scenario.getLeft(), scenario.getRight()) ? scenario.getLeft()
                    : scenario.accept(threeWayMerger);
            targets.put(scenario.getBase(), target);
        }

        var root = targets.get(m.base.root);
        return new Tree(root);
    }
}
