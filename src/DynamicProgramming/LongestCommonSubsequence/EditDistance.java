package DynamicProgramming.LongestCommonSubsequence;

// Question link -> https://leetcode.com/problems/edit-distance/

import java.util.Arrays;

public class EditDistance {
    public static void main(String[] args) {
        System.out.println(minDistance("", "a"));
    }

    public static int minDistance(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = Math.max(i,j);
                } else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[n][m];
    }
}
