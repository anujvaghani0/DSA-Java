package DynamicProgramming.BuySellStock;

// Question link -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int difference = prices[0];
        int maximumProfit = 0;
        for (int price : prices) {
            difference = Math.min(difference, price);
            int profit = price - difference;
            maximumProfit = Math.max(maximumProfit, profit);
        }
        return maximumProfit;
    }
}