package mastery.diff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import mastery.tree.Tree;
import mastery.util.log.Log;

public class Matcher {
    // nodesWithHeight[height][]: nodes at some specific height
    List<List<Tree>> nodesOfHeight = new ArrayList<>();

    private void addNodesAtHeight(Tree node) {
        while (node.height >= nodesOfHeight.size()) {
            nodesOfHeight.add(new ArrayList<Tree>());
        }
        nodesOfHeight.get(node.height).add(node);
    }

    List<Integer> compressedAssignment = new ArrayList<>();
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
                if (compressedAssignment.get(childAssignment) == 0) {
                    compressedAssignment.set(childAssignment, ++assignmentCount);
                    nodesOfAssignment.add(new ArrayList<>());
                }
                nodesOfAssignment.get(compressedAssignment.get(childAssignment)).add(node);
            }
        }
        for (Tree node: nodes) {
            if (node.children.size() > childStart) {
                compressedAssignment.set(node.children.get(childStart).assignment, 0);
            }
        }
        // [assignmentStart, assignmentEnd) is the assigned interval
        int assignmentEnd = assignmentStart + (noChildExists ? 1: 0);
        for (var undistinguishableNodes: nodesOfAssignment) {
            assignmentEnd += assign(undistinguishableNodes, 0, assignmentEnd);
        }
        return assignmentEnd - assignmentStart;
    }

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

        // Initialize assign as label
        List<Integer> compressedLabel = new ArrayList<>();
        for (var nodes: nodesOfHeight) {
            Collections.fill(compressedLabel, 0);
            Integer cnt = 0;
            for (Tree node: nodes) {
                while (compressedLabel.size() <= node.label) {
                    compressedLabel.add(0);
                }
                if (compressedLabel.get(node.label) == 0) {
                    compressedLabel.set(node.label, ++cnt);
                }
                node.assignment = compressedLabel.get(node.label);
            }
        }

        // Enumerate nodes by height increasing order
        for (int i = 0; i < nodesOfHeight.size(); ++i) {
            while (compressedAssignment.size() < nodesOfHeight.get(i).size()) {
                compressedAssignment.add(0);
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
                if (compressedAssignment.get(node.assignment) == 0) {
                    compressedAssignment.set(node.assignment, ++assignmentCount);
                    nodesOfAssignment.add(new ArrayList<>());
                }
                nodesOfAssignment.get(compressedAssignment.get(node.assignment)).add(node);
            }
            for (Tree node: nodesOfHeight.get(height)) {
                compressedAssignment.set(node.assignment, 0);
            }

            Integer assignmentEnd = 1;
            for (var nodes: nodesOfAssignment) {
                assignmentEnd += assign(nodes, 0, assignmentEnd);
            }
        }

        // Calculate Mapping
        var diff = new Diff();

        Log.fine("diff: base <-> left");
        var leftMapping = diff.apply(base, left);

        Log.fine("diff: base <-> right");
        var rightMapping = diff.apply(base, right);

        var matchingSet = new MatchingSet(base, left, right);
        leftMapping.forEach(matchingSet::setLeftMatch);
        rightMapping.forEach(matchingSet::setRightMatch);
        Log.fine("diff: %d matches identified", matchingSet.size());

        return matchingSet;
    }
}
