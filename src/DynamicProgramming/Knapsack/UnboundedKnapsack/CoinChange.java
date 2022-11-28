package DynamicProgramming.Knapsack.UnboundedKnapsack;

// Question link -> https://leetcode.com/problems/coin-change/

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(coinChange(coins, 11));
    }

    public static int coinChange(int[] coins, int amount) {
        int N = coins.length;
        int maximum = Integer.MAX_VALUE - 1;
        int[][] dp = new int[N + 1][amount + 1];
        for (int i = 0; i <= amount; i++) {
            dp[0][i] = maximum;
        }
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 0;
        }
        for (int j = 1; j <= amount; j++) {
            if (j % coins[0] == 0) {
                dp[1][j] = j / coins[0];
            } else {
                dp[1][j] = maximum;
            }
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(dp[i][j - coins[i - 1]] + 1, dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][amount] == maximum ? -1 : dp[N][amount];
    }
}
