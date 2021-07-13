package mastery.matcher.gumtree;

import mastery.matcher.Mapping;
import mastery.matcher.MappingStore;
import mastery.tree.Tree;

import java.util.*;

public final class SiblingsMappingComparator implements Comparator<Mapping> {

    private Map<Tree, List<Tree>> srcDescendants = new HashMap<>();
    private Map<Tree, Set<Tree>> dstDescendants = new HashMap<>();

    protected List<Mapping> ambiguousMappings;

    protected Map<Mapping, Double> similarities = new HashMap<>();
    protected int maxTreeSize;
    protected MappingStore mappings;

    public SiblingsMappingComparator(List<Mapping> ambiguousMappings, MappingStore mappings, int maxTreeSize) {
        this.maxTreeSize = maxTreeSize;
        this.mappings = mappings;
        this.ambiguousMappings = ambiguousMappings;

        for (Mapping ambiguousMapping: ambiguousMappings)
            similarities.put(ambiguousMapping, similarity(ambiguousMapping.first, ambiguousMapping.second));
    }

    @Override
    public int compare(Mapping m1, Mapping m2) {
        if (similarities.get(m2).compareTo(similarities.get(m1)) != 0) {
            return Double.compare(similarities.get(m2), similarities.get(m1));
        }
        if (m1.first.dfsIndex != m2.first.dfsIndex) {
            return Integer.compare(m1.first.dfsIndex, m2.first.dfsIndex);
        }
        return Integer.compare(m1.second.dfsIndex, m2.second.dfsIndex);
    }

    protected double similarity(Tree src, Tree dst) {
        return 100D * siblingsJaccardSimilarity(src.parent, dst.parent)
                +  10D * posInParentSimilarity(src, dst) + numberingSimilarity(src , dst);
    }

    protected double siblingsJaccardSimilarity(Tree src, Tree dst) {
        double num = (double) numberOfCommonDescendants(src, dst);
        double den = (double) srcDescendants.get(src).size() + (double) dstDescendants.get(dst).size() - num;
        return num / den;
    }

    protected int numberOfCommonDescendants(Tree src, Tree dst) {
        if (!srcDescendants.containsKey(src))
            srcDescendants.put(src, src.getDescendants());
        if (!dstDescendants.containsKey(dst))
            dstDescendants.put(dst, new HashSet<>(dst.getDescendants()));

        int common = 0;

        for (Tree t: srcDescendants.get(src)) {
            Tree m = mappings.getDst(t);
            if (m != null && dstDescendants.get(dst).contains(m))
                common++;
        }

        return common;
    }

    protected double posInParentSimilarity(Tree src, Tree dst) {
        int posSrc = src.parent == null ? 0 : src.childNo;
        int posDst = dst.parent == null ? 0 : dst.childNo;
        int maxSrcPos = src.parent == null ? 1 : src.parent.children.size();
        int maxDstPos = dst.parent == null ? 1 : dst.parent.children.size();
        int maxPosDiff = Math.max(maxSrcPos, maxDstPos);
        return 1D - ((double) Math.abs(posSrc - posDst) / (double) maxPosDiff);
    }

    protected double numberingSimilarity(Tree src, Tree dst) {
        return 1D - ((double) Math.abs(src.dfsIndex - dst.dfsIndex)
                / (double) maxTreeSize);
    }
}