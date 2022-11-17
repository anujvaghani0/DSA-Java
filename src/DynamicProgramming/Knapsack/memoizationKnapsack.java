package DynamicProgramming.Knapsack;

public class memoizationKnapsack {
    public static void main(String[] args) {
        int[] values = {1,2,3};
        int[] weight = {4,5,6};
        System.out.println(knapsackMemoization(values, weight, 3, values.length));
    }

    public static int knapsackMemoization(int[] values, int[] weight, int w, int n) {
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                dp[i][j] = -1;
            }
        }
        return knapsackRecursion(values, weight, w, n, dp);
    }

    public static int knapsackRecursion(int[] values, int[] weight, int w, int n, int[][] dp) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (dp[n][w] != -1) {
            return dp[n][w];
        }

        if (weight[n - 1] > w) {
            return knapsackRecursion(values, weight, w, n - 1, dp);
        } else {
            return Math.max(values[n - 1] + knapsackRecursion(values, weight, w - weight[n - 1], n - 1, dp),
                    knapsackRecursion(values, weight, w, n - 1, dp));
        }
    }
}