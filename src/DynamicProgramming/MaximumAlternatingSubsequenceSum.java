package DynamicProgramming; 

// Question link ->https://leetcode.com/problems/maximum-alternating-subsequence-sum/

public class MaximumAlternatingSubsequenceSum {
    public static void main(String[] args) {
        int[] numbs = {2, 3, -2, 4};
        System.out.println(maxAlternatingSum(numbs));
    }

    public static long maxAlternatingSum(int[] nums) {
        long[][] dp = new long[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 2; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(nums, 0, 1, dp);
    }

    private static long solve(int[] prices, int index, int Buy, long[][] dp) {
        if (index == prices.length) {
            return 0;
        }
        if (dp[index][Buy] != -1) {
            return dp[index][Buy];
        }

        long profit = 0;
        if (Buy == 1) {
            long take = prices[index] + solve(prices, index + 1, 0, dp);
            long SkipBuy = solve(prices, index + 1, 1, dp);
            profit = Math.max(take, SkipBuy);
        } else {
            long takeSell = -prices[index] + solve(prices, index + 1, 1, dp);
            long SkipSell = solve(prices, index + 1, 0, dp);
            profit = Math.max(takeSell, SkipSell);
        }
        return dp[index][Buy] = profit;
    }
}
