package DynamicProgramming.LongestCommonSubsequence;

// Question link -> https://practice.geeksforgeeks.org/problems/shortest-common-supersequence0322/1

public class ShortestCommonSupersequence {
    public static void main(String[] args) {
        String text1 = "abac";
        String text2 = "cab";
        System.out.println(shortestCommonSupersequence(text1, text2));
    }

    public static int shortestCommonSupersequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return m + n - dp[n][m];
    }
}