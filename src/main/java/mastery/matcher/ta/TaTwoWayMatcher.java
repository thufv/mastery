package mastery.matcher.ta;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.simmetrics.StringMetrics;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mastery.matcher.TwoWayMatcher;
import mastery.matcher.Similarities;
import mastery.tree.Leaf;
import mastery.tree.Tree;
import mastery.util.WeightedQueue;
import mastery.util.log.Log;
import mastery.util.Interval;

public class TaTwoWayMatcher extends TwoWayMatcher{
    // Parameters
    public final int minHeight;
    public final double minDice;
    public final int maxSize;

    public TaTwoWayMatcher(int minHeight, double minDice, int maxSize) {
        this.minHeight = minHeight;
        this.minDice = minDice;
        this.maxSize = maxSize;
    }
    public TaTwoWayMatcher() {
        // default parameters in the paper of GumTree
        this.minHeight = 1;
        this.minDice = 0.5;
        this.maxSize = 1000;
    }

    private Tree root1;
    private Tree root2;

    // The order of arguments matters!
    @Override
    public final Map<Tree, Tree> apply(Tree tree1, Tree tree2) {
        // Necessary initializations
        initMatch(tree1, tree2);
        initDice(tree1.size, tree2.size);

        for (Tree node: tree1.preOrder()) {
            node.postLCA = null;
            node.recoveryBuddy = null;
            node.preInterval = null;
        }

        root1 = tree1;
        root2 = tree2;

        // Top-down Phase
        {
            // Initializations
            tree1.preInterval = Interval.of(1, tree2.size);

            var queue1 = new WeightedQueue<Tree>(Tree -> Tree.height);
            var queue2 = new WeightedQueue<Tree>(Tree -> Tree.height);
            queue1.add(tree1);
            queue2.add(tree2);
    
            // Let's rock!
            while (!queue1.isEmpty() && !queue2.isEmpty() &&
                    queue1.maxWeight() > minHeight && queue2.maxWeight() > minHeight) {
                // case 1: queue1 has a larger height
                if (queue1.maxWeight() > queue2.maxWeight()) {
                    for (var node : queue1.removeMax()) {
                        queue1.addAll(node.children);
                    }
                    continue;
                }
    
                // case 2: queue2.maxWeight() > queue1.maxWeight()
                if (queue2.maxWeight() > queue1.maxWeight()) {
                    for (var node : queue2.removeMax()) {
                        queue2.addAll(node.children);
                    }
                    continue;
                }
    
                // case 3: two queues contain Trees of the same height
                var nodes1 = queue1.removeMax();
                var nodes2 = queue2.removeMax();
    
                // assignment count
                var nodes1Of = new ArrayList<List<Tree>>();
                for (var node: nodes1) {
                    while (nodes1Of.size() <= node.assignment) {
                        nodes1Of.add(new ArrayList<Tree>());
                    }
                    nodes1Of.get(node.assignment).add(node);
                }
                var nodes2Of = new ArrayList<List<Tree>>();
                for (var node: nodes2) {
                    while (nodes2Of.size() <= node.assignment) {
                        nodes2Of.add(new ArrayList<Tree>());
                    }
                    nodes2Of.get(node.assignment).add(node);
                }
    
                for (int assignment = 1; assignment < Math.min(nodes1Of.size(), nodes2Of.size()); ++assignment) {
                    var list1 = nodes1Of.get(assignment);
                    var list2 = nodes2Of.get(assignment);

                    if (list1.size() <= list2.size()) {
                        Collections.shuffle(list1);
                        for (var node1: list1) {
                            assertFalse(list2.isEmpty());

                            Tree maxNode = list2.get(0);

                            if (maxNode != root2) {
                                double maxDice = getMemoizedDice(node1.getParent(), maxNode.getParent());
                                for (int i = 1; i < list2.size(); ++i) {
                                    Tree tmpNode = list2.get(i);
                                    double tmpDice = getMemoizedDice(node1, tmpNode);
                                    if (maxDice < tmpDice) {
                                        maxNode = tmpNode;
                                        maxDice = tmpDice;
                                    }
                                }
                            }

                            preMatch(node1, maxNode);

                            list2.remove(maxNode);
                        }
                    }
                    else {
                        Collections.shuffle(list2);
                        for (var node2: list2) {
                            assertFalse(list2.isEmpty());
                            
                            Tree maxNode = list1.get(0);
                            double maxDice = getMemoizedDice(maxNode.getParent(), node2.getParent());
                            for (int i = 1; i < list1.size(); ++i) {
                                Tree tmpNode = list1.get(i);
                                double tmpDice = getMemoizedDice(tmpNode, node2);
                                if (maxDice < tmpDice) {
                                    maxNode = tmpNode;
                                    maxDice = tmpDice;
                                }
                            }

                            preMatch(maxNode, node2);

                            list1.remove(maxNode);
                        }
                    }
                }
    
                // push their children (if not handled) into queue
                for (var node : nodes1) 
                    if (matched1to2[node.dfsIndex] == 0) {
                        queue1.addAll(node.children);
                    }
    
                for (var node : nodes2)
                    if (matched2to1[node.dfsIndex] == 0) {
                        queue2.addAll(node.children);
                    }
            }    
        }

        // Bottom-up Phase
        bottomUpDfs(tree1);

        return m;
    }

