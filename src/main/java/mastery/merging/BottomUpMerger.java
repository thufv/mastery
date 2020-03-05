package mastery.merging;

import mastery.diff.MatchingSet;
import mastery.tree.*;
import mastery.util.log.Log;

import java.util.ArrayList;
import java.util.HashMap;

public final class BottomUpMerger extends Merger {
    @Override
    public Tree merge() {
        assert m.matched(m.base, m.left) && m.matched(m.base, m.right);

        // collect merge scenarios
        var scenarios = new ArrayList<MergeScenario>();
        var walker = new Tree.PostOrderWalker() {
            @Override
            public void visitLeaf(Leaf leaf) {
                if (m.hasLeftMatch(leaf) && m.hasRightMatch(leaf)) {
                    scenarios.add(MergeScenario.of(leaf, m.getLeftMatch(leaf), m.getRightMatch(leaf)));
                }
            }

            @Override
            public void visitConstructor(Constructor constructor) {
                if (m.hasLeftMatch(constructor) && m.hasRightMatch(constructor)) {
                    scenarios.add(MergeScenario.of(constructor,
                            m.getLeftMatch(constructor), m.getRightMatch(constructor)));
                }
            }

            @Override
            public void visitOrderedList(OrderedList ordered) {
                if (m.hasLeftMatch(ordered) && m.hasRightMatch(ordered)) {
                    scenarios.add(MergeScenario.of(ordered, m.getLeftMatch(ordered), m.getRightMatch(ordered)));
                }
            }

            @Override
            public void visitUnorderedList(UnorderedList unordered) {
                if (m.hasLeftMatch(unordered) && m.hasRightMatch(unordered)) {
                    scenarios.add(MergeScenario.of(unordered, m.getLeftMatch(unordered), m.getRightMatch(unordered)));
                }
            }

            @Override
            public void visitConflict(Conflict conflict) {
                throw new UnsupportedOperationException("input tree cannot have conflict nodes");
            }
        };
        walker.accept(m.base);
        Log.config("%d three-way merge scenarios", scenarios.size());

        // handle merge scenarios
        var targets = new HashMap<Tree, Tree>();
        var merger = new ThreeWayMerger(m, targets);
        for (var scenario : scenarios) {
            if (m.treesEqual(scenario.getBase(), scenario.getLeft())) {
                Log.finest("trivial merge scenario: base = left, thus target = right");
                targets.put(scenario.getBase(), scenario.getRight());
                continue;
            }

            if (m.treesEqual(scenario.getBase(), scenario.getRight())) {
                Log.finest("trivial merge scenario: base = right, thus target = left");
                targets.put(scenario.getBase(), scenario.getLeft());
                continue;
            }

            if (m.treesEqual(scenario.getLeft(), scenario.getRight())) {
                Log.finest("trivial merge scenario: left = right, thus target is either");
                targets.put(scenario.getBase(), scenario.getLeft());
                continue;
            }

            targets.put(scenario.getBase(), scenario.accept(merger));
        }

        return targets.get(m.base);
    }
}
