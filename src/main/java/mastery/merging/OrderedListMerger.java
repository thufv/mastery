package mastery.merging;

import mastery.tree.node.Conflict;
import mastery.tree.node.Node;
import mastery.tree.node.OrderedList;
import mastery.util.log.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class OrderedListMerger extends ListMerger<OrderedList> {
    @Override
    protected void handleConflict(List<Task> suspended, List<Node> targets) {
        var left = new ArrayList<Node>();
        var right = new ArrayList<Node>();

        for (var task : suspended) {
            if (task.left) {
                left.addAll(task.inputNodes);
            } else {
                right.addAll(task.inputNodes);
            }
        }

        Log.finest("double insertion conflict");
        Log.ifLoggable(Level.FINEST, printer -> {
            printer.println("left");
            printer.incIndent();
            for (var u : left) {
                printer.println(u.prettyPrint());
            }
            printer.decIndent();

            printer.println("right");
            printer.incIndent();
            for (var u : right) {
                printer.println(u.prettyPrint());
            }
            printer.decIndent();
        });

        // TODO: shall we use something else to record these two lists?
        targets.add(Conflict.ofTwoWay(new OrderedList(label, name, left), new OrderedList(label, name, right)));
    }
}
