package DynamicProgramming.Knapsack.UnboundedKnapsack;

import java.util.Arrays;

public class SumOfNumbersWithUnitsDigitK {
    public static void main(String[] args) {

    }

    public static int minimumNumbers(int num, int k) {
//        if both are zero
        if (k == 0 && num == 0) {
            return 0;
        }
//        if k is zero
        if (k == 0) {
            return num % 10 == 0 ? 1 : -1;
        }
//      if num is zero
        if (num == 0) {
            return 0;
        }

        int[][] dp = new int[num + 1][num + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        int length = solve(k, num, k, dp);
        return (length >= 1e9) ? 1 : length;
    }

    private static int solve(int k, int num, int k1, int[][] dp) {
        return 0;
    }
}
