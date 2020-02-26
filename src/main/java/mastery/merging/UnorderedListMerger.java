package mastery.merging;

import java.util.List;

public class UnorderedListMerger extends ListMerger {
    @Override
    protected void handleConflict(List<Task> suspended) {
        suspended.forEach(t -> targets.addAll(t.nodes));
    }
}
