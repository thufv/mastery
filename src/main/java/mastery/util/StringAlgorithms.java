package mastery.util;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public final class StringAlgorithms {

    private StringAlgorithms() {
    }

    public static List<int[]> lcss(String s0, String s1) {
        int[][] lengths = new int[s0.length() + 1][s1.length() + 1];
        for (int i = 0; i < s0.length(); i++)
            for (int j = 0; j < s1.length(); j++)
                if (s0.charAt(i) == (s1.charAt(j)))
                    lengths[i + 1][j + 1] = lengths[i][j] + 1;
                else
                    lengths[i + 1][j + 1] = Math.max(lengths[i + 1][j], lengths[i][j + 1]);

        List<int[]> indexes = new ArrayList<>();

        for (int x = s0.length(), y = s1.length(); x != 0 && y != 0; ) {
            if (lengths[x][y] == lengths[x - 1][y]) x--;
            else if (lengths[x][y] == lengths[x][y - 1]) y--;
            else {
                indexes.add(new int[]{x - 1, y - 1});
                x--;
                y--;
            }
        }
        Collections.reverse(indexes);
        return indexes;
    }

    public static List<int[]> hunks(String s0, String s1) {
        List<int[]> lcs = lcss(s0, s1);
        List<int[]> hunks = new ArrayList<>();
        int inf0 = -1;
        int inf1 = -1;
        int last0 = -1;
        int last1 = -1;
        for (int i = 0; i < lcs.size(); i++) {
            int[] match = lcs.get(i);
            if (inf0 == -1 || inf1 == -1) {
                inf0 = match[0];
                inf1 = match[1];
            } else if (last0 + 1 != match[0] || last1 + 1 != match[1]) {
                hunks.add(new int[]{inf0, last0 + 1, inf1, last1 + 1});
                inf0 = match[0];
                inf1 = match[1];
            } else if (i == lcs.size() - 1) {
                hunks.add(new int[]{inf0, match[0] + 1, inf1, match[1] + 1});
                break;
            }
            last0 = match[0];
            last1 = match[1];
        }
        return hunks;
    }

    public static String lcs(String s1, String s2) {
        int start = 0;
        int max = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                int x = 0;
                while (s1.charAt(i + x) == s2.charAt(j + x)) {
                    x++;
                    if (((i + x) >= s1.length()) || ((j + x) >= s2.length())) break;
                }
                if (x > max) {
                    max = x;
                    start = i;
                }
            }
        }
        return s1.substring(start, (start + max));
    }

    public static int qGramDistance(String s1, String s2, int q) {
        Map<String, Integer> profile = new HashMap<>();
        for (int i = 0; i < s1.length() - q + 1; ++i) {
            String seq = s1.substring(i, i + q);
            profile.put(seq, profile.getOrDefault(seq, 0) + 1);
        }
        for (int i = 0; i < s2.length() - q + 1; ++i) {
            String seq = s2.substring(i, i + q);
            profile.put(seq, profile.getOrDefault(seq, 0) - 1);
        }
        return profile.values().stream().mapToInt(Math::abs).sum();
    }

    public static double qGramCompare(String s1, String s2, int q) {
        return 1 - (double) qGramDistance(s1, s2, q) / (s1.length() + s2.length() - (q - 1) * 2);
    }

    /*
     This is probably not needed, just to make sure the computed value is
     exactly the same as org.simmetrics.StringMetrics.qGramsDistance.
    */
    public static double qGramCompareWithPadding(String s1, String s2, int q) {
        String padding = StringUtils.repeat('#', q - 1);
        return qGramCompare(padding + s1 + padding, padding + s2 + padding, q);
    }

    public static double qGramCompare(String s1, String s2) {
        return qGramCompareWithPadding(s1, s2, 3);
    }
}
