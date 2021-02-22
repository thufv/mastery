package mastery.matcher.jdime;

import mastery.matcher.Mapping;
import mastery.matcher.TwoWayMatcher;
import mastery.matcher.MappingStore;

import mastery.tree.Tree;
import mastery.tree.TreeTraverse;
import mastery.tree.Leaf;
import mastery.util.Pair;
import mastery.util.log.Log;

import java.lang.reflect.Array;
import java.util.*;

public class JDimeTwoWayMatcher extends TwoWayMatcher {
    // the flag that indicates that if lookahead technique enabled
    private boolean lookaheadEnabled;

    public JDimeTwoWayMatcher(boolean lookaheadEnabled) {
        this.lookaheadEnabled = lookaheadEnabled;
    }

    @Override
    protected final void match(Tree tree1, Tree tree2) {
        /*
         * Before firing up potentially expensive matching algorithms, we check whether the trees are identical.
         */
        if (tree1.equals(tree2)) {
            Iterator<Tree> iter1 = TreeTraverse.preOrderIterator(tree1);
            Iterator<Tree> iter2 = TreeTraverse.preOrderIterator(tree2);
            while (iter1.hasNext()) {
                assert iter2.hasNext();
                m.link(iter1.next(), iter2.next());
            }
            return;
        }

        if (tree1.label != tree2.label
            || tree1.isLeaf() && !((Leaf)tree1).code.equals(((Leaf)tree2).code)) {
            if (lookaheadEnabled) {
                Optional<Mapping> resume = lookAhead(tree1, tree2);

                if (resume.isPresent()) {
                    Pair<Tree, Tree> toMatch = resume.get();
                    Log.finest("lookahead to match %s and %s while matching %s and %s", toMatch.first.toReadableString(), toMatch.second.toReadableString(), tree1.toReadableString(), tree2.toReadableString());
                    match(toMatch.first, toMatch.second);
                } else {
                    /*
                     * The roots do not match and we cannot lookahead anything. We therefore ignore the rest of the
                     * subtrees and return early to save time.
                     */
                    Log.finest("early return as lookahead technique finds nothing while matching %s and %s", tree1.toReadableString(), tree2.toReadableString());
                }
            } else {
                /*
                 * The roots do not match and we cannot use the look-ahead feature.  We therefore ignore the rest of the
                 * subtrees and return early to save time.
                 */
                Log.finest("early return as different labels while matching %s and %s", tree1.toReadableString(), tree2.toReadableString());
            }
            return;
        }

        if (tree1.isConstructor()) {
            assert tree2.isConstructor();
            assert tree1.children.size() == tree2.children.size();

            for (int i = 0; i < tree1.children.size(); ++i)
                match(tree1.children.get(i), tree2.children.get(i));

            m.link(tree1, tree2);
        } else if (tree1.isOrderedList()) {
            assert tree2.isOrderedList();

            orderedMatch(tree1, tree2);
        } else if (tree1.isUnorderedList()) {
            assert tree2.isUnorderedList();

            unorderedMatch(tree1, tree2);
        } else if (tree1.isLeaf()) {
            assert tree2.isLeaf();

            m.link(tree1, tree2);
        }
    }

