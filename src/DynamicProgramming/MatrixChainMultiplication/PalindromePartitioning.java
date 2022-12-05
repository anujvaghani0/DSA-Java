package DynamicProgramming.MatrixChainMultiplication;

// Question link -> https://practice.geeksforgeeks.org/problems/palindromic-patitioning4845/0

public class PalindromePartitioning {
    public static void main(String[] args) {
        System.out.println(palindromicPartition("ababbbabbababa"));
    }

    public static int palindromicPartition(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(str, 0, n - 1, dp);
    }

    private static int solve(String str, int i, int j, int[][] dp) {
        if (i >= j) {
            return 0;
        }

        if (isPalindrom(str, i, j)) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int minimum = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int temp = 1 + solve(str, i, k, dp) + solve(str, k + 1, j, dp);
            minimum = Math.min(temp, minimum);
        }
        return dp[i][j] = minimum;
    }

    private static boolean isPalindrom(String str, int i, int j) {
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
