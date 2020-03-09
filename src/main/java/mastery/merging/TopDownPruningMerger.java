package mastery.merging;

import mastery.diff.MatchingSet;
import mastery.tree.Tree;
import mastery.util.log.Log;

import java.util.*;

public final class TopDownPruningMerger extends Merger {
    @Override
    protected Tree merge() {
        assert m.matched(m.base, m.left) && m.matched(m.base, m.right);
        targets.clear();
        scenarios.clear();

        // top-down visiting: issue trivial cases
        visit(m.base);

        // bottom-up merging: issue non-trivial cases
        var merger = new ThreeWayMerger(m, targets);
        while (!scenarios.empty()) {
            var scenario = scenarios.pop();
            targets.put(scenario.getBase(), scenario.accept(merger));
        }

        return targets.get(m.base);
    }

    private void visit(Tree base) {
        if (m.hasLeftMatch(base) && m.hasRightMatch(base)) {
            var left = m.getLeftMatch(base);
            var right = m.getRightMatch(base);

            if (m.treesEqual(base, left)) {
                Log.finest("trivial merge scenario: base = left, thus target = right");
                targets.put(base, right);
                return;
            }

            if (m.treesEqual(base, right)) {
                Log.finest("trivial merge scenario: base = right, thus target = left");
                targets.put(base, left);
                return;
            }

            if (m.treesEqual(left, right)) {
                Log.finest("trivial merge scenario: left = right, thus target is either");
                targets.put(base, left);
                return;
            }

            // non-trivial merge scenario
            scenarios.push(base.accept(this));
            base.children.forEach(this::visit);
        }
    }

    private Map<Tree, Tree> targets = new HashMap<>();
    private Stack<MergeScenario> scenarios = new Stack<>();
}
