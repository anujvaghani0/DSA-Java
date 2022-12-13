package DynamicProgramming;

import java.util.Arrays;

public class MinimumFallingPathSumII {
    public static void main(String[] args) {
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        System.out.println(minFallingPathSum(matrix));
    }


    public static int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            minimum = Math.min(minimum, solve(matrix, m, 0, i, dp));
        }

        return minimum;
    }

    private static int solve(int[][] matrix, int m, int r, int c, int[][] dp) {
        if (c >= m) {
            return Integer.MAX_VALUE - 10000;
        }

        if (dp[r][c] != -1) {
            return dp[r][c];
        }

        if (r == m - 1) {
            return matrix[r][c];
        }
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            if (i != c) {
                minimum = Math.min(minimum, matrix[r][c] + solve(matrix, m, r + 1, i, dp));
            }
        }
        return dp[r][c] = minimum;
    }
}
