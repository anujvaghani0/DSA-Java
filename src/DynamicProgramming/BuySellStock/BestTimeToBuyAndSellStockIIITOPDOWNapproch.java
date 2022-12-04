package DynamicProgramming.BuySellStock;

import java.util.Arrays;

public class BestTimeToBuyAndSellStockIIITOPDOWNapproch {
    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        return solve(prices);
//        return solve1(prices);
    }

    // Optimization solutions
    private static int solve(int[] prices) {
        int[][] current = new int[2][3];
        int[][] next = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                current[i][j] = 0;
                next[i][j] = 0;
            }
        }
        int n = prices.length;
        int profit = 0;
        for (int index = n - 1; index >= 0; index--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int limit = 1; limit <= 2; limit++) {
                    if (buy == 1) {
                        int takeBuy = -prices[index] + next[0][limit];
                        int skipBuy = next[1][limit];
                        profit = Math.max(takeBuy, skipBuy);
                    } else {
                        int takeSell = prices[index] + next[1][limit - 1];
                        int skipSell = next[0][limit];
                        profit = Math.max(takeSell, skipSell);
                    }
                    current[buy][limit] = profit;
                }
            }
            next = current;
        }
        return next[1][2];
    }

    //      TOP-DOWN APPROACH
    private static int solve1(int[] prices) {
        int[][][] dp = new int[prices.length + 1][2][3];
        for (int[][] k : dp) {
            for (int[] l : k) {
                Arrays.fill(l, 0);
            }
        }
        int n = prices.length;
        int profit = 0;
        for (int index = n - 1; index >= 0; index--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int limit = 1; limit <= 2; limit++) {
                    if (buy == 1) {
                        int takeBuy = -prices[index] + dp[index + 1][0][limit];
                        int skipBuy = dp[index + 1][1][limit];
                        profit = Math.max(takeBuy, skipBuy);
                    } else {
                        int takeSell = prices[index] + dp[index + 1][1][limit - 1];
                        int skipSell = dp[index + 1][0][limit];
                        profit = Math.max(takeSell, skipSell);
                    }
                    dp[index][buy][limit] = profit;
                }
            }
        }
        return dp[0][1][2];
    }
}
