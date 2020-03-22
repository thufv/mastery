package mastery.matcher;

public class Similarities {
    public static double diceSimilarity(int mappingCount, int size1, int size2) {
        // System.out.println("calc dice: mappingCount = " + mappingCount + ", size1 = " + size1 + ", size2 = " + size2);

        return 2D * mappingCount / (size1 + size2);
    }

    public static double jaccardSimilarity(int mappingCount, int size1, int size2) {
        return (double)mappingCount / (size1 + size2 - mappingCount);
    }
}