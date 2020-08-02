package mastery.matcher.gum;

import java.util.*;

import mastery.matcher.TwoWayMatcher;
import mastery.matcher.ZsMatcher;
import mastery.matcher.Mapping;
import mastery.matcher.MappingStore;
import mastery.tree.Leaf;
import mastery.tree.Tree;
import mastery.util.WeightedQueue;

public class GumTwoWayMatcher extends TwoWayMatcher {
    @Override
    public final MappingStore apply(Tree tree1, Tree tree2) {
        topDown(tree1, tree2);

        bottomUp(tree1, tree2);

        return m;
    }

    // In the implementations of GumTree and Mastery,
    // height is both 0-based.
    // But in the paper of GumTree, height is 1-based.
    // This value is consistent with both the paper and implementation of GumTree.
    public final int MIN_HEIGHT = 1;
    void topDown(Tree tree1, Tree tree2) {
        List<Mapping> ambiguousMappings = new ArrayList<Mapping>();

        var queue1 = new WeightedQueue<Tree>(Tree -> Tree.height);
        var queue2 = new WeightedQueue<Tree>(Tree -> Tree.height);
        queue1.add(tree1);
        queue2.add(tree2);

        // Let's rock!
        while (!queue1.isEmpty() && !queue2.isEmpty() &&
                queue1.maxWeight() > MIN_HEIGHT && queue2.maxWeight() > MIN_HEIGHT) {
            // case 1: queue1 has a larger height
            if (queue1.maxWeight() > queue2.maxWeight()) {
                for (var node : queue1.removeMax())
                    queue1.addAll(node.children);
                continue;
            }

            // case 2: queue2.maxWeight() > queue1.maxWeight()
            if (queue2.maxWeight() > queue1.maxWeight()) {
                for (var node : queue2.removeMax())
                    queue2.addAll(node.children);
                continue;
            }

            // System.out.println(String.format("====== %d ======\n", queue1.maxWeight()));

            // case 3: two queues contain Trees of the same height
            var nodes1 = queue1.removeMax();
            var nodes2 = queue2.removeMax();

            // System.out.println("nodes1:");
            // for (Tree node: nodes1)
            //     System.out.println("\t" + node);
            // System.out.println("nodes2:");
            // for (Tree node: nodes2)
            //     System.out.println("\t" + node);

            Set<Tree> considered = new HashSet<>();
            for (Tree node1: nodes1)
                if (!considered.contains(node1)) {
                    List<Tree> list1 = new ArrayList<>();
                    for (Tree u: nodes1)
                        if (checkIsomorphism(node1, u))
                            list1.add(u);
                    considered.addAll(list1);
                    
                    List<Tree> list2 = new ArrayList<>();
                    for (Tree v: nodes2)
                        if (checkIsomorphism(node1, v))
                            list2.add(v);

                    if (list1.size() == 1 && list2.size() == 1) {
                        addMappingRecursively(list1.get(0), list2.get(0));
                    }
                    else if (list1.size() >= 1 && list2.size() >= 1) {
                        for (Tree u: list1)
                            for (Tree v: list2)
                                ambiguousMappings.add(new Mapping(u, v));
                    } else {
                        // push their children (if not handled) into queue
                        for (var node : list1)
                            queue1.addAll(node.children);
                        for (var node : list2)
                            queue2.addAll(node.children);
                    }

                    nodes2.removeAll(list2);
                }
            for (Tree node: nodes2)
                queue2.addAll(node.children);
        }

        // Rank the mappings by score.
        Collections.sort(ambiguousMappings, new SiblingsMappingComparator(ambiguousMappings, m, Math.max(tree1.size, tree2.size)));

        // Select the best ambiguous mappings
        for (Mapping mapping: ambiguousMappings)
            if (!m.hasSrc(mapping.first) && !m.hasDst(mapping.second))
                addMappingRecursively(mapping.first, mapping.second);
    }

    void addMappingRecursively(Tree node1, Tree node2) {
        m.link(node1, node2);
        for (int i = 0; i < node1.children.size(); ++i)
            addMappingRecursively(node1.children.get(i), node2.children.get(i));
    }

    boolean checkIsomorphism(Tree node1, Tree node2) {
        if (node1.label != node2.label) return false;
        if (node1.children.size() != node2.children.size()) return false;
        if (node1.isLeaf()){
            if (!node2.isLeaf()) return false;
            return ((Leaf)node1).code.equals(((Leaf)node2).code);
        } else {
            if (node1.children.size() != node2.children.size()) return false;
            for (int i = 0; i < node1.children.size(); ++i)
                if (!checkIsomorphism(node1.children.get(i), node2.children.get(i)))
                    return false;
            return true;
        }
    }

    // This doesn't equal to the implementation of GumTree,
    // but is consistent with the paper of GumTree.
    public final int SIZE_THRESHOLD = 100;
    
