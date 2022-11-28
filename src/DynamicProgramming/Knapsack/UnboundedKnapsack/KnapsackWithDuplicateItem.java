package DynamicProgramming.Knapsack.UnboundedKnapsack;

// Question link -> https://practice.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1

public class KnapsackWithDuplicateItem {
    public static void main(String[] args) {
        int[] val = {1, 1};
        int[] wt = {2, 1};
        int W = 3;
        int n = val.length;
        System.out.println(knapsack(W, wt, val, n));
    }

    public static int knapsack(int w, int[] wt, int[] val, int n) {
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || w == 0) {
                    dp[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][w];
    }
}
