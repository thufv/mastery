package mastery.matcher;

public class Similarities {
    public static double diceSimilarity(int mappingCount, int size1, int size2) {
        return 2 * mappingCount / (size1 + size2);
    }
}