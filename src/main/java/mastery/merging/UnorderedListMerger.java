package mastery.merging;

import mastery.tree.Tree;
import mastery.tree.UnorderedList;

import java.util.List;

public class UnorderedListMerger extends ListMerger<UnorderedList> {
    @Override
    protected void handleConflict(List<Task> suspended, List<Tree> targets) {
        for (var task : suspended) {
            targets.addAll(task.targetTrees);
        }
    }
}
