package mastery.matcher;

import mastery.tree.Leaf;
import mastery.tree.Tree;
import mastery.util.Interval;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Assigner {
    int dfsIndex = 0;

    public void computeDfsIndex(Tree node) {
        node.dfsIndex = ++dfsIndex;
        for (Tree child : node.children) {
            computeDfsIndex(child);
        }
        node.interval = Interval.of(node.dfsIndex, dfsIndex);
    }

    int[] indexOfValue;
    int assignmentEnd = 0;

    /*
     Leaf and Constructor may have the same label, but never have the same assignment,
     because Leaf has zero height while Constructor has positive height.
    */
    public void apply(Tree... trees) {
        for (Tree tree : trees) {
            dfsIndex = 0;
            computeDfsIndex(tree);
        }

        int assignmentLimit = Arrays.stream(trees).mapToInt(t -> t.size).sum();
        indexOfValue = new int[Math.max(Math.max(255, Tree.LABEL_MAX), assignmentLimit) + 1];

        List<List<Tree>> nodesOfHeight = new ArrayList<>();
        for (Tree tree : trees) {
            while (nodesOfHeight.size() < tree.height + 1) {
                nodesOfHeight.add(new ArrayList<>());
            }
            for (Tree node : tree.preOrder()) {
                nodesOfHeight.get(node.height).add(node);
            }
        }

        for (List<Tree> nodes : nodesOfHeight) {
            reorderChildren(nodes.stream().filter(Tree::isUnorderedList));
            assign(nodes);
        }
    }

    private void reorderChildren(Stream<Tree> nodes) {
        List<List<Tree>> childrenOfIndex = new ArrayList<>();
        nodes.forEach(node -> {
            if (node.isUnorderedList()) {
                for (Tree child : node.children) {
                    if (indexOfValue[child.assignment] == 0) {
                        childrenOfIndex.add(new ArrayList<>());
                        indexOfValue[child.assignment] = childrenOfIndex.size();
                    }
                    childrenOfIndex.get(indexOfValue[child.assignment] - 1).add(child);
                }
                node.children.clear();
            }
        });
        for (List<Tree> children : childrenOfIndex) {
            for (Tree child : children) {
                indexOfValue[child.assignment] = 0;
                child.parent.children.add(child);
            }
        }
    }

    private final static class NodeData {
        private final int[] data;
        final Tree node;

        NodeData(Tree node) {
            this.node = node;
            if (node.isLeaf()) {
                byte[] codeBytes = ((Leaf) node).code.getBytes(StandardCharsets.UTF_8);
                data = new int[codeBytes.length + 1];
                for (int i = 0; i < codeBytes.length; ++i) {
                    data[i + 1] = Byte.toUnsignedInt(codeBytes[i]);
                }
            } else {
                data = new int[node.children.size() + 1];
                for (int i = 0; i < node.children.size(); ++i) {
                    data[i + 1] = node.children.get(i).assignment;
                }
            }
            data[0] = node.label;
        }

        boolean equals(NodeData nodeData) {
            return Arrays.equals(data, nodeData.data);
        }

        int get(int i) {
            return data[i];
        }

        int size() {
            return data.length;
        }
    }

    /*
     It works like radix sort, but does not care about the true order,
     only ensures identical nodes are stored consecutively, w.r.t. the current round.
     */
    private void assign(List<Tree> nodes) {
        List<NodeData> currentNodes = new ArrayList<>();
        for (Tree node : nodes) {
            currentNodes.add(new NodeData(node));
        }

        for (int k = 0; !currentNodes.isEmpty(); ++k) {
            int[] countOfIndex = new int[currentNodes.size() + 1];
            int indexEnd = 0;
            for (NodeData nodeData : currentNodes) {
                if (indexOfValue[nodeData.get(k)] == 0) {
                    indexOfValue[nodeData.get(k)] = ++indexEnd;
                }
                ++countOfIndex[indexOfValue[nodeData.get(k)]];
            }
            for (int j = 1; j <= indexEnd; ++j) {
                countOfIndex[j] += countOfIndex[j - 1];
            }

            NodeData[] reorderedNodes = new NodeData[currentNodes.size()];
            for (NodeData nodeData : currentNodes) {
                reorderedNodes[--countOfIndex[indexOfValue[nodeData.get(k)]]] = nodeData;
            }
            currentNodes.clear();

            NodeData lastEnded = null;
            for (NodeData nodeData : reorderedNodes) {
                indexOfValue[nodeData.get(k)] = 0;
                if (nodeData.size() == k + 1) {
                    if (lastEnded == null || !nodeData.equals(lastEnded)) {
                        nodeData.node.assignment = ++assignmentEnd;
                        lastEnded = nodeData;
                    } else {
                        nodeData.node.assignment = lastEnded.node.assignment;
                    }
                } else {
                    currentNodes.add(nodeData);
                }
            }
        }
    }
}