    // utils of matching
    private int[] matched1to2; // matched1to2[tree1.dfsIndex] = tree2.dfsIndex
    private int[] matched2to1; // matched2to1[tree2.dfsIndex] = tree1.dfsIndex
    private Tree[] nodeInDfsOrdering1; // nodeInDfsOrdering1[node1.dfsIndex] = node
    private Tree[] nodeInDfsOrdering2; // nodeInDfsOrdering2[node2.dfsIndex] = node
    private void initMatch(Tree tree1, Tree tree2) {
        m = new HashMap<Tree, Tree>();

        matched1to2 = new int[tree1.size + 1];
        matched2to1 = new int[tree2.size + 1];

        nodeInDfsOrdering1 = new Tree[tree1.size + 1];
        for (Tree node: tree1.preOrder()) {
            nodeInDfsOrdering1[node.dfsIndex] = node;
        }
        nodeInDfsOrdering2 = new Tree[tree2.size + 1];
        for (Tree node: tree2.preOrder()) {
            nodeInDfsOrdering2[node.dfsIndex] = node;
        }

        // System.out.println("length of nodeInDfsOrdering2 = " + (tree2.size + 1));
    }
    protected void match(Tree tree1, Tree tree2, MappingType type) {
        m.put(tree1, tree2);

        assertEquals(matched1to2[tree1.dfsIndex], 0);
        matched1to2[tree1.dfsIndex] = tree2.dfsIndex;

        assertEquals(matched2to1[tree2.dfsIndex], 0);
        matched2to1[tree2.dfsIndex] = tree1.dfsIndex;

        if (type == MappingType.isomorphic) {
            updateMemoizedDice(tree1, tree2);
        }

        tree1.preInterval = tree2.interval;
        tree1.postLCA = tree2;

        if (type != MappingType.isomorphic && tree1.isConstructor()) {
            assert tree2.isConstructor();
            for (int i = 0; i < tree1.children.size(); ++i) {
                Tree child1 = tree1.children.get(i);
                if (child1.height == 0) {
                    Tree child2 = tree2.children.get(i);
                    if (matched1to2[child1.dfsIndex] != 0) {
                        assert matched1to2[child1.dfsIndex] == child2.dfsIndex;
                    }
                    else {
                        match(child1, child2, MappingType.recovery);
                    }
                }
            }
        }

        Log.finer("%s mapping: %s <-> %s", type, tree1, tree2);
    }
    private boolean checkMatchingOfConstructors(Tree tree1, Tree tree2) {
        Tree parent1 = tree1.getParent();
        Tree parent2 = tree2.getParent();
        if (parent1 == null) return parent2 == null;
        else {
            if (parent2 == null) return false;
            else {
                if (!parent1.isConstructor() || !parent2.isConstructor() || parent1.label != parent2.label) return true;
                else {
                    return tree1.childno == tree2.childno;
                }
            }
        }
    }

    private void getPreInterval(Tree node) {
        if (node.preInterval == null) {
            Tree parent = node.getParent();
            if (parent != null) {
                if (parent.isOrderedList() && node.childno != 0) {
                    Tree brother = parent.children.get(node.childno - 1);
                    getPreInterval(brother);
                    node.preInterval = brother.preInterval;
                }
                else {
                    getPreInterval(parent);
                    node.preInterval = parent.preInterval;
                }
            }
        }
    }
    private void matchSubTree(Tree tree1, Tree tree2) {
        match(tree1, tree2, MappingType.isomorphic);
        
        assertEquals(tree1.children.size(), tree2.children.size());
        for (int i = 0; i < tree1.children.size(); ++i) {
            matchSubTree(tree1.children.get(i), tree2.children.get(i));
        }
    }
    private void preMatch(Tree tree1, Tree tree2) {
        getPreInterval(tree1);

        if (Interval.isSubinterval(tree2.interval, tree1.preInterval) && checkMatchingOfConstructors(tree1, tree2)) {
            matchSubTree(tree1, tree2);
        }
    }
    
