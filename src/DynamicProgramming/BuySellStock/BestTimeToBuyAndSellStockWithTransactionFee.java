package DynamicProgramming.BuySellStock;

// Question link -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
public class BestTimeToBuyAndSellStockWithTransactionFee {
    public static void main(String[] args) {
    int[] prices={1,3,2,8,4,9};
        System.out.println(maxProfit(prices,2));
    }

    public static int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < 2; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(prices, 0, 1, fee, dp);
    }

    private static int solve(int[] prices, int index, int Buy, int fee, int[][] dp) {
        if (index == prices.length) {
            return 0;
        }
        if (dp[index][Buy] != -1) {
            return dp[index][Buy];
        }

        int profit = 0;
        if (Buy == 1) {
            int take = -prices[index] + solve(prices, index + 1, 0, fee, dp);
            int SkipBuy = solve(prices, index + 1, 1, fee, dp);
            profit = Math.max(take, SkipBuy);
        } else {
            int takeSell = prices[index] + solve(prices, index + 1, 1, fee, dp)-fee;
            int SkipSell = solve(prices, index + 1, 0, fee, dp);
            profit = Math.max(takeSell, SkipSell);
        }
        return dp[index][Buy] = profit;

    }
}
