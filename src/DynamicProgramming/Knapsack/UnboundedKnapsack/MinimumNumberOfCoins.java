package DynamicProgramming.Knapsack.UnboundedKnapsack;

// Question link -> https://practice.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1

import java.util.ArrayList;
import java.util.List;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        System.out.println(coinChange(43));
    }

    public static List<Integer> coinChange(int amount) {
        int[] conies = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        int i = conies.length - 1;
        while (sum < amount && i >= 0) {
            if (sum + conies[i] <= amount) {
                sum += conies[i];
                ans.add(conies[i]);
            } else {
                i--;
            }
        }
        return ans;
    }
}
