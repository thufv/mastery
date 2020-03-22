package mastery.merger;

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
            public void visitLeaf(Leaf leaf, Object... ctx) {
                if (m.hasLeftMatch(leaf) && m.hasRightMatch(leaf)) {
                    scenarios.add(MergeScenario.of(leaf, m.getLeftMatch(leaf), m.getRightMatch(leaf)));
                }
            }

            @Override
            public void visitConstructor(Constructor constructor, Object... ctx) {
                if (m.hasLeftMatch(constructor) && m.hasRightMatch(constructor)) {
                    scenarios.add(MergeScenario.of(constructor,
                            m.getLeftMatch(constructor), m.getRightMatch(constructor)));
                }
            }

            @Override
            public void visitOrderedList(OrderedList ordered, Object... ctx) {
                if (m.hasLeftMatch(ordered) && m.hasRightMatch(ordered)) {
                    scenarios.add(MergeScenario.of(ordered, m.getLeftMatch(ordered), m.getRightMatch(ordered)));
                }
            }

            @Override
            public void visitUnorderedList(UnorderedList unordered, Object... ctx) {
                if (m.hasLeftMatch(unordered) && m.hasRightMatch(unordered)) {
                    scenarios.add(MergeScenario.of(unordered, m.getLeftMatch(unordered), m.getRightMatch(unordered)));
                }
            }

            @Override
            public void visitConflict(Conflict conflict, Object... ctx) {
                throw new UnsupportedOperationException("input tree cannot have conflict nodes");
            }
        };
        walker.accept(m.base);
        Log.config("%d three-way merge scenarios", scenarios.size());

        // handle merge scenarios
        var targets = new HashMap<Tree, Tree>();
        var merger = new ThreeWayMerger(m, targets);
        for (var scenario : scenarios) {
            targets.put(scenario.getBase(), scenario.accept(merger));
        }

        return targets.get(m.base);
    }
}
