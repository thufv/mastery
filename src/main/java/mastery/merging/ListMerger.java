package mastery.merging;

import mastery.tree.input.Node;
import mastery.tree.target.Insertion;
import mastery.tree.target.TargetNode;
import mastery.util.Pair;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public abstract class ListMerger {
    public List<TargetNode> apply(List<Node> left, List<Node> right, List<Pair<Pair<Node, Node>, TargetNode>> mappings) {
        targets.clear();

        var leftIt = left.iterator();
        var rightIt = right.iterator();

        for (var tuple : mappings) {
            var l = tuple.first.first;
            var r = tuple.first.second;
            var merged = tuple.second;

            if (l != null && r != null) {
                addLeftInsert(takeWhileNotEquals(leftIt, l));
                addRightInsert(takeWhileNotEquals(rightIt, r));

                // first handle queued
                handleQueued();

                // then handle the 3-way scenario
                targets.add(merged);
                continue;
            }

            if (l != null) { // Case 2: `b` will be deleted by right version
                addLeftInsert(takeWhileNotEquals(leftIt, l));
                addRightDelete(merged);
                continue;
            }

            if (r != null) { // Case 3: `b` will be deleted by left version
                addRightInsert(takeWhileNotEquals(rightIt, r));
                addLeftDelete(merged);
                continue;
            }

            assert false;
        }

        // there may exist some trailing elements that are unmatched with base
        addLeftInsert(takeWhileNotEquals(leftIt, null));
        addRightInsert(takeWhileNotEquals(rightIt, null));
        handleQueued();

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

    void addLeftDelete(TargetNode target) {
        time++;
        tasks.add(new Task(time, time, true, true, List.of(target)));
        leftTime = time;
    }

    void addRightDelete(TargetNode target) {
        time++;
        tasks.add(new Task(time, time, false, true, List.of(target)));
        rightTime = time;
    }

    void addLeftInsert(List<Node> nodes) {
        tasks.add(new Task(leftTime, time + 1, true, false,
                nodes.stream().map(Insertion::fromLeft).collect(Collectors.toList())));
    }

    void addRightInsert(List<Node> nodes) {
        tasks.add(new Task(rightTime, time + 1, false, false,
                nodes.stream().map(Insertion::fromRight).collect(Collectors.toList())));
    }

    void handleQueued() {
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
                handleConflict(suspended);
                continue;
            }

            suspended.forEach(t -> targets.addAll(t.nodes));
        }
    }

    protected abstract void handleConflict(List<Task> suspended);

    protected List<TargetNode> targets = new ArrayList<>();

    private int time = 0;
    private int leftTime = 0;
    private int rightTime = 0;
    private PriorityQueue<Task> tasks = new PriorityQueue<>();

    protected static class Task {
        final int beginTime;
        final int endTime;
        final boolean left;
        final boolean delete;
        final List<TargetNode> nodes;

        Task(int beginTime, int endTime, boolean left, boolean delete, List<TargetNode> nodes) {
            this.beginTime = beginTime;
            this.endTime = endTime;
            this.left = left;
            this.delete = delete;
            this.nodes = nodes;
        }
    }
}
