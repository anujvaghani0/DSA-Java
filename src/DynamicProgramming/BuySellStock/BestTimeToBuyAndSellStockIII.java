package DynamicProgramming.BuySellStock;

// Question link -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/

import java.util.Arrays;

public class BestTimeToBuyAndSellStockIII {
    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][2][3];
        for (int[][] k : dp) {
            for (int[] l : k) {
                Arrays.fill(l, -1);
            }
        }
        return solve(prices, 0, 1, 2, dp);
    }

//      Memorization
    private static int solve(int[] prices, int index, int Buy, int limit, int[][][] dp) {
        if (prices.length == index) {
            return 0;
        }
        if (limit == 0) {
            return 0;
        }
        if (dp[index][Buy][limit] != -1) {
            return dp[index][Buy][limit];
        }

        int profit = 0;
        if (Buy == 1) {
            int takeBuy = -prices[index] + solve(prices, index + 1, 0, limit, dp);
            int skipBuy = solve(prices, index + 1, 1, limit, dp);
            profit = Math.max(takeBuy, skipBuy);
        } else {
            int takeSell = prices[index] + solve(prices, index + 1, 1, limit - 1, dp);
            int skipSell = solve(prices, index + 1, 0, limit, dp);
            profit = Math.max(takeSell, skipSell);
        }
        return dp[index][Buy][limit] = profit;
    }
}
