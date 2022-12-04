package DynamicProgramming.BuySellStock;

public class BestTimeToBuyAndSellStockIV {
    public static void main(String[] args) {
    int[] prices={2,4,1};
        System.out.println(maxProfit(2,prices));
    }

    public static int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2 * k];
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < 2 * k; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(prices, 0, 0, k, dp);
    }

    private static int solve(int[] prices, int index, int operationNumber, int k, int[][] dp) {
        if (index == prices.length) {
            return 0;
        }
        if (operationNumber == 2 * k) {
            return 0;
        }
        if (dp[index][operationNumber] != -1) {
            return dp[index][operationNumber];
        }
        int profit = 0;
        if (operationNumber % 2 == 0) {
            int takeBuy = -prices[index] + solve(prices, index + 1, operationNumber + 1, k, dp);
            int skipBuy = solve(prices, index + 1, operationNumber, k, dp);
            profit = Math.max(takeBuy, skipBuy);
        } else {
            int takeSell = prices[index] + solve(prices, index + 1, operationNumber + 1, k, dp);
            int skipSell = solve(prices, index + 1, operationNumber, k, dp);
            profit = Math.max(takeSell, skipSell);
        }
        return dp[index][operationNumber] = profit;
    }
}