    private void orderedMatch(Tree tree1, Tree tree2) {
        // number of first-level subtrees of tree1 and tree2, respectively
        int n1 = tree1.children.size();
        int n2 = tree2.children.size();

        int[][] matrixM = new int[n1 + 1][n2 + 1];

        Entry[][] matrixT = (Entry[][]) Array.newInstance(Entry.class, n1 + 1, n2 + 1);

        // initialize first column matrix
        for (int i = 0; i <= n1; i++) {
            matrixM[i][0] = 0;
        }

        // initialize first row of matrix
        for (int j = 0; j <= n2; j++) {
            matrixM[0][j] = 0;
        }

        JDimeTwoWayMatcher matcher = new JDimeTwoWayMatcher(lookaheadEnabled);
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                Tree child1 = tree1.children.get(i - 1);
                Tree child2 = tree2.children.get(j - 1);

                MappingStore mappings = matcher.raw_apply(child1, child2);

                if (matrixM[i][j - 1] > matrixM[i - 1][j]) {
                    if (matrixM[i][j - 1] > matrixM[i - 1][j - 1] + mappings.getSize()) {
                        matrixM[i][j] = matrixM[i][j - 1];
                        matrixT[i][j] = new Entry(Direction.LEFT, mappings);
                    } else {
                        matrixM[i][j] = matrixM[i - 1][j - 1] + mappings.getSize();
                        matrixT[i][j] = new Entry(Direction.DIAG, mappings);
                    }
                } else {
                    if (matrixM[i - 1][j] > matrixM[i - 1][j - 1] + mappings.getSize()) {
                        matrixM[i][j] = matrixM[i - 1][j];
                        matrixT[i][j] = new Entry(Direction.TOP, mappings);
                    } else {
                        matrixM[i][j] = matrixM[i - 1][j - 1] + mappings.getSize();
                        matrixT[i][j] = new Entry(Direction.DIAG, mappings);
                    }
                }
            }
        }

        for (int i = n1, j = n2; i >= 1 && j >= 1;) {
            switch (matrixT[i][j].getDirection()) {
                case TOP:
                    i--;
                    break;
                case LEFT:
                    j--;
                    break;
                case DIAG:
                    if (matrixM[i][j] > matrixM[i - 1][j - 1]) {
                        m.addMappings(matrixT[i][j].getMappings());
                    }
                    i--;
                    j--;
                    break;
                default:
                    break;
            }
        }

        // tree1 and tree2 are matched,
        // which should be checked in the [match] method
        m.link(tree1, tree2);
    }

    private void unorderedMatch(Tree tree1, Tree tree2) {
        // number of first-level subtrees of tree1 and tree2, respectively
        int n1 = tree1.children.size();
        int n2 = tree2.children.size();

        if (n1 == 0 || n2 == 0) {
            m.link(tree1, tree2);
            return;
        }

        MappingStore[][] stores = (MappingStore[][]) Array.newInstance(MappingStore.class, n1, n2);

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                stores[i][j] = new MappingStore();
            }
        }

        Tree child1;
        Tree child2;

        JDimeTwoWayMatcher matcher = new JDimeTwoWayMatcher(lookaheadEnabled);
        for (int i = 0; i < n1; i++) {
            child1 = tree1.children.get(i);
            for (int j = 0; j < n2; j++) {
                child2 = tree2.children.get(j);
                stores[i][j] = matcher.raw_apply(child1, child2);
            }
        }

        // solve assignment problem
        int[][] matrix = new int[n1][n2];
        /* We want to solve the assignment problem for maximum values,
         * therefore we have to adjust the matrix by subtracting each value
         * from the maximum value. */
        int max = 0;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                matrix[i][j] = stores[i][j].getSize();
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = max - matrix[i][j];
            }
        }

        /* Solve via hungarian algorithm. */
        HungarianAlgorithm alg = new HungarianAlgorithm(matrix);
        int[] bestMatches = alg.execute();

        /* Build a list containing the relevant matches. */
        for (int i = 0; i < bestMatches.length; i++) {
            int j = bestMatches[i];

            if (j < 0)
                continue;
            
            if (stores[i][j].getSize() > 0) {
                m.addMappings(stores[i][j]);
            }
        }
        m.link(tree1, tree2);
    }

    /* the following two methods are for lookahead technique */
    private Optional<Mapping> lookAhead(Tree node1, Tree node2) {
        if (Tree.lookaheadNames.contains(node1.name)) {
            Optional<Tree> resume = findMatchingNode(node1, node2);

            if (resume.isPresent()) {
                return Optional.of(new Mapping(resume.get(), node2));
            } else {
                return Optional.empty();
            }
        } else if (Tree.lookaheadNames.contains(node2.name)) {
            Optional<Tree> resume = findMatchingNode(node2, node1);

            if (resume.isPresent()) {
                return Optional.of(new Mapping(node1, resume.get()));
            } else {
                return Optional.empty();
            }
        } else {
            return Optional.empty();
        }
    }

    private Optional<Tree> findMatchingNode(Tree node, Tree nodeToFind) {
        if (node.label == nodeToFind.label) {
            return Optional.of(node);
        }

        for (Tree child : node.children) {
            Optional<Tree> matchingNode = findMatchingNode(child, nodeToFind);

            if (matchingNode.isPresent()) {
                return matchingNode;
            }
        }

        return Optional.empty();
    }
}