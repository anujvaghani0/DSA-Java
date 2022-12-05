package DynamicProgramming.MatrixChainMultiplication;

// Question link -> https://practice.geeksforgeeks.org/problems/matrix-chain-multiplication0303/0

import java.util.Arrays;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(matrixMultiplication(arr.length, arr));
    }

    public static int matrixMultiplication(int n, int[] arr) {
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(arr, 1, n - 1, dp);
    }

    private static int solve(int[] arr, int i, int j, int[][] dp) {
        if (i == j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int minimum = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int steps = arr[i - 1] * arr[k] * arr[j] + solve(arr, i, k, dp) +
                    solve(arr, k + 1, j, dp);
            minimum = Math.min(minimum, steps);
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[i][j] = minimum;
    }
}