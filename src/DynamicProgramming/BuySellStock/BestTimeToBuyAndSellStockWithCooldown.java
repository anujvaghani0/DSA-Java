package DynamicProgramming.BuySellStock;

// Question link -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/

public class BestTimeToBuyAndSellStockWithCooldown {
    public static void main(String[] args) {
        int[] prices = {1,2,3,0,2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < 2; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(prices, 0, 1, dp);
    }

    private static int solve(int[] prices, int index, int Buy, int[][] dp) {
        if (index >= prices.length) {
            return 0;
        }
        if (dp[index][Buy] != -1) {
            return dp[index][Buy];
        }

        int profit = 0;
        if (Buy == 1) {
            int take = -prices[index] + solve(prices, index + 1, 0, dp);
            int SkipBuy = solve(prices, index + 1, 1, dp);
            profit = Math.max(take, SkipBuy);
        } else {
            int takeSell = prices[index] + solve(prices, index + 2, 1, dp);
            int SkipSell = solve(prices, index + 1, 0, dp);
            profit = Math.max(takeSell, SkipSell);
        }
        return dp[index][Buy] = profit;
    }
}