    // utils of dice function
    // interMappingCount[dfsIndex of tree1][indexAtHeight of tree2]
    // private int[][] interMappingCount;
    private void initDice(int size1, int size2) {
        // interMappingCount = new int[size1 + 1][size2 + 1];
    }
    private void updateMemoizedDice(Tree tree1, Tree tree2) {
        // ++interMappingCount[tree1.dfsIndex][tree2.dfsIndex];
        // if (tree1.getParent() != null && tree2.getParent() != null) {
        //     updateMemoizedDice(tree1.getParent(), tree2.getParent());
        // }
    }
    private int interMappingCount(Tree tree1, Tree tree2) {
        int ans = 0;
        if (Interval.in(matched1to2[tree1.dfsIndex], tree2.interval)) {
            ans = 1;
        }
        for (Tree child: tree1.children) {
            ans += interMappingCount(child, tree2);
        }
        return ans;
    }
    private double getMemoizedDice(Tree tree1, Tree tree2) {
        return Similarities.jaccardSimilarity(interMappingCount(tree1, tree2), tree1.size, tree2.size);
    }

    /**
     * @param node the node of the base tree in post-order dfs
     * @return the mappings in the subtree of the node
     */
    private int bottomUpDfs(Tree node) {
        int mappingCount = 0;

        // container mapping
        if (matched1to2[node.dfsIndex] != 0) {
            ++mappingCount;

            for (int i = node.children.size() - 1; i >= 0; --i) {
                mappingCount += bottomUpDfs(node.children.get(i));
            }
        }
        else {
            for (Tree child: node.children) {
                mappingCount += bottomUpDfs(child);
                node.postLCA = Tree.getLCA(node.postLCA, child.postLCA);
            }
            
            {
                Tree parent = node.getParent();
                if (parent != null && parent.isOrderedList() && node.childno != parent.children.size() - 1) {
                    node.postLCA = Tree.getLCA(node.postLCA, parent.children.get(node.childno + 1).postLCA);
                }
            }
            
            if (node == root1) {
                match(root1, root2, MappingType.container);
                if (Math.max(root1.size, root2.size) < maxSize) {
                    mappingCount += recovery(node, root2);
                }
            }
            else {
                if (node.postLCA != null) {
                    assert Interval.isSubinterval(node.postLCA.interval, node.preInterval);

                    Tree candidate = node.postLCA;

                    while (candidate != null && (matched2to1[candidate.dfsIndex] != 0 || node.label != candidate.label)) {
                        candidate = candidate.getParent();
                    }

                    if (candidate != null && Interval.isProperSubinterval(candidate.interval, node.preInterval)) {
                        // get the candidate!
                        // let's check the dice!

                        if (Similarities.jaccardSimilarity(mappingCount, node.size, candidate.size) > minDice) {

                            if (checkMatchingOfConstructors(node, candidate)) {
                                match(node, candidate, MappingType.container);
                                if (Math.max(node.size, candidate.size) < maxSize) {
                                    mappingCount += recovery(node, candidate);
                                }
                            }
                        }
                    }
                }
            }
        }
        return mappingCount;
    }

    private ZsTree zsSrc;
    private ZsTree zsDst;

    private double[][] treeDist;
    private double[][] forestDist;

    private static Tree getFirstLeaf(Tree t) {
        Tree current = t;
        while (!current.children.isEmpty())
            current = current.children.get(0);

        return current;
    }

    private double[][] computeTreeDist() {
        treeDist = new double[zsSrc.nodeCount + 1][zsDst.nodeCount + 1];
        forestDist = new double[zsSrc.nodeCount + 1][zsDst.nodeCount + 1];

        for (int i = 1; i < zsSrc.kr.length; i++) {
            for (int j = 1; j < zsDst.kr.length; j++) {
                forestDist(zsSrc.kr[i], zsDst.kr[j]);

            }
        }

        return treeDist;
    }

