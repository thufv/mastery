package mastery.matcher.skinchanger;

import mastery.matcher.Similarities;
import mastery.matcher.TwoWayMatcher;
import mastery.matcher.ZsTree;
import mastery.tree.Leaf;
import mastery.tree.Tree;
import mastery.tree.TreePrinters;
import mastery.util.Interval;
import mastery.util.Pair;
import mastery.util.StringAlgorithms;
import mastery.util.WeightedQueue;
import mastery.util.log.Log;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class SkinChangerTwoWayMatcher extends TwoWayMatcher {
    // Parameters
    public final int minHeight;
    public final double minDice;
    public final int maxSize;

    public SkinChangerTwoWayMatcher(int minHeight, double minDice, int maxSize) {
        this.minHeight = minHeight;
        this.minDice = minDice;
        this.maxSize = maxSize;
    }

    public SkinChangerTwoWayMatcher() {
        this(1, 0.44, 160);
    }

    private Tree root1;
    private Tree root2;

    // The order of arguments matters!
    @Override
    protected final void match(Tree tree1, Tree tree2) {
        // Necessary initializations
        initMatch(tree1, tree2);
        initHomonymy(tree1, tree2);

        for (Tree node : tree1.preOrder()) {
            node.postLCA = null;
            node.recoveryBuddy = null;
        }

        root1 = tree1;
        root2 = tree2;

        // Top-down Phase
        topDown();
        // Bottom-up Phase
        bottomUpDfs(tree1);
    }

    void topDown() {
        List<Pair<Tree, Tree>> cartesianProducts = new ArrayList<>();

        var queue1 = new WeightedQueue<Tree>(Tree -> Tree.height);
        var queue2 = new WeightedQueue<Tree>(Tree -> Tree.height);
        queue1.add(root1);
        queue2.add(root2);

        // Let's rock!
        while (!queue1.isEmpty() && !queue2.isEmpty() &&
            queue1.maxWeight() > minHeight && queue2.maxWeight() > minHeight) {
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

            // case 3: two queues contain Trees of the same height
            var nodes1 = queue1.removeMax();
            var nodes2 = queue2.removeMax();

            // assignment count
            var nodes1Of = new ArrayList<List<Tree>>();
            for (var node : nodes1) {
                while (nodes1Of.size() <= node.assignment)
                    nodes1Of.add(new ArrayList<>());
                nodes1Of.get(node.assignment).add(node);
            }
            var nodes2Of = new ArrayList<List<Tree>>();
            for (var node : nodes2) {
                while (nodes2Of.size() <= node.assignment)
                    nodes2Of.add(new ArrayList<>());
                nodes2Of.get(node.assignment).add(node);
            }

            for (int assignment = 1; assignment < Math.max(nodes1Of.size(), nodes2Of.size()); ++assignment) {
                var list1 = assignment < nodes1Of.size() ? nodes1Of.get(assignment) : new ArrayList<Tree>();
                var list2 = assignment < nodes2Of.size() ? nodes2Of.get(assignment) : new ArrayList<Tree>();

                if (list1.size() >= 1 && list2.size() >= 1) {
                    // Log.finer("The sizes of lists of assignment %d are %d and %d", assignment, list1.size(), list2.size());

                    while (true) {
                        boolean continueFlag = false;
                        for (int i = 0; i < list1.size(); ++i) {
                            Tree node1 = list1.get(i);
                            int checkedCount = 0;
                            int j = -1;
                            for (int _j = 0; _j < list2.size(); ++_j)
                                if (checkMapping(node1, list2.get(_j), MappingType.isomorphic)) {
                                    ++checkedCount;
                                    j = _j;
                                }
                            if (checkedCount == 1) {
                                Tree node2 = list2.get(j);
                                boolean only_i = true;
                                for (int _i = 0; _i < list1.size(); ++_i)
                                    if (i != _i && checkMapping(list1.get(_i), node2, MappingType.isomorphic))
                                        only_i = false;
                                if (only_i) {
                                    matchSubTree(node1, node2);
                                    list1.remove(i--);
                                    list2.remove(j);
                                    continueFlag = true;
                                }
                            }
                        }

                        List<Boolean> checked1 = new ArrayList<>();
                        List<Boolean> checked2 = new ArrayList<>();
                        for (int i = 0; i < list1.size(); ++i) checked1.add(false);
                        for (int i = 0; i < list2.size(); ++i) checked2.add(false);
                        for (int i = 0; i < list1.size(); ++i)
                            for (int j = 0; j < list2.size(); ++j)
                                if (checkMapping(list1.get(i), list2.get(j), MappingType.isomorphic)) {
                                    cartesianProducts.add(Pair.of(list1.get(i), list2.get(j)));
                                    checked1.set(i, true);
                                    checked2.set(j, true);
                                }
                        for (int i = 0; i < list1.size(); ++i)
                            if (!checked1.get(i))
                                queue1.addAll(list1.get(i).children);
                        for (int j = 0; j < list2.size(); ++j)
                            if (!checked2.get(j))
                                queue2.addAll(list2.get(j).children);

                        if (!continueFlag) break;
                    }
                } else {
                    // push their children (if not handled) into queue
                    for (var node : list1) {
                        assert matched1to2[node.dfsIndex] == 0;
                        queue1.addAll(node.children);
                    }
                    for (var node : list2) {
                        assert matched2to1[node.dfsIndex] == 0;
                        queue2.addAll(node.children);
                    }
                }
            }
        }

        Log.finer("Sort!");

        fotileTree = new FotileTree(matched1to2, matched2to1);

        // Log.finer("collected %d node pairs before any checking.", cartesianProducts.size());
        // for (int i = cartesianProducts.size() - 1; i >= 0; --i)
        //     Log.finer("\t%s %s\n", cartesianProducts.get(i).first, cartesianProducts.get(i).second);

        List<Pair<Tree, Tree>> filteredCartesianProducts = cartesianProducts.stream()
            .filter(p -> checkStop(p.first, p.second))
            .sorted(new TreePairComparator())
            .collect(Collectors.toList());

        Log.finer("sorted %d node pair:", filteredCartesianProducts.size());
        for (int i = filteredCartesianProducts.size() - 1; i >= 0; --i)
            Log.finer("\tNo. %d: %s <-> %s\n", i, filteredCartesianProducts.get(i).first, filteredCartesianProducts.get(i).second);

        for (int i = filteredCartesianProducts.size() - 1; i >= 0; --i) {
            var p = filteredCartesianProducts.get(i);
            if (matched1to2[p.first.dfsIndex] == 0 && matched2to1[p.second.dfsIndex] == 0) {
                matchSubTree(p.first, p.second);
            }
        }
    }

    // utils of matching
    private int[] matched1to2; // matched1to2[tree1.dfsIndex] = tree2.dfsIndex
    private int[] matched2to1; // matched2to1[tree2.dfsIndex] = tree1.dfsIndex
    private Tree[] nodeInDfsOrdering1; // nodeInDfsOrdering1[node1.dfsIndex] = node
    private Tree[] nodeInDfsOrdering2; // nodeInDfsOrdering2[node2.dfsIndex] = node

    private void initMatch(Tree tree1, Tree tree2) {
        matched1to2 = new int[tree1.size + 1];
        matched2to1 = new int[tree2.size + 1];

        nodeInDfsOrdering1 = new Tree[tree1.size + 1];
        for (Tree node : tree1.preOrder())
            nodeInDfsOrdering1[node.dfsIndex] = node;
        nodeInDfsOrdering2 = new Tree[tree2.size + 1];
        for (Tree node : tree2.preOrder())
            nodeInDfsOrdering2[node.dfsIndex] = node;
    }

    protected void match(Tree tree1, Tree tree2, MappingType type) {
        // Log.finer("want %s mapping: %s <-> %s", type, tree1, tree2);

        assert tree1.label == tree2.label;
        assert !tree1.isConstructor() || tree2.isConstructor() && tree1.children.size() == tree2.children.size();
        assert tree1.postLCA == null || Interval.isSubinterval(tree1.postLCA.interval, tree2.interval);

        m.link(tree1, tree2);

        assertEquals(matched1to2[tree1.dfsIndex], 0);
        matched1to2[tree1.dfsIndex] = tree2.dfsIndex;

        assertEquals(matched2to1[tree2.dfsIndex], 0);
        matched2to1[tree2.dfsIndex] = tree1.dfsIndex;

        tree1.preInterval = tree2.interval;
        tree1.postLCA = tree2;

        // if (Interval.in(tree1.dfsIndex, Interval.of(677, 1328)) && Interval.in(tree2.dfsIndex, Interval.of(11474, 12682))) {
        //     Log.finer("An expected mapping!");
        // }

        // Log.finer("%s mapping: %s <-> %s", type, tree1, tree2);
    }

    private void matchSubTree(Tree tree1, Tree tree2) {
        match(tree1, tree2, MappingType.isomorphic);

        assertEquals(tree1.children.size(), tree2.children.size());

        for (int i = 0; i < tree1.children.size(); ++i)
            matchSubTree(tree1.children.get(i), tree2.children.get(i));
    }

    private boolean checkMapping(Tree node1, Tree node2, MappingType type) {
            return _checkMapping(node1, node2, type);
    }

    private boolean _checkMapping(Tree node1, Tree node2, MappingType type) {
        // basic checking
        if (node1 == null) return false;
        if (node2 == null) return false;
        if (matched1to2[node1.dfsIndex] != 0) return false;
        if (matched2to1[node2.dfsIndex] != 0) return false;
        if (node1.label != node2.label) return false;

        // monotonicity checking
        if (!Interval.isSubinterval(node2.interval, node1.preInterval)) return false;
        if (node1.postLCA != null && !Interval.isSubinterval(node1.postLCA.interval, node2.interval)) return false;

        // compulsory checking
        Tree parent1 = node1.parent;
        Tree parent2 = node2.parent;
        if (parent1 == null) {
            if (parent2 != null) return false;
        } else if (parent2 == null) return false;
        else if (parent1.isConstructor() && parent2.isConstructor()
            && parent1.label == parent2.label && node1.childNo != node2.childNo) return false;

        // homonymy checking
        if (homonymy1to2[node1.dfsIndex] != 0 && homonymy1to2[node1.dfsIndex] != node2.dfsIndex)
            return false;
        if (homonymy2to1[node2.dfsIndex] != 0 && homonymy2to1[node2.dfsIndex] != node1.dfsIndex)
            return false;

        // This is a little overfit...But we restrict matching between ImportDeclaration nodes 
        // only if the imported qualified names are exactly same, that is,
        // the mapping between ImportDeclaration nodes could only be isomorphic mapping.
        if (type != MappingType.isomorphic && node1.name.equals("ImportDeclaration"))
            return false;

        return true;
    }

    /**
     * Check if the "environment"s of the two nodes to match are similar enough.
     * Inspired by dubbo/b1324511d-dubbo-cluster-src-main-java-org-apache-dubbo-rpc-cluster-directory-AbstractDirectory
     */
    private boolean checkStop(Tree node1, Tree node2) {
        if (node1.stop) return true;
        Tree parent1 = node1.parent;
        Tree parent2 = node2.parent;
        while (true) {
            if (parent1 == null || parent2 == null) return false;
            else if (parent1.label != parent2.label) return false;
            // If there's one another mapping between them, we return true.
            else if (calcSimilarity(parent1, parent2) > 1e-8) return true;

            if (parent1.stop) {
                // This threshold is adjusted according to the following scenarios:
                // 1. dubbo/a41930e55-dubbo-common-src-main-java-org-apache-dubbo-common-Constants, 0.76, false
                Log.finer("code similarity between %s (ancestor of %s) and %s (ancestor of %s) is %.2f\n", parent1, node1, parent2, node2, Similarities.codeSimilarity(parent1, parent2));
                return Similarities.codeSimilarity(parent1, parent2) > 0.77;
            }
            parent1 = parent1.parent;
            parent2 = parent2.parent;
        }
    }

    private final class TreePairComparator implements Comparator<Pair<Tree, Tree>> {
        final Map<Pair<Tree, Tree>, Double> mappingSimilarity = new HashMap<>();
        final Map<Pair<Tree, Tree>, Double> codeSimilarity = new HashMap<>();

        /**
         * 1 means p1 is more similar than p2,
         * 0 means they're probably equal,
         * -1 means p1 is less similar than p2.
         */
        @Override
        public int compare(Pair<Tree, Tree> p1, Pair<Tree, Tree> p2) {
            Tree first1 = p1.first;
            Tree second1 = p1.second;
            Tree first2 = p2.first;
            Tree second2 = p2.second;
            for (; ; ) {
                first1 = first1.parent;
                second1 = second1.parent;
                first2 = first2.parent;
                second2 = second2.parent;

                if (first1 == null && second1 == null && first2 == null && second2 == null) return 0;
                else if (first1 == null && second1 == null) return 1;
                else if (first2 == null && second2 == null) return -1;
                if ((first1 == null || second1 == null) && (first2 == null || second2 == null)) return 0;
                else if (first1 == null || second1 == null) return -1;
                else if (first2 == null || second2 == null) return 1;

                boolean equivalence1 = first1.label == second1.label;
                boolean equivalence2 = first2.label == second2.label;
                if (equivalence1 && !equivalence2) return 1;
                else if (equivalence2 && !equivalence1) return -1;

                if (!mappingSimilarity.containsKey(p1))
                    mappingSimilarity.put(p1, calcSimilarity(first1, second1));
                if (!mappingSimilarity.containsKey(p2))
                    mappingSimilarity.put(p2, calcSimilarity(first2, second2));
                double mappingSimilarity1 = mappingSimilarity.get(p1);
                double mappingSimilarity2 = mappingSimilarity.get(p2);
                if (mappingSimilarity1 > mappingSimilarity2 + 1e-8) return 1;
                else if (mappingSimilarity1 < mappingSimilarity2 - 1e-8) return -1;

                if (!codeSimilarity.containsKey(p1))
                    codeSimilarity.put(p1, Similarities.codeSimilarity(first1, second1));
                if (!codeSimilarity.containsKey(p2))
                    codeSimilarity.put(p2, Similarities.codeSimilarity(first2, second2));
                double codeSimilarity1 = codeSimilarity.get(p1);
                double codeSimilarity2 = codeSimilarity.get(p2);

                if (codeSimilarity1 > codeSimilarity2 + 1e-8) return 1;
                else if (codeSimilarity1 < codeSimilarity2 - 1e-8) return -1;
            }
        }
    }

    FotileTree fotileTree;

    public double calcSimilarity(Tree node1, Tree node2) {
        int mappingCount = fotileTree.query(fotileTree.roots[node1.interval.l - 1], fotileTree.roots[node1.interval.r], 1, fotileTree.size2, node2.interval.l, node2.interval.r);
        return Similarities.diceSimilarity(mappingCount, node1.size, node2.size);
    }

    /**
     * The fotile tree (persistent segment tree) is used to calculate the number of mappings between two subtrees.
     * We consider a plane, where point (x, y) indicates
     * there's a mapping between a node of dfs index x in tree 1 and a node of dfs index y in tree 2.
     * Thus, to count the mappings between two subtrees is to count the number of points in a matrix of the plane.
     * This is a classical problem in competitive programming, which could be solved by the fotile tree.
     */
    private static final class FotileTree {
        int size1, size2;
        int[] counts, leftsons, rightsons;
        public int[] roots;
        int tot = 0;

        public FotileTree(int[] matched1to2, int[] matched2to1) {
            size1 = matched1to2.length - 1;
            size2 = matched2to1.length - 1;

            counts = new int[size1 * (int) (Math.ceil(Math.log(size2) / Math.log(2) + 1)) + 5];
            leftsons = new int[size1 * (int) (Math.ceil(Math.log(size2) / Math.log(2) + 1)) + 5];
            rightsons = new int[size1 * (int) (Math.ceil(Math.log(size2) / Math.log(2) + 1)) + 5];
            roots = new int[size1 + 1];

            for (int i = 1; i <= size1; ++i) {
                if (matched1to2[i] == 0)
                    roots[i] = roots[i - 1];
                else
                    roots[i] = insert(matched1to2[i], 1, size2, roots[i - 1]);
            }
        }

        public int insert(int k, int l, int r, int node) {
            int dir = ++tot;
            leftsons[dir] = leftsons[node];
            rightsons[dir] = rightsons[node];
            counts[dir] = counts[node] + 1;
            if (l == r) return dir;
            int mid = l + r >> 1;
            if (k <= mid)
                leftsons[k] = insert(k, l, mid, leftsons[node]);
            else
                rightsons[k] = insert(k, mid + 1, r, rightsons[node]);
            return dir;
        }

        public int query(int u, int v, int l, int r, int L, int R) {
            if (L <= l && r <= R) return counts[v] - counts[u];
            if (counts[v] - counts[u] == 0) return 0;
            int ans = 0;
            int mid = l + r >> 1;
            if (L <= mid)
                ans += query(leftsons[u], leftsons[v], l, mid, L, R);
            if (R > mid)
                ans += query(rightsons[u], rightsons[v], mid + 1, r, L, R);
            return ans;
        }
    }

    // utils of homo mapping
    Map<String, Tree> nodeOfIdentifier1 = new HashMap<>();
    Map<String, Tree> nodeOfIdentifier2 = new HashMap<>();
    int[] homonymy1to2;
    int[] homonymy2to1;

    private void initHomonymy(Tree tree1, Tree tree2) {
        Map<String, Integer> identifierCount1 = new HashMap<>();
        Map<String, Integer> identifierCount2 = new HashMap<>();
        for (Tree node : tree1.preOrder())
            if (node.identifier != null && node.name.endsWith("Declaration"))
                identifierCount1.put(node.identifier, identifierCount1.getOrDefault(node.identifier, 0) + 1);
        for (Tree node : tree2.preOrder())
            if (node.identifier != null && node.name.endsWith("Declaration"))
                identifierCount2.put(node.identifier, identifierCount2.getOrDefault(node.identifier, 0) + 1);
        nodeOfIdentifier1.clear();
        nodeOfIdentifier2.clear();
        for (Tree node : tree1.preOrder()) {
            if (node.identifier != null
                && identifierCount1.getOrDefault(node.identifier, 0) == 1
                && identifierCount2.getOrDefault(node.identifier, 0) == 1)
                nodeOfIdentifier1.put(node.identifier, node);
        }
        for (Tree node : tree2.preOrder()) {
            if (node.identifier != null
                && identifierCount1.getOrDefault(node.identifier, 0) == 1
                && identifierCount2.getOrDefault(node.identifier, 0) == 1)
                nodeOfIdentifier2.put(node.identifier, node);
        }

        homonymy1to2 = new int[tree1.size + 1];
        homonymy2to1 = new int[tree2.size + 1];
        for (String identifier : nodeOfIdentifier1.keySet()) {
            Tree node1 = nodeOfIdentifier1.get(identifier);
            homonymyDfs(node1, nodeOfIdentifier2.get(identifier));
        }

        for (Tree node : tree1.preOrder())
            if (node.parent == null)
                node.preInterval = Interval.of(1, tree2.size);
            else {
                Interval parentInterval = node.parent.preInterval;
                if (homonymy1to2[node.dfsIndex] != 0) {
                    Interval buddyInterval = nodeInDfsOrdering2[homonymy1to2[node.dfsIndex]].interval;
                    if (Interval.isSubinterval(buddyInterval, parentInterval)) {
                        node.preInterval = buddyInterval;
                    } else {
                        node.preInterval = parentInterval;
                        homonymy2to1[homonymy1to2[node.dfsIndex]] = 0;
                        homonymy1to2[node.dfsIndex] = 0;
                    }
                } else node.preInterval = parentInterval;
            }
    }

    /**
     * We propagate virtual homonymy mapping down by knowing that
     * "if our parents are matched, we're matched",
     * which is indicated by they are children of constructor or the only child of their parents.
     */
    private void homonymyDfs(Tree node1, Tree node2) {
        if (homonymy1to2[node1.dfsIndex] == 0 && homonymy2to1[node2.dfsIndex] == 0) {
            homonymy1to2[node1.dfsIndex] = node2.dfsIndex;
            homonymy2to1[node2.dfsIndex] = node1.dfsIndex;

            Log.finer("preprocessed homonymy mapping: %s <-> %s", node1, node2);

            if (node1.isConstructor()
                || node1.children.size() == 1 && node2.children.size() == 1) {
                for (int i = 0; i < node1.children.size(); ++i) {
                    Tree child1 = node1.children.get(i);
                    Tree child2 = node2.children.get(i);
                    if (checkMapping(child1, child2, MappingType.homonymy))
                        homonymyDfs(child1, child2);
                }
            }
        }
    }

    /**
     * @param node the node of the base tree in post-order dfs
     * @return the mappings in the subtree of the node
     */
    private int bottomUpDfs(Tree node) {
        int mappingCount = 0;

        for (int i = node.children.size() - 1; i >= 0; --i) {
            Tree child = node.children.get(i);
            mappingCount += bottomUpDfs(child);
            node.postLCA = Tree.getLCA(node.postLCA, child.postLCA);

            Log.finer("after calculate %s, postLCA of %s is %s", child, node, node.postLCA);
        }

        // container mapping
        if (matched1to2[node.dfsIndex] != 0) ++mappingCount;
        else {
            if (node == root1) {
                match(root1, root2, MappingType.compulsory);
                mappingCount += containerDfs(node, root2) + 1;
            } else if (homonymy1to2[node.dfsIndex] != 0) {
                Tree candidate = nodeInDfsOrdering2[homonymy1to2[node.dfsIndex]];

                assert checkMapping(node, candidate, MappingType.homonymy);

                match(node, candidate, MappingType.homonymy);
                mappingCount += containerDfs(node, candidate) + 1;
            } else {
                if (node.postLCA != null) {
                    if (!Interval.isSubinterval(node.postLCA.interval, node.preInterval)) {
                        System.out.println(node + ", postLCA = " + node.postLCA + ", preInterval = " + node.preInterval);
                    }

                    assert Interval.isSubinterval(node.postLCA.interval, node.preInterval);

                    Tree candidate = node.postLCA;

                    Log.finer("postLCA of %s is %s", node, node.postLCA);

                    while (candidate != null &&
                        (matched2to1[candidate.dfsIndex] != 0
                            || node.label != candidate.label
                            || homonymy2to1[candidate.dfsIndex] != 0 && homonymy2to1[candidate.dfsIndex] != node.dfsIndex)) {
                        if (matched2to1[candidate.dfsIndex] != 0)
                            Log.finer("possible candidate %s is matched", candidate);
                        else if (node.label != candidate.label)
                            Log.finer("possible candidate %s has a different label", candidate);
                        else if (homonymy2to1[candidate.dfsIndex] != 0 && homonymy2to1[candidate.dfsIndex] != node.dfsIndex)
                            Log.finer("possible candidate %s has a homonymy buddy", candidate);

                        candidate = candidate.parent;
                    }

                    if (candidate != null) {
                        Log.finer("candidate of %s is %s", node, candidate);
                    } else {
                        Log.finer("candidate of %s is null", node);
                    }

                    if (candidate != null && checkMapping(node, candidate, MappingType.container)) {
                        // get the candidate!
                        // let's check the dice!

                        Log.finer("Jaccad Similarity = %f, Dice Similarity = %f, mappingCount = %d, minDice = %f", Similarities.jaccardSimilarity(mappingCount, node.size, candidate.size), Similarities.diceSimilarity(mappingCount, node.size, candidate.size), mappingCount, minDice);

                        boolean cond = false;
                        if (node.size < 20 || candidate.size < 20) {
                            Log.finer("String Distance = %f", Similarities.codeSimilarity(node, candidate));
                        }

                        // If one of subtree is small enough, we consider the code similarity rather than mapping similarity.
                        // This heuristic is inspired by
                        // 1. dubbo/99256faf8-dubbo-config-dubbo-config-spring-src-main-java-org-apache-dubbo-config-spring-ReferenceBean
                        // 2. dubbo/99256faf8-dubbo-config-dubbo-config-spring-src-main-java-org-apache-dubbo-config-spring-ReferenceBean
                        // The thresholds are arbitrarily set now...
                        if (node.size < 20 || candidate.size < 20
                            ? Similarities.codeSimilarity(node, candidate) > 0.53
                            : Similarities.diceSimilarity(mappingCount, node.size, candidate.size) > minDice
                        ) {
                            match(node, candidate, MappingType.container);
                            mappingCount += containerDfs(node, candidate) + 1;
                        }
                    }
                }
            }
        }
        return mappingCount;
    }

    /**
     * We propagate container mapping down by knowing that
     * "if our parents are matched, we're matched",
     * which is indicated by they are children of constructor or the only child of their parents.
     */
    int containerDfs(Tree node, Tree candidate) {
        // Log.finer("containerDfs(%s, %s)", node, candidate);

        if (Math.max(node.size, candidate.size) < maxSize)
            return recovery(node, candidate);
        else {
            int mappingCount = 0;
            if (node.isConstructor()) {
                assert candidate.isConstructor();
                for (int i = 0; i < node.children.size(); ++i) {
                    Tree child1 = node.children.get(i);
                    Tree child2 = candidate.children.get(i);

                    if (matched1to2[child1.dfsIndex] == 0)
                        child1.preInterval = node.preInterval;

                    Log.finer("compulsory to check: %s <-> %s", child1, child2);

                    if (checkMapping(child1, child2, MappingType.compulsory)) {
                        match(child1, child2, MappingType.compulsory);
                        mappingCount += containerDfs(child1, child2) + 1;
                        node.postLCA = Tree.getLCA(node.postLCA, child1.postLCA);

                        // Log.finer("after calculate %s, postLCA of %s is %s", child1, node, node.postLCA);
                    }
                }
            } else if (node.children.size() == 1 && candidate.children.size() == 1) {
                Tree child1 = node.children.get(0);
                Tree child2 = candidate.children.get(0);

                if (matched1to2[child1.dfsIndex] == 0)
                    child1.preInterval = node.preInterval;

                if (checkMapping(child1, child2, MappingType.compulsory)) {
                    match(child1, child2, MappingType.compulsory);
                    mappingCount += containerDfs(child1, child2) + 1;
                    node.postLCA = Tree.getLCA(node.postLCA, child1.postLCA);

                    // Log.finer("after calculate %s, postLCA of %s is %s", child1, node, node.postLCA);
                }
            }
            return mappingCount;
        }
    }

    private ZsTree zsSrc;
    private ZsTree zsDst;

    private double[][] treeDist;
    private double[][] forestDist;

    private double[][] computeTreeDist() {
        treeDist = new double[zsSrc.nodeCount + 1][zsDst.nodeCount + 1];
        forestDist = new double[zsSrc.nodeCount + 1][zsDst.nodeCount + 1];

        for (int i = 1; i < zsSrc.kr.length; i++)
            for (int j = 1; j < zsDst.kr.length; j++)
                forestDist(zsSrc.kr[i], zsDst.kr[j]);

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

        int mappingCount = 0;

        // node is not matched
        if (matched1to2[node.dfsIndex] == 0) {
            boolean matched = false;
            Tree buddy = node.recoveryBuddy;
            if (checkMapping(node, buddy, MappingType.recovery)) {
                match(node, buddy, MappingType.recovery);
                ++mappingCount;
                matched = true;
            }
            if (!matched) {
                Tree parent = node.parent;
                if (parent != null && parent.isConstructor()) {
                    int parentBuddyDfsIndex = matched1to2[parent.dfsIndex];
                    if (parentBuddyDfsIndex != 0) {
                        assert nodeInDfsOrdering2[parentBuddyDfsIndex].isConstructor();
                        assert nodeInDfsOrdering2[parentBuddyDfsIndex].children.size() == parent.children.size();

                        buddy = nodeInDfsOrdering2[parentBuddyDfsIndex].children.get(node.childNo);

                        if (checkMapping(node, buddy, MappingType.recovery)) {
                            match(node, buddy, MappingType.recovery);
                            ++mappingCount;
                        }
                    }
                }
            }
        }

        for (Tree child : node.children) {
            if (matched1to2[child.dfsIndex] == 0)
                child.preInterval = node.preInterval;
            mappingCount += recoverydfs(child);
            node.postLCA = Tree.getLCA(node.postLCA, child.postLCA);
        }
        return mappingCount;
    }

    private int recovery(Tree src, Tree dst) {
        zsSrc = new ZsTree(src);
        zsDst = new ZsTree(dst);

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
                    // Log.config("ZS: delete %s", zsSrc.tree(row));
                    row--;
                } else if ((col > firstCol)
                    && (forestDist[row][col - 1] + 1D == forestDist[row][col])) {
                    // node with postorderID col is inserted into ted2
                    // Log.config("ZS: insert %s", zsDst.tree(col));
                    col--;
                } else {
                    // node with postorderID row in ted1 is renamed to node col
                    // in ted2
                    if ((zsSrc.lld(row) - 1 == zsSrc.lld(lastRow) - 1)
                        && (zsDst.lld(col) - 1 == zsDst.lld(lastCol) - 1)) {
                        // if both subforests are trees, map nodes
                        Tree tSrc = zsSrc.tree(row);
                        Tree tDst = zsDst.tree(col);

                        Log.finer("ZS: rename %s <-> %s", tSrc, tDst);

                        if (tSrc.label == tDst.label) tSrc.recoveryBuddy = tDst;
                        else throw new RuntimeException("Should not map incompatible nodes.");
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
                Leaf l1 = (Leaf) n1;
                Leaf l2 = (Leaf) n2;
                if ("".equals(l1.code) || "".equals(l2.code)) return 1D;
                else return 1D - Similarities.codeSimilarity(l1, l2);
            } else return 1D;
        } else
            return Double.MAX_VALUE;
    }
}