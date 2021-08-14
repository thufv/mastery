package mastery.matcher;

import mastery.tree.Tree;
import mastery.tree.TreePrinters;
import mastery.util.StringAlgorithms;

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

    public static double codeSimilarity(Tree tree1, Tree tree2) {
        long assignment1 = Math.min(tree1.assignment, tree2.assignment);
        long assignment2 = Math.max(tree1.assignment, tree2.assignment);
        long pair = assignment1 << 32 | assignment2;
        return codeSimilarityCache.computeIfAbsent(pair, k -> {
            return StringAlgorithms.qGramCompare(TreePrinters.rawCode(tree1), TreePrinters.rawCode(tree2));
        });
    }
}