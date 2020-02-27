package mastery.merging;

import mastery.tree.node.ListNode;
import mastery.tree.node.Node;
import mastery.util.Pair;
import mastery.util.WeightedQueue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public abstract class ListMerger<L extends ListNode> {
    public List<Node> apply(L left, L right, List<Pair<Pair<Node, Node>, Node>> mappings) {
        var targets = new ArrayList<Node>();
        label = left.label;
        name = left.name;

        var leftIt = left.children.iterator();
        var rightIt = right.children.iterator();

        for (var tuple : mappings) {
            var l = tuple.first.first;
            var r = tuple.first.second;
            var merged = tuple.second;

            if (l != null && r != null) {
                addLeftInsert(takeWhileNotEquals(leftIt, l));
                addRightInsert(takeWhileNotEquals(rightIt, r));

                // first handle queued
                handleQueued(targets);

                // then handle the 3-way scenario
                targets.add(merged);
                continue;
            }

            if (l != null) { // Case 2: `b` will be deleted by right version
                addLeftInsert(takeWhileNotEquals(leftIt, l));
                addRightDelete(l, merged);
                continue;
            }

            if (r != null) { // Case 3: `b` will be deleted by left version
                addRightInsert(takeWhileNotEquals(rightIt, r));
                addLeftDelete(r, merged);
                continue;
            }

            assert false;
        }

        // there may exist some trailing elements that are unmatched with base
        addLeftInsert(takeWhileNotEquals(leftIt, null));
        addRightInsert(takeWhileNotEquals(rightIt, null));
        handleQueued(targets);

        return targets;
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

    void addLeftDelete(Node right, Node target) {
        time++;
        tasks.add(new Task(time, time, true, true, List.of(target), List.of(right)));
        rightTime = time;
    }

    void addRightDelete(Node left, Node target) {
        time++;
        tasks.add(new Task(time, time, false, true, List.of(target), List.of(left)));
        leftTime = time;
    }

    void addLeftInsert(List<Node> nodes) {
        if (nodes.isEmpty()) return;

        tasks.add(new Task(leftTime, time + 1, true, false,
                nodes, nodes));
    }

    void addRightInsert(List<Node> nodes) {
        if (nodes.isEmpty()) return;

        tasks.add(new Task(rightTime, time + 1, false, false,
                nodes, nodes));
    }

    void handleQueued(List<Node> targets) {
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
                handleConflict(suspended, targets);
                continue;
            }

            suspended.forEach(t -> targets.addAll(t.targetNodes));
        }
    }

    protected abstract void handleConflict(List<Task> suspended, List<Node> targets);

    protected int label;
    protected String name;

    private int time = 0;
    private int leftTime = 0;
    private int rightTime = 0;
    private PriorityQueue<Task> tasks = new WeightedQueue<>(task -> task.beginTime);

    protected static class Task {
        final int beginTime;
        final int endTime;
        final boolean left;
        final boolean delete;
        final List<Node> targetNodes;
        final List<Node> inputNodes;

        Task(int beginTime, int endTime, boolean left, boolean delete,
             List<Node> targetNodes, List<Node> inputNodes) {
            this.beginTime = beginTime;
            this.endTime = endTime;
            this.left = left;
            this.delete = delete;
            this.targetNodes = targetNodes;
            this.inputNodes = inputNodes;
        }

        @Override
        public String toString() {
            return String.format("%s %s @(%d, %d)", left ? "left" : "right",
                    delete ? "delete" : "insert", beginTime, endTime);
        }
    }
}
