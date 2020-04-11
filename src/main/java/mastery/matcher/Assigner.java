package mastery.matcher;

import mastery.tree.Leaf;
import mastery.tree.Tree;
import mastery.tree.UnorderedList;
import mastery.util.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assigner {
    // nodesWithHeight[height][]: nodes at some specific height
    List<List<Tree>> nodesOfHeight = new ArrayList<>();

    private void addNodesAtHeight(Tree tree) {
        for (Tree node: tree.postOrder()) {
            while (node.height >= nodesOfHeight.size()) {
                nodesOfHeight.add(new ArrayList<Tree>());
            }
            nodesOfHeight.get(node.height).add(node);
        }
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
                nodesOfAssignment.get(compressedAssignment[childAssignment] - 1).add(node);
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
            assignmentEnd += assign(undistinguishableNodes, childStart + 1, assignmentEnd);
        }
        return assignmentEnd - assignmentStart;
    }
    // Classify nodes by the children starting at [childStart],
    // and assignment starting at [assignmentStart]
    private int assignLeaf(List<Leaf> nodes, int charStart, int assignmentStart) {
        boolean noCharExists = false;
        List<List<Leaf>> nodesOfAssignment = new ArrayList<>();
        Integer assignmentCount = 0;
        for (Leaf node: nodes) {
            if (node.code.length() == charStart) {
                noCharExists = true;
                node.assignment = assignmentStart;
            }
            else {
                int childAssignment = node.code.charAt(charStart);
                if (compressedAssignment[childAssignment] == 0) {
                    compressedAssignment[childAssignment] = ++assignmentCount;
                    nodesOfAssignment.add(new ArrayList<>());
                }
                nodesOfAssignment.get(compressedAssignment[childAssignment] - 1).add(node);
            }
        }
        for (Leaf node: nodes) {
            if (node.code.length() > charStart) {
                compressedAssignment[node.code.charAt(charStart)] = 0;
            }
        }
        // [assignmentStart, assignmentEnd) is the assigned interval
        int assignmentEnd = assignmentStart + (noCharExists ? 1: 0);
        for (var undistinguishableNodes: nodesOfAssignment) {
            assignmentEnd += assignLeaf(undistinguishableNodes, charStart + 1, assignmentEnd);
        }
        return assignmentEnd - assignmentStart;
    }
    public void apply(Tree ... trees)
    {
        // put nodes into the 2D-list
        for (Tree tree: trees)
            addNodesAtHeight(tree);

        // Enumerate nodes by height increasing order

        // Initialize compressedAssignment
        int compressedAssignmentSize = Math.max(256, nodesOfHeight.stream().mapToInt((List<Tree> nodes)->nodes.size()).max().getAsInt());
        compressedAssignment = new int[compressedAssignmentSize];

        // Initialize assign as label
        Integer assignmentEnd;
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

            Integer assignmentCount = 0;
            for (Tree node: nodesOfHeight.get(0)) {
                if (node instanceof UnorderedList) {
                    if (compressedAssignment[node.assignment] == 0) {
                        compressedAssignment[node.assignment] = ++assignmentCount;
                    }
                    node.assignment = compressedAssignment[node.assignment];
                }
            }
            
            assignmentEnd = assignmentCount + 1;
            assignmentCount = 0;

            List<List<Leaf>> nodesOfAssignment = new ArrayList<>();
            for (Tree node: nodesOfHeight.get(0)) {
                if (node instanceof Leaf) {
                    if (compressedAssignment[node.assignment] == 0) {
                        compressedAssignment[node.assignment] = ++assignmentCount;
                        nodesOfAssignment.add(new ArrayList<>());
                    }
                    nodesOfAssignment.get(compressedAssignment[node.assignment] - 1).add((Leaf)node);
                }
            }

            Arrays.fill(compressedAssignment, 0);

            for (var nodes: nodesOfAssignment) {
                assignmentEnd += assignLeaf(nodes, 0, assignmentEnd);
            }
        }

        
        for (int height = 0; height < nodesOfHeight.size(); ++height) {
            if (height > 0) {
                List<List<Tree>> childrenOfAssignment = new ArrayList<>();
                Integer assignmentCount = 0;

                childrenOfAssignment.add(new ArrayList<>());

                // Sort children of unorderedList
                for (Tree node: nodesOfHeight.get(height)) {
                    if (node.isUnorderedList()) {
                        for (Tree child: node.children) {
                            if (compressedAssignment[child.assignment] == 0) {
                                compressedAssignment[child.assignment] = ++assignmentCount;
                                childrenOfAssignment.add(new ArrayList<>());
                            }

                            childrenOfAssignment.get(compressedAssignment[child.assignment]).add(child);
                        }
                        node.children.clear();
                    }
                }

                for (var nodes: childrenOfAssignment) {
                    for (Tree node: nodes) {
                        node.getParent().children.add(node);
                    }
                }

                for (var nodes: childrenOfAssignment) {
                    for (Tree node: nodes) {
                        compressedAssignment[node.assignment] = 0;
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
                nodesOfAssignment.get(compressedAssignment[node.assignment] - 1).add(node);
            }
            for (Tree node: nodesOfHeight.get(height))
                compressedAssignment[node.assignment] = 0;

            for (var nodes: nodesOfAssignment)
                assignmentEnd += assign(nodes, 0, assignmentEnd);
        }
    }
}