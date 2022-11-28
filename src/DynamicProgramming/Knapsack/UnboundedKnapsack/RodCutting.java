package DynamicProgramming.Knapsack.UnboundedKnapsack;

// Question link -> https://practice.geeksforgeeks.org/problems/rod-cutting0840/1

public class RodCutting {
    public static void main(String[] args) {
        int[] price = {3, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(cutRod(price, price.length));
    }

    public static int cutRod(int[] price, int n) {
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = i + 1;
        }

        n = price.length;
        int w = cost.length;
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || w == 0) {
                    dp[i][j] = 0;
                } else if (cost[i - 1] <= j) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - cost[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][w];
    }
}
