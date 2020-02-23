package mastery.merge;

import mastery.tree.ConflictingNode;
import mastery.tree.Node;
import mastery.tree.OrderedList;
import mastery.util.log.Log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class OrderedMerge implements IMerge<OrderedList> {
    @Override
    public OrderedList apply(OrderedList base, OrderedList left, OrderedList right) {
        Log.finest("ordered: %s", base.name);

        var leftIt = left.children.iterator();
        var rightIt = right.children.iterator();

        var target = new ArrayList<Node>();
        var queue = new TaskQueue(target);

        for (var b : base.children) {
            if (b.leftMatch != null && b.rightMatch != null) { // Case 1: will recursively handle the 3-way scenario
                queue.addLeftInsert(takeWhileNotEquals(leftIt, b.leftMatch));
                queue.addRightInsert(takeWhileNotEquals(rightIt, b.rightMatch));

                // first handle suspended
                queue.handle();

                // then handle the 3-way scenario
                target.add(new Dispatcher().apply(b, b.leftMatch, b.rightMatch));
                continue;
            }

            if (b.leftMatch != null) { // Case 2: `b` will be deleted by right version
                queue.addLeftInsert(takeWhileNotEquals(leftIt, b.leftMatch));
                queue.addRightDelete(b, b.leftMatch);
                continue;
            }

            if (b.rightMatch != null) { // Case 3: `b` will be deleted by left version
                queue.addRightInsert(takeWhileNotEquals(rightIt, b.rightMatch));
                queue.addLeftDelete(b, b.rightMatch);
                continue;
            }

            assert false;
        }

        // there may exist some trailing elements that are unmatched with base
        queue.addLeftInsert(takeWhileNotEquals(leftIt, null));
        queue.addRightInsert(takeWhileNotEquals(rightIt, null));
        queue.handle();

        return new OrderedList(base.label, base.name, target);
    }

    private static List<Node> takeWhileNotEquals(Iterator<Node> it, Node target) {
        var collected = new ArrayList<Node>();
        while (it.hasNext()) {
            var e = it.next();
            if (e == target) {
                break;
            }
            collected.add(e);
        }

        return collected;
    }

    private static class TaskQueue {
        TaskQueue(List<Node> target) {
            this.target = target;
        }

        void addLeftDelete(Node base, Node right) {
            time++;
            tasks.add(new Task(time, time, true, true, List.of(base, right)));
            leftTime = time;
        }

        void addRightDelete(Node base, Node left) {
            time++;
            tasks.add(new Task(time, time, false, true, List.of(base, left)));
            rightTime = time;
        }

        void addLeftInsert(List<Node> nodes) {
            tasks.add(new Task(leftTime, time + 1, true, false, nodes));
        }

        void addRightInsert(List<Node> nodes) {
            tasks.add(new Task(rightTime, time + 1, false, false, nodes));
        }

        void handle() {
            while (!tasks.isEmpty()) {
                var suspended = new ArrayList<Task>();
                boolean leftInserted = false;
                boolean rightInserted = false;

                var task = tasks.remove();
                suspended.add(task);
                var maxTime = task.endTime;

                while (!tasks.isEmpty() && tasks.peek().beginTime <= maxTime) {
                    task = tasks.remove();
                    suspended.add(task);
                    maxTime = Math.max(maxTime, task.endTime);

                    if (!task.delete && task.left) {
                        leftInserted = true;
                    } else if (!task.delete) {
                        rightInserted = true;
                    }
                }

                if (leftInserted && rightInserted) { // conflict
                    continue;
                }

                suspended.forEach(this::execute);
            }
        }

        private int time = 0;
        private int leftTime = 0;
        private int rightTime = 0;
        private PriorityQueue<Task> tasks = new PriorityQueue<>();
        private final List<Node> target;

        private static class Task {
            final int beginTime;
            final int endTime;
            final boolean left;
            final boolean delete;
            final List<Node> nodes;

            Task(int beginTime, int endTime, boolean left, boolean delete, List<Node> nodes) {
                this.beginTime = beginTime;
                this.endTime = endTime;
                this.left = left;
                this.delete = delete;
                this.nodes = nodes;
            }
        }

        private void execute(Task task) {
            if (task.delete) {
                var base = task.nodes.get(0);
                var node = task.nodes.get(1);

                if (base.treeHash == node.treeHash) {
                    Log.finest("%s is only matched with base, thus deleted", node);
                } else {
                    target.add(new ConflictingNode(base, task.left ? node : null, task.left ? null : node));
                }
                return;
            }

            target.addAll(task.nodes);
        }
    }
}
