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

    public static final class QGramProfile extends ArrayList<Pair<String, Integer>> {
        private final int qGramCount;

        QGramProfile(String str, int q) {
            qGramCount = str.length() - q + 1;
            SortedMap<String, Integer> counter = new TreeMap<>();
            for (int i = 0; i < qGramCount; ++i) {
                String seq = str.substring(i, i + q);
                counter.compute(seq, (k, v) -> (v == null ? 0 : v) + 1);
            }
            counter.forEach((k, v) -> add(Pair.of(k, v)));
        }

        public static QGramProfile withPadding(String s, int q) {
            String padding = StringUtils.repeat('#', q - 1);
            return new QGramProfile(padding + s + padding, q);
        }

        public static int distance(QGramProfile v1, QGramProfile v2) {
            int total = 0;
            int i = 0;
            int j = 0;
            while (i < v1.size() && j < v2.size()) {
                Pair<String, Integer> p1 = v1.get(i++);
                Pair<String, Integer> p2 = v2.get(j++);
                int r = p1.first.compareTo(p2.first);
                if (r < 0) {
                    total += p1.second;
                    --j;
                } else if (r > 0) {
                    total += p2.second;
                    --i;
                } else {
                    total += Math.abs(p1.second - p2.second);
                }
            }
            for (; i < v1.size(); ++i) {
                total += v1.get(i).second;
            }
            for (; j < v2.size(); ++j) {
                total += v2.get(j).second;
            }
            return total;
        }

        public static double compare(QGramProfile v1, QGramProfile v2) {
            return 1 - (double) distance(v1, v2) / (v1.qGramCount + v2.qGramCount);
        }
    }
}
