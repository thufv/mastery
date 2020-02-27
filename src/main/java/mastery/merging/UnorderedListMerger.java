package mastery.merging;

import mastery.tree.node.Node;
import mastery.tree.node.UnorderedList;

import java.util.List;

public class UnorderedListMerger extends ListMerger<UnorderedList> {
    @Override
    protected void handleConflict(List<Task> suspended, List<Node> targets) {
        for (var task : suspended) {
            targets.addAll(task.targetNodes);
        }
    }
}
