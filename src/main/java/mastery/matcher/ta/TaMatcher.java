package mastery.matcher.ta;

import mastery.matcher.Matcher;
import mastery.matcher.MatchingSet;
import mastery.tree.Leaf;
import mastery.tree.Tree;
import mastery.util.Interval;

import java.util.ArrayList;
import java.util.List;

public class TaMatcher extends Matcher {
    // nodesWithHeight[height][]: nodes at some specific height
    List<List<Tree>> nodesOfHeight = new ArrayList<>();

    private void addNodesAtHeight(Tree node) {
        while (node.height >= nodesOfHeight.size()) {
            nodesOfHeight.add(new ArrayList<Tree>());
        }
        nodesOfHeight.get(node.height).add(node);
    }

    int[] compressedAssignment;
    // Classify nodes by the children starting at [childStart],
    // and assignment starting at [assignmentStart]
    private int assign(List<Tree> nodes, int childStart, int assignmentStart) {
        boolean noChildExists = false;
        List<List<Tree>> nodesOfAssignment = new ArrayList<>();
        Integer assignmentCount = 0;
        for (Tree node: nodes) {
            if (node.children.size() == childStart) {
                noChildExists = true;
                node.assignment = assignmentStart;
            }
            else {
                Integer childAssignment = node.children.get(childStart).assignment;
                if (compressedAssignment[childAssignment] == 0) {
                    compressedAssignment[childAssignment] = ++assignmentCount;
                    nodesOfAssignment.add(new ArrayList<>());
                }
                nodesOfAssignment.get(compressedAssignment[childAssignment]).add(node);
            }
        }
        for (Tree node: nodes) {
            if (node.children.size() > childStart) {
                compressedAssignment[node.children.get(childStart).assignment] = 0;
            }
        }
        // [assignmentStart, assignmentEnd) is the assigned interval
        int assignmentEnd = assignmentStart + (noChildExists ? 1: 0);
        for (var undistinguishableNodes: nodesOfAssignment) {
            assignmentEnd += assign(undistinguishableNodes, 0, assignmentEnd);
        }
        return assignmentEnd - assignmentStart;
    }
    // Classify nodes by the children starting at [childStart],
    // and assignment starting at [assignmentStart]
    private int assignLeaf(List<Leaf> nodes, int charStart, int assignmentStart) {
        boolean noChildExists = false;
        List<List<Leaf>> nodesOfAssignment = new ArrayList<>();
        Integer assignmentCount = 0;
        for (Leaf node: nodes) {
            if (node.children.size() == charStart) {
                noChildExists = true;
                node.assignment = assignmentStart;
            }
            else {
                int childAssignment = node.code.charAt(0);
                if (compressedAssignment[childAssignment] == 0) {
                    compressedAssignment[childAssignment] = ++assignmentCount;
                    nodesOfAssignment.add(new ArrayList<>());
                }
                nodesOfAssignment.get(compressedAssignment[childAssignment]).add(node);
            }
        }
        for (Tree node: nodes) {
            if (node.children.size() > charStart) {
                compressedAssignment[node.children.get(charStart).assignment] = 0;
            }
        }
        // [assignmentStart, assignmentEnd) is the assigned interval
        int assignmentEnd = assignmentStart + (noChildExists ? 1: 0);
        for (var undistinguishableNodes: nodesOfAssignment) {
            assignmentEnd += assignLeaf(undistinguishableNodes, 0, assignmentEnd);
        }
        return assignmentEnd - assignmentStart;
    }

    private Integer dfsIndex = 0;
    private void dfs(Tree node) {
        node.dfsIndex = ++dfsIndex;
        for (Tree child: node.children) {
            dfs(child);
        }
        Integer rightIndex = dfsIndex;
        node.interval = Interval.of(node.dfsIndex, rightIndex);

        if (node.isOrderedList()) {
            for (Tree child: node.children) {
                child.interval = Interval.of(node.dfsIndex, rightIndex);
            }
        }
    }
    private void cal_dfs(Tree tree) {
        dfsIndex = 0;
        dfs(tree);
    }

