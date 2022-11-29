package DynamicProgramming.LongestCommonSubsequence;

public class PrintingLongestcommonSubsequence {
    public static void main(String[] args) {
        String text1 = "abac";
        String text2 = "cab";
        System.out.println(print(text1, text2));
    }

    public static String print(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        StringBuilder ans = new StringBuilder();
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

//  printing a subsequence
        while (n > 0 && m > 0) {
            if (text1.charAt(n - 1) == text2.charAt(m - 1)) {
                ans.append(text1.charAt(n - 1));
                m--;
                n--;
            } else {
                if (dp[n][m - 1] > dp[n - 1][m]) {
                    m--;
                } else {
                    n--;
                }
            }
        }
        return ans.reverse().toString();
    }
}