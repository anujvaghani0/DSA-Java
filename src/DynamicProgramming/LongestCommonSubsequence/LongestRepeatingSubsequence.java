package DynamicProgramming.LongestCommonSubsequence;

// Question link -> https://practice.geeksforgeeks.org/problems/longest-repeating-subsequence2004/0

public class LongestRepeatingSubsequence {
    public static void main(String[] args) {
        System.out.println(LongestRepeatingsSubsequence("axxzxy"));
    }

    public static int LongestRepeatingsSubsequence(String s) {
        int n = s.length();
        int m = s.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s.charAt(i - 1) == s.charAt(j - 1) && i != j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }
}
