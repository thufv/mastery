package mastery.matcher;

import mastery.driver.Config;
import mastery.tree.Tree;
import mastery.util.Interval;
import mastery.util.log.Log;

import java.util.Map;
import java.util.logging.Level;

public abstract class TwoWayMatcher {
    public TwoWayMatcher() {}

    public TwoWayMatcher(Map<Config.Hyperparameter, Object> hyperparameters) {}

    // WARNING: The ORDER is considered!
    // You must pass the BASE tree as FIRST parameter.
    abstract protected void match(Tree tree1, Tree tree2);

    public MappingStore apply(Tree tree1, Tree tree2) {
        m = new MappingStore();

        match(tree1, tree2);
        filter(tree1, tree2);

        return m;
    }

    public MappingStore raw_apply(Tree tree1, Tree tree2) {
        m = new MappingStore();

        match(tree1, tree2);

        return m;
    }

    private void filter(Tree tree1, Tree tree2) {
        // the interval of the other tree is assumed to have been calculated
        for (Tree node: tree1.preOrder()) {
            if (node.parent == null) {
                if (!m.hasSrc(node)) {
                    assert(!m.hasDst(tree2));
                    m.link(node, tree2);
                }

                node.preInterval = m.getDst(node).interval;
            }
            else {
                if (m.hasSrc(node)) {
                    Tree dst = m.getDst(node);
                    if (Interval.isSubinterval(dst.interval, node.parent.preInterval)) {
                        node.preInterval = dst.interval;
                    }
                    else {
//                        Log.finer("preInterval of %s is %s", node.parent, node.parent.preInterval);
//                        Log.finer("interval of %s is %s", dst, dst.interval);
                        m.unlink(node, dst);
                        node.preInterval = node.parent.preInterval;
                    }
                }
                else {
                    node.preInterval = node.parent.preInterval;
                }
            }
//            Log.finest("(filtering) preInterval of %s is %s", node, node.preInterval);
        }
    }

    public boolean checkMonotonicity(Tree tree1, Tree tree2) {
        // the dfs ordering and intervals of tree2 are assumed to have been calculated here
        for (Tree node: tree2.preOrder())
            if (Log.isLoggable(Level.FINE)) {
                Log.fine("interval of `%s` is [%d, %d]", node.toReadableString(), node.interval.l, node.interval.r);
            }

        for (Tree node: tree1.preOrder()) {
            if (node.parent == null)
                node.preInterval = m.getDst(node).interval;
            else {
                if (m.hasSrc(node)) {
                    Tree dst = m.getDst(node);
                    if (Interval.isSubinterval(dst.interval, node.parent.preInterval)) {
                        node.preInterval = dst.interval;
                    }
                    else {
                        // Log.fine(String.format("failed monotonicity check: %s [%d, %d] is the subinterval of %s [%d, %d]", dst, dst.interval.l, dst.interval.r, node.parent, node.parent.preInterval.l, node.parent.preInterval.r));
                        if (Log.isLoggable(Level.FINE)) {
                            Log.fine("failed monotonicity check:");
                        }
                        if (Log.isLoggable(Level.FINE)) {
                            Log.fine("  node: %s (assignment %d)", node.toReadableString(), node.assignment);
                        }
                        if (Log.isLoggable(Level.FINE)) {
                            Log.fine("  dst: %s [%d, %d] (assignment %d)", dst.toReadableString(), dst.interval.l, dst.interval.r, dst.assignment);
                        }
                        if (Log.isLoggable(Level.FINE)) {
                            Log.fine("  preInterval of %s (assignment %d) is [%d, %d]", node.parent.toReadableString(), node.parent.assignment, node.parent.preInterval.l, node.parent.preInterval.r);
                        }
                        return false;
                    }
                }
                else node.preInterval = node.parent.preInterval;
            }

            // System.out.println(String.format("preInterval of `%s` is [%d, %d]", node.toReadableString(), node.preInterval.l, node.preInterval.r));
        }
        return true;
    }

    protected enum MappingType {
        isomorphic,
        container,
        recovery,
        compulsory,
        homonymy
    }

    protected MappingStore m;
}
