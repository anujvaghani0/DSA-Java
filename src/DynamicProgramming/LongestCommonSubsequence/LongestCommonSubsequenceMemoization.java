package DynamicProgramming.LongestCommonSubsequence;

import java.util.Arrays;

public class LongestCommonSubsequenceMemoization {
    public static void main(String[] args) {
        String text1 = "abcded";
        String text2 = "aced";
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
//        Arrays.fill(dp, count);
        System.out.println(longestCommonSubsequence(text1, text2, n, m, dp));
    }

    public static int longestCommonSubsequence(String text1, String text2, int n, int m, int[][] dp) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (text1.charAt(n - 1) == text2.charAt(m - 1)) {
            return dp[n][m] = 1 + longestCommonSubsequence(text1, text2, n - 1, m - 1, dp);
        } else {
            return dp[n][m] = Math.max(longestCommonSubsequence(text1, text2, n - 1, m, dp),
                    longestCommonSubsequence(text1, text2, n, m - 1, dp));
        }
    }
}
