package mastery.matcher;

import mastery.tree.Leaf;
import mastery.tree.Tree;

import java.util.ArrayDeque;

public class ZsMatcher extends TwoWayMatcher {
    private ZsTree zsSrc;
    private ZsTree zsDst;

    private double[][] treeDist;
    private double[][] forestDist;

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
            double costDel = getDeletionCost(zsSrc.tree(di));
            forestDist[di][zsDst.lld(j) - 1] = forestDist[di - 1][zsDst.lld(j) - 1] + costDel;
            for (int dj = zsDst.lld(j); dj <= j; dj++) {
                double costIns = getInsertionCost(zsDst.tree(dj));
                forestDist[zsSrc.lld(i) - 1][dj] = forestDist[zsSrc.lld(i) - 1][dj - 1] + costIns;

                if ((zsSrc.lld(di) == zsSrc.lld(i) && (zsDst.lld(dj) == zsDst.lld(j)))) {
                    double costUpd = getUpdateCost(zsSrc.tree(di), zsDst.tree(dj));
                    forestDist[di][dj] = Math.min(
                        Math.min(forestDist[di - 1][dj] + costDel, forestDist[di][dj - 1] + costIns),
                        forestDist[di - 1][dj - 1] + costUpd
                    );
                    treeDist[di][dj] = forestDist[di][dj];
                } else {
                    forestDist[di][dj] = Math.min(
                        Math.min(forestDist[di - 1][dj] + costDel, forestDist[di][dj - 1] + costIns),
                        forestDist[zsSrc.lld(di) - 1][zsDst.lld(dj) - 1] + treeDist[di][dj]
                    );
                }
            }
        }
    }

    @Override
    protected final void match(Tree tree1, Tree tree2) {
        zsSrc = new ZsTree(tree1);
        zsDst = new ZsTree(tree2);

        computeTreeDist();

        boolean rootNodePair = true;

        ArrayDeque<int[]> treePairs = new ArrayDeque<>();

        // push the pair of trees (ted1,ted2) to stack
        treePairs.addFirst(new int[]{zsSrc.nodeCount, zsDst.nodeCount});

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
                        if (tSrc.label == tDst.label)
                            m.link(tSrc, tDst);
                        else
                            throw new RuntimeException("Should not map incompatible nodes.");
                        row--;
                        col--;
                    } else {
                        // pop subtree pair
                        treePairs.addFirst(new int[]{row, col});
                        // continue with forest to the left of the popped
                        // subtree pair

                        row = zsSrc.lld(row) - 1;
                        col = zsDst.lld(col) - 1;
                    }
                }
            }
        }
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
                Leaf l1 = (Leaf) n1;
                Leaf l2 = (Leaf) n2;
                if ("".equals(l1.code) || "".equals(l2.code)) return 1D;
                else return 1D - Similarities.codeSimilarity(l1, l2);
            } else return 1D;
        } else
            return Double.MAX_VALUE;
    }
}
