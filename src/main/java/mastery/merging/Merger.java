package mastery.merging;

import mastery.diff.MatchingSet;
import mastery.tree.input.*;
import mastery.tree.target.TargetNode;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.function.Function;

public final class Merger implements Function<MatchingSet, TargetNode> {
    @Override
    public TargetNode apply(MatchingSet m) {
        var targets = new Hashtable<Node, TargetNode>();

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
                } else {
                    UnorderedList b = (UnorderedList) node;
                    mergeScenarios.add(MergeScenario.of(b, m.getLeftMatch(b), m.getRightMatch(b)));
                }
            }
        }

        var threeWayMerger = new ThreeWayMerger(m, targets);
        for (var scenario : mergeScenarios) {
            var target = scenario.accept(threeWayMerger);
            targets.put(scenario.getBase(), target);
        }

        return targets.get(m.base.root);
    }
}
