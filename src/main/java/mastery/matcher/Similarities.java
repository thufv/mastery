package mastery.matcher;

import java.util.HashSet;
import java.util.Set;

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
}