package mastery.matcher;

import mastery.tree.Tree;
import mastery.tree.TreePrinters;
import mastery.util.StringAlgorithms.QGramProfile;

import java.util.HashMap;
import java.util.Map;

public class Similarities {
    public static double diceSimilarity(int mappingCount, int size1, int size2) {
        // System.out.println("calc dice: mappingCount = " + mappingCount + ", size1 = " + size1 + ", size2 = " + size2);
        return 2D * mappingCount / (size1 + size2);
    }

    public static double jaccardSimilarity(int mappingCount, int size1, int size2) {
        return (double)mappingCount / (size1 + size2 - mappingCount);
    }

    public static double chawatheSimilarity(int mappingCount, int size1, int size2) {
        return (double) mappingCount / Math.max(size1, size2);
    }

    private static final Map<Long, Double> codeSimilarityCache = new HashMap<>();
    private static final Map<Integer, QGramProfile> qGramProfileCache = new HashMap<>();

    public static double codeSimilarity(Tree tree1, Tree tree2) {
        if (tree1.assignment < tree2.assignment) {
            return codeSimilarity(tree2, tree1);
        }
        long key = (long) tree1.assignment | (long) tree2.assignment << 32;
        return codeSimilarityCache.computeIfAbsent(key, k -> {
            QGramProfile v1 = qGramProfileCache.computeIfAbsent(tree1.assignment, a1 -> {
                return QGramProfile.withPadding(TreePrinters.rawCode(tree1), 3);
            });
            QGramProfile v2 = qGramProfileCache.computeIfAbsent(tree2.assignment, a2 -> {
                return QGramProfile.withPadding(TreePrinters.rawCode(tree2), 3);
            });
            return QGramProfile.compare(v1, v2);
        });
    }
}