    @Override
    public MatchingSet apply(Tree base, Tree left, Tree right) {
        // Assign trees

        // put nodes into the 2D-list
        for (Tree node: base.postOrder()) {
            addNodesAtHeight(node);
        }
        for (Tree node: left.postOrder()) {
            addNodesAtHeight(node);
        }
        for (Tree node: right.postOrder()) {
            addNodesAtHeight(node);
        }

        // Enumerate nodes by height increasing order

        // Initialize
        int compressedAssignmentSize = Math.max(256, nodesOfHeight.stream().mapToInt((List<Tree> nodes)->nodes.size()).max().getAsInt());
        compressedAssignment = new int[compressedAssignmentSize];

        // Initialize assign as label
        {
            for (var nodes: nodesOfHeight) {
                List<Integer> compressedLabel = new ArrayList<>();
                Integer labelCount = 0;
                for (Tree node: nodes) {
                    while (compressedLabel.size() <= node.label) {
                        compressedLabel.add(0);
                    }
                    if (compressedLabel.get(node.label) == 0) {
                        compressedLabel.set(node.label, ++labelCount);
                    }
                    node.assignment = compressedLabel.get(node.label);
                }
            }

            List<List<Leaf>> nodesOfAssignment = new ArrayList<>();
            Integer assignmentCount = 0;
            for (Tree node: nodesOfHeight.get(0)) {
                if (compressedAssignment[node.assignment] == 0) {
                    compressedAssignment[node.assignment] = ++assignmentCount;
                    nodesOfAssignment.add(new ArrayList<>());
                }
                assert(node instanceof Leaf);
                nodesOfAssignment.get(compressedAssignment[node.assignment]).add((Leaf)node);
            }
            for (Tree node: nodesOfHeight.get(0)) {
                compressedAssignment[node.assignment] = 0;
            }

            Integer assignmentEnd = 1;
            for (var nodes: nodesOfAssignment) {
                assignmentEnd += assignLeaf(nodes, 0, assignmentEnd);
            }
        }        

        for (int height = 0; height < nodesOfHeight.size(); ++height) {
            if (height > 0) {
                List<List<Tree>> childrenOfAssignment = new ArrayList<>();
                childrenOfAssignment.add(new ArrayList<>());
                for (int i = 0; i < nodesOfHeight.get(height - 1).size(); ++i) {
                    childrenOfAssignment.add(new ArrayList<>());
                }

                // Sort children of unorderedList
                for (Tree node: nodesOfHeight.get(height)) {
                    if (node.isUnorderedList()) {
                        for (Tree child: node.children) {
                            childrenOfAssignment.get(child.assignment).add(child);
                        }
                        node.children.clear();
                    }
                }

                for (int i = 1; i <= nodesOfHeight.get(height - 1).size(); ++i) {
                    for (Tree node: childrenOfAssignment.get(i)) {
                        node.getParent().children.add(node);
                    }
                }
            }

            // Assign
            List<List<Tree>> nodesOfAssignment = new ArrayList<>();
            Integer assignmentCount = 0;
            for (Tree node: nodesOfHeight.get(height)) {
                if (compressedAssignment[node.assignment] == 0) {
                    compressedAssignment[node.assignment] = ++assignmentCount;
                    nodesOfAssignment.add(new ArrayList<>());
                }
                nodesOfAssignment.get(compressedAssignment[node.assignment]).add(node);
            }
            for (Tree node: nodesOfHeight.get(height)) {
                compressedAssignment[node.assignment] = 0;
            }

            Integer assignmentEnd = 1;
            for (var nodes: nodesOfAssignment) {
                assignmentEnd += assign(nodes, 0, assignmentEnd);
            }
        }

        // Calculate information about dfs ordering
        cal_dfs(base);
        cal_dfs(left);
        cal_dfs(right);

        // Calculate Mapping
        return calc(new TaTwoWayMatcher(), new TaMatchingSet(base, left, right), base, left, right);
    }
}