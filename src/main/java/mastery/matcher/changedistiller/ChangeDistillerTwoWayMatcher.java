package mastery.matcher.changedistiller;

import mastery.matcher.Mapping;
import mastery.matcher.Similarities;
import mastery.matcher.TwoWayMatcher;
import mastery.tree.Leaf;
import mastery.tree.Tree;

import java.util.*;

public class ChangeDistillerTwoWayMatcher extends TwoWayMatcher {
    public final double LABEL_SIM_THRESHOLD = 0.5; // 0.6 in the paper
    public final double STRUCT_SIM_THRESHOLD_1 =  0.6; // same in the paper
    public final double STRUCT_SIM_THRESHOLD_2 = 0.4; // same in the paper
    public final int MAX_NUMBER_OF_LEAVES = 4; // same in the paper

    @Override
    protected final void match(Tree tree1, Tree tree2) {
        leavesMatch(tree1, tree2);
        bottomUpMatch(tree1, tree2);
    }

    private void leavesMatch(Tree tree1, Tree tree2) {
        List<Mapping> leavesMappings = new ArrayList<>();
        List<Leaf> leaves1 = retainLeaves(tree1.postOrder());
        List<Leaf> leaves2 = retainLeaves(tree2.postOrder());

        for (Leaf leaf1 : leaves1)
            for (Leaf leaf2 : leaves2)
                if (isMappingAllowed(leaf1, leaf2)) {
                    double sim = Similarities.codeSimilarity(leaf1, leaf2);
                    if (sim > LABEL_SIM_THRESHOLD)
                        leavesMappings.add(new Mapping(leaf1, leaf2));
                }

        Set<Tree> ignored1 = new HashSet<>();
        Set<Tree> ignored2 = new HashSet<>();
        leavesMappings.sort(new LeafMappingComparator());

        while (leavesMappings.size() > 0) {
            Mapping bestMapping = leavesMappings.remove(0);
            if (!(ignored1.contains(bestMapping.first)
                    || ignored2.contains(bestMapping.second))) {
                m.link(bestMapping.first, bestMapping.second);
                ignored1.add(bestMapping.first);
                ignored2.add(bestMapping.second);
            }
        }
    }

    private void bottomUpMatch(Tree tree1, Tree tree2) {
        for (Tree node1: tree1.postOrder()) {
            int numberOfLeaves = numberOfLeaves(node1);
            for (Tree node2: tree2.postOrder()) {
                if (!node1.isLeaf() && !node2.isLeaf()
                        && isMappingAllowed(node1, node2)) {
                    double similarity = Similarities.chawatheSimilarity(numberOfCommonDescendants(node1, node2), node1.size, node2.size);
                    if ((numberOfLeaves > MAX_NUMBER_OF_LEAVES && similarity >= STRUCT_SIM_THRESHOLD_1)
                            || (numberOfLeaves <= MAX_NUMBER_OF_LEAVES && similarity >= STRUCT_SIM_THRESHOLD_2)) {
                        m.link(node1, node2);
                        break;
                    }
                }
            }
        }
    }

    /* helpers */
    private List<Leaf> retainLeaves(Iterable<Tree> trees) {
        List<Leaf> leaves = new ArrayList<>();
        for (Tree tree : trees)
            if (tree.isLeaf())
                leaves.add((Leaf)tree);
        return leaves;
    }

    private int numberOfLeaves(Tree root) {
        int numberOfLeaves = 0;
        for (Tree tree : root.getDescendants())
            if (tree.isLeaf())
                numberOfLeaves++;
        return numberOfLeaves;
    }

    private boolean isMappingAllowed(Tree src, Tree dst) {
        return src.label == dst.label && !m.hasSrc(src) && !m.hasDst(dst);
    }

    private int numberOfCommonDescendants(Tree tree1, Tree tree2) {
        Set<Tree> descendants2 = new HashSet<>(tree2.getDescendants());
        int common = 0;
        for (Tree node1 : tree1.getDescendants()) {
            Tree node2 = m.getDst(node1);
            if (node2 != null && descendants2.contains(node2))
                common++;
        }
        return common;
    }

    private static class LeafMappingComparator implements Comparator<Mapping> {
        @Override
        public int compare(Mapping m1, Mapping m2) {
            return Double.compare(sim(m1), sim(m2));
        }

        public double sim(Mapping m) {
            return Similarities.codeSimilarity(m.first, m.second);
        }
    }
}