    private void forestDist(int i, int j) {
        forestDist[zsSrc.lld(i) - 1][zsDst.lld(j) - 1] = 0;
        for (int di = zsSrc.lld(i); di <= i; di++) {
            double costDel =  getDeletionCost(zsSrc.tree(di));
            forestDist[di][zsDst.lld(j) - 1] = forestDist[di - 1][zsDst.lld(j) - 1] + costDel;
            for (int dj = zsDst.lld(j); dj <= j; dj++) {
                double costIns = getInsertionCost(zsDst.tree(dj));
                forestDist[zsSrc.lld(i) - 1][dj] = forestDist[zsSrc.lld(i) - 1][dj - 1] + costIns;

                if ((zsSrc.lld(di) == zsSrc.lld(i) && (zsDst.lld(dj) == zsDst.lld(j)))) {
                    double costUpd = getUpdateCost(zsSrc.tree(di), zsDst.tree(dj));
                    forestDist[di][dj] = Math.min(Math.min(forestDist[di - 1][dj] + costDel,
                                    forestDist[di][dj - 1] + costIns),
                            forestDist[di - 1][dj - 1] + costUpd);
                    treeDist[di][dj] = forestDist[di][dj];
                } else {
                    forestDist[di][dj] = Math.min(Math.min(forestDist[di - 1][dj] + costDel,
                                    forestDist[di][dj - 1] + costIns),
                            forestDist[zsSrc.lld(di) - 1][zsDst.lld(dj) - 1]
                                    + treeDist[di][dj]);
                }
            }
        }
    }

    private int recoverydfs(Tree node) {
        assert node.postLCA == null || Interval.isSubinterval(node.postLCA.interval, node.preInterval);

        int ans = 0;

        // node is not matched
        if (matched1to2[node.dfsIndex] == 0) {
            boolean matched = false;
            Tree buddy = node.recoveryBuddy;
            if (buddy != null) {
                // buddy is not matched
                if (matched2to1[buddy.dfsIndex] == 0) {
                    // check the monotonicity
                    if (Interval.isSubinterval(buddy.interval, node.preInterval) && (node.postLCA == null || Interval.isSubinterval(node.postLCA.interval, buddy.interval))) {
                        if (checkMatchingOfConstructors(node, buddy)) {
                            match(node, buddy, MappingType.recovery);
                            matched = true;
                        }
                        ++ans;
                    }
                }
            }
            if (!matched) {
                Tree parent = node.getParent();
                if (parent != null && parent.isConstructor()) {
                    int parentBuddyDfsIndex = matched1to2[parent.dfsIndex];
                    if (parentBuddyDfsIndex != 0) {
                        buddy = nodeInDfsOrdering2[parentBuddyDfsIndex].children.get(node.childno);
                        if (matched2to1[buddy.dfsIndex] == 0) {
                            match(node, buddy, MappingType.recovery);
                        }
                    }
                }
            }
        }

        if (node.isOrderedList()) {
            Tree brother = null;
            for (Tree child: node.children) {
                if (brother == null) {
                    if (matched1to2[child.dfsIndex] == 0) {
                        child.preInterval = node.preInterval;
                    }
                }
                else {
                    if (matched1to2[child.dfsIndex] == 0) {
                        child.preInterval = brother.preInterval;
                    }
                }

                ans += recoverydfs(child);
                
                brother = child;
            }

            brother = null;
            for (int i = node.children.size() - 1; i >= 0; --i) {
                Tree child = node.children.get(i);
                if (brother != null) {
                    child.postLCA = Tree.getLCA(child.postLCA, brother.postLCA);
                }
                brother = child;
            }

            if (brother != null) {
                node.postLCA = Tree.getLCA(node.postLCA, brother.postLCA);
            }
        }
        else {
            for (Tree child: node.children) {
                if (matched1to2[child.dfsIndex] == 0) {
                    child.preInterval = node.preInterval;
                }
                ans += recoverydfs(child);
                node.postLCA = Tree.getLCA(node.postLCA, child.postLCA);
            }
        }
        return ans;
    }

