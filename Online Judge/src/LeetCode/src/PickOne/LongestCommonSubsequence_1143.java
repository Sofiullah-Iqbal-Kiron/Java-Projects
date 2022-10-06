// Accepted in first term.
// Posted in twitter.
// BackToBackSWE helps me entirely.

package PickOne;

public class LongestCommonSubsequence_1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] cache = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j))
                    cache[i + 1][j + 1] = cache[i][j] + 1;
                else
                    cache[i + 1][j + 1] = Math.max(cache[i][j + 1], cache[i + 1][j]);
            }
        }

        return cache[text1.length()][text2.length()];
    }
}
