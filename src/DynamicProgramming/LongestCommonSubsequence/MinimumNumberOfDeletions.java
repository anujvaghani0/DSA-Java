package DynamicProgramming.LongestCommonSubsequence;

// Question link -> https://practice.geeksforgeeks.org/problems/minimum-number-of-deletions4610/1

public class MinimumNumberOfDeletions {
    public static void main(String[] args) {
        System.out.println(minDeletions("aebcbda", 7));
    }

    public static int minDeletions(String s, int n) {
        StringBuilder text1 = new StringBuilder(s);
        StringBuilder text2 = text1.reverse();
//       int n=s.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return n - dp[n][m];
    }
}
