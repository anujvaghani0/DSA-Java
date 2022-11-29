package DynamicProgramming.LongestCommonSubsequence;

// Question link -> https://practice.geeksforgeeks.org/problems/longest-common-substring1452/1

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        int n = text1.length();
        int m = text2.length();
        System.out.println(longestCommonSubstr(text1, text2, n, m));
    }

    public static int longestCommonSubstr(String text1, String text2, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }
}