    private int recovery(Tree src, Tree dst) {
        zsSrc = new ZsTree(src);
        zsDst = new ZsTree(dst);

        computeTreeDist();

        boolean rootNodePair = true;

        ArrayDeque<int[]> treePairs = new ArrayDeque<>();

        // push the pair of trees (ted1,ted2) to stack
        treePairs.addFirst(new int[] { zsSrc.nodeCount, zsDst.nodeCount });

        while (!treePairs.isEmpty()) {
            int[] treePair = treePairs.removeFirst();

            int lastRow = treePair[0];
            int lastCol = treePair[1];

            // compute forest distance matrix
            if (!rootNodePair)
                forestDist(lastRow, lastCol);

            rootNodePair = false;

            // compute mapping for current forest distance matrix
            int firstRow = zsSrc.lld(lastRow) - 1;
            int firstCol = zsDst.lld(lastCol) - 1;

            int row = lastRow;
            int col = lastCol;

            while ((row > firstRow) || (col > firstCol)) {
                if ((row > firstRow)
                        && (forestDist[row - 1][col] + 1D == forestDist[row][col])) {
                    // node with postorderID row is deleted from ted1
                    row--;
                } else if ((col > firstCol)
                        && (forestDist[row][col - 1] + 1D == forestDist[row][col])) {
                    // node with postorderID col is inserted into ted2
                    col--;
                } else {
                    // node with postorderID row in ted1 is renamed to node col
                    // in ted2
                    if ((zsSrc.lld(row) - 1 == zsSrc.lld(lastRow) - 1)
                            && (zsDst.lld(col) - 1 == zsDst.lld(lastCol) - 1)) {
                        // if both subforests are trees, map nodes
                        Tree tSrc = zsSrc.tree(row);
                        Tree tDst = zsDst.tree(col);

                        // Log.config("ZS: rename %s <-> %s", tSrc, tDst);

                        if (tSrc.label == tDst.label) {
                            tSrc.recoveryBuddy = tDst;
                        }
                        else
                            throw new RuntimeException("Should not map incompatible nodes.");
                        row--;
                        col--;
                    } else {
                        // pop subtree pair
                        treePairs.addFirst(new int[] { row, col });
                        // continue with forest to the left of the popped
                        // subtree pair

                        row = zsSrc.lld(row) - 1;
                        col = zsDst.lld(col) - 1;
                    }
                }
            }
        }

        return recoverydfs(src);
    }

    private double getDeletionCost(Tree n) {
        return 1D;
    }

    private double getInsertionCost(Tree n) {
        return 1D;
    }

    private double getUpdateCost(Tree n1, Tree n2) {
        if (n1.label == n2.label) {
            if (n1 instanceof Leaf && n2 instanceof Leaf) {
                Leaf l1 = (Leaf)n1;
                Leaf l2 = (Leaf)n2;
                if ("".equals(l1.code) || "".equals(l2.code))
                    return 1D;
                else {
                    return 1D - StringMetrics.qGramsDistance().compare(l1.code, l2.code);
                }
            }
            else {
                return 1D;
            }
        }
        else
            return Double.MAX_VALUE;
    }

    private static final class ZsTree {

        private int start; // internal array position of leafmost leaf descendant of the root node

        private int nodeCount; // number of nodes

        private int leafCount;

        private int[] llds; // llds[i] stores the postorder-ID of the
        // left-most leaf descendant of the i-th node in postorder
        private Tree[] labels; // labels[i] is the tree of the i-th node in postorder

        private int[] kr;

        private ZsTree(Tree t) {
            this.start = 0;
            this.nodeCount = t.size;
            this.leafCount = 0;
            this.llds = new int[start + nodeCount];
            this.labels = new Tree[start + nodeCount];

            int idx = 1;
            Map<Tree,Integer> tmpData = new HashMap<>();
            for (Tree n: t.postOrder()) {
                tmpData.put(n, idx);
                this.setTree(idx, n);
                this.setLld(idx, tmpData.get(TaTwoWayMatcher.getFirstLeaf(n)));
                if (n.children.isEmpty())
                    leafCount++;
                idx++;
            }

            setKeyRoots();
        }

        public void setTree(int i, Tree tree) {
            labels[i + start - 1] = tree;
            if (nodeCount < i)
                nodeCount = i;
        }

        public void setLld(int i, int lld) {
            llds[i + start - 1] = lld + start - 1;
            if (nodeCount < i)
                nodeCount = i;
        }

        public boolean isLeaf(int i) {
            return this.lld(i) == i;
        }

        public int lld(int i) {
            return llds[i + start - 1] - start + 1;
        }

        public Tree tree(int i) {
            return labels[i + start - 1];
        }

        public void setKeyRoots() {
            kr = new int[leafCount + 1];
            boolean[] visited = new boolean[nodeCount + 1];
            Arrays.fill(visited, false);
            int k = kr.length - 1;
            for (int i = nodeCount; i >= 1; i--) {
                if (!visited[lld(i)]) {
                    kr[k] = i;
                    visited[lld(i)] = true;
                    k--;
                }
            }
        }
    }
}