    // This is both consistent with the paper and the implementation of GumTree.
    public final double SIM_THRESHOLD = 0.5;
    Map<Integer, Tree> srcIds = new HashMap<>();
    Map<Integer, Tree> dstIds = new HashMap<>();
    void bottomUp(Tree tree1, Tree tree2) {
        for (Tree node: tree1.preOrder())
            srcIds.put(node.dfsIndex, node);
        for (Tree node: tree2.preOrder())
            dstIds.put(node.dfsIndex, node);

        for (Tree t: tree1.postOrder()) {
            if (t.parent == null) {
                m.link(t, tree2);
                lastChanceMatch(t, tree2);
                break;
            } else if (!(m.hasSrc(t) || t.isLeaf())) {
                List<Tree> candidates = getDstCandidates(t);
                Tree best = null;
                double max = -1D;

                for (Tree cand: candidates) {
                    double sim = jaccardSimilarity(t, cand);
                    if (sim > max && sim >= SIM_THRESHOLD) {
                        max = sim;
                        best = cand;
                    }
                }

                if (best != null) {
                    lastChanceMatch(t, best);
                    m.link(t, best);
                }
            }
        }
    }
    protected List<Tree> getDstCandidates(Tree src) {
        List<Tree> seeds = new ArrayList<>();
        for (Tree c: src.getDescendants()) {
            Tree d = m.getDst(c);
            if (d != null) seeds.add(d);
        }
        List<Tree> candidates = new ArrayList<>();
        Set<Tree> visited = new HashSet<>();
        for (Tree seed: seeds) {
            while (seed.parent != null) {
                Tree parent = seed.parent;
                if (visited.contains(parent))
                    break;
                visited.add(parent);
                if (parent.label == src.label && !m.hasDst(parent) && parent.parent != null)
                    candidates.add(parent);
                seed = parent;
            }
        }

        return candidates;
    }
    protected void lastChanceMatch(Tree src, Tree dst) {
        // System.out.println("lastChangeMatch " + src + "(" + src.size + ") <-> " + dst + "(" + dst.size + ")");

        Tree cSrc = src.deepCopy();
        Tree cDst = dst.deepCopy();
        List<Tree> children1 = new ArrayList<>();
        children1.addAll(cSrc.children);
        for (Tree node: children1)
            removeMatched(node, true);
        cSrc.refresh();

        // System.out.println("removeMatched of " + src);/

        List<Tree> children2 = new ArrayList<>();
        children2.addAll(cDst.children);
        for (Tree node: children2)
            removeMatched(node, false);
        cDst.refresh();

        // System.out.println("removeMatched of " + dst);

        if (cSrc.size < SIZE_THRESHOLD
                || cDst.size < SIZE_THRESHOLD) {
            TwoWayMatcher matcher = new ZsMatcher();

            // System.out.println("Build mappings between two trees of size " + cSrc.size + " and size " + cDst.size);

            MappingStore mappings = matcher.apply(src, dst);

            // System.out.println("After mapping calculation.");

            for (Mapping mapping: mappings.asSet()) {
                Tree left = srcIds.get(mapping.first.dfsIndex);
                Tree right = dstIds.get(mapping.second.dfsIndex);

                if (left.dfsIndex == src.dfsIndex || right.dfsIndex == dst.dfsIndex) {
                    continue;
                } else if (left.label != right.label || m.hasSrc(left) || m.hasDst(right)) {
                    continue;
                } else if (left.parent.label != right.parent.label) {
                    continue;
                } else
                    m.link(left, right);
            }
        }

        // System.out.println("Finish lastChanceMatch " + src + " <-> " + dst);
    }
    protected double jaccardSimilarity(Tree src, Tree dst) {
        double num = (double) numberOfCommonDescendants(src, dst);
        double den = (double) src.getDescendants().size() + (double) dst.getDescendants().size() - num;
        return num / den;
    }

    protected int numberOfCommonDescendants(Tree src, Tree dst) {
        Set<Tree> dstDescendants = new HashSet<>(dst.getDescendants());
        int common = 0;

        for (Tree t : src.getDescendants()) {
            Tree d = m.getDst(t);
            if (d != null && dstDescendants.contains(d))
                common++;
        }

        return common;
    }
    /**
     * Remove mapped nodes from the tree. Be careful this method will invalidate
     * all the metrics of this tree and its descendants. If you need them, you need
     * to recompute them.
     */
    public Boolean removeMatched(Tree t, boolean isSrc) {
        if ((isSrc && m.hasSrc(srcIds.get(t.dfsIndex)))
            || ((!isSrc) && m.hasDst(srcIds.get(t.dfsIndex)))) {
            return true;
        }
        else {
            List<Tree> new_children = new ArrayList<>();
            for (Tree c: t.children)
                if (!removeMatched(c, isSrc))
                    new_children.add(c);
            t.children = new_children;
            return false;
        }
    }
}