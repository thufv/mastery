package mastery.merger;

import mastery.tree.Tree;
import mastery.util.log.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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
                Log.config("detect trivial merge scenario (base = left)");
                targets.put(base, right.deepCopy());
                return;
            }

            if (m.treesEqual(base, right)) {
                Log.config("detect trivial merge scenario (base = right)");
                targets.put(base, left.deepCopy());
                return;
            }

            if (m.treesEqual(left, right)) {
                Log.config("detect trivial merge scenario (left = right)");
                targets.put(base, left.deepCopy());
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
