package DynamicProgramming.LongestCommonSubsequence;

public class ShortestCommonSupersequenceReturnString {
    public static void main(String[] args) {
        String text1 = "abac";
        String text2 = "cab";
        System.out.println(shortestCommonSupersequence(text1, text2));
    }

    public static String shortestCommonSupersequence(String text1, String text2) {
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
        int i = n;
        int j = m;
        while (i > 0 && j > 0) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                ans.insert(0, text1.charAt(i - 1));
                j--;
                i--;
            } else {
                if (dp[i][j - 1] > dp[i - 1][j]) {
                    ans.insert(0, text2.charAt(j - 1));
                    j--;
                } else {
                    ans.insert(0, text1.charAt(i - 1));
                    i--;
                }
            }
        }
//        ans.reverse();
        while (i > 0) {
            ans.insert(0, text1.charAt(i - 1));
            i--;
        }

        while (j > 0) {
            ans.insert(0, text2.charAt(j - 1));
            j--;
        }

        return ans.toString();
    }
}
