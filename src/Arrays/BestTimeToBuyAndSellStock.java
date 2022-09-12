package Arrays;

import java.util.PriorityQueue;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int difference = prices[0];
        int maximumProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            difference = Math.min(difference, prices[i]);
            int profit = prices[i] - difference;
            maximumProfit = Math.max(maximumProfit, profit);
        }
        return maximumProfit;
    }
}