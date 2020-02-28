package mastery.merging;

import mastery.tree.Conflict;
import mastery.tree.OrderedList;
import mastery.tree.Tree;
import mastery.util.log.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class OrderedListMerger extends ListMerger<OrderedList> {
    @Override
    protected void handleConflict(List<Task> suspended, List<Tree> targets) {
        var left = new ArrayList<Tree>();
        var right = new ArrayList<Tree>();

        for (var task : suspended) {
            if (task.left) {
                left.addAll(task.inputTrees);
            } else {
                right.addAll(task.inputTrees);
            }
        }

        Log.finest("double insertion conflict");
        Log.ifLoggable(Level.FINEST, printer -> {
            printer.println("left");
            printer.incIndent();
            left.forEach(x -> x.prettyPrintTo(printer));
            printer.decIndent();

            printer.println("right");
            printer.incIndent();
            left.forEach(x -> x.prettyPrintTo(printer));
            printer.decIndent();
        });

        // TODO: shall we use something else to record these two lists?
        targets.add(Conflict.ofTwoWay(new OrderedList(label, name, left), new OrderedList(label, name, right)));
    }
}
