package mastery.merge;

import mastery.tree.Node;
import mastery.tree.UnorderedList;
import mastery.util.log.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UnorderedMerge implements IMerge<UnorderedList> {
    @Override
    public UnorderedList apply(UnorderedList base, UnorderedList left, UnorderedList right) {
        Log.finest("unordered: %s", base.name);
        var target = new ArrayList<Node>();
        for (var node : left.children) {
            if (!node.merged) {
                handle(node, true, target);
            }
        }
        for (var node : right.children) {
            if (!node.merged) {
                handle(node, false, target);
            }
        }

        return new UnorderedList(base.label, base.name, target);
    }

    private void handle(Node node, boolean fromLeft, List<Node> target) {
        if (!node.matched) { // Case 1: unmatched
            target.add(node);
            node.merged = true;
            Log.finest("%s is unmatched, thus inserted", node);
            return;
        }

        var b = node.baseMatch;
        Objects.requireNonNull(b);
        if ((fromLeft ? b.leftMatch : b.rightMatch) != null) { // Case 2.1: matched with both base and opposing version
            var merged = new Dispatcher().apply(b, b.leftMatch, b.rightMatch);
            target.add(merged);
            return;
        }

        // Case 2.2: only matched with base
        node.merged = true;
        Log.finest("%s is only matched with base, thus deleted", node);
    }
}
