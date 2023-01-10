package GreedyAlgorithm;

import java.util.Arrays;

public class MaximumIceCreamBars {
    public static void main(String[] args) {
        int[] coins = {1, 6, 3, 1, 2, 5};
        System.out.println(maxIceCream(coins, 20));
    }

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] <= coins) {
                coins -= costs[i];
            } else {
                return i;
            }
        }
        return costs.length;
    }
}
