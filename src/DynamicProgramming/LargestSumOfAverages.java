package DynamicProgramming; 

// Question link -> https://leetcode.com/problems/largest-sum-of-averages/

import java.util.Arrays;

public class LargestSumOfAverages {
    public static void main(String[] args) {
        int[] nums = {9, 1, 2, 3, 9};
        System.out.println(largestSumOfAverages(nums, 3));
    }

    public static double largestSumOfAverages(int[] nums, int k) {
        int n = nums.length;
        double[][] dp = new double[n][k];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(nums, 0, n, k - 1, dp);
    }

    private static double solve(int[] nums, int start, int end, int k, double[][] dp) {
        if (start >= end) {
            return 0;
        }

        if (dp[start][k] != -1) {
            return dp[start][k];
        }

        if (k == 0) {
            double lastPartitionSum = 0;
            for (int i = start; i < end; i++) {
                lastPartitionSum += nums[i];
            }
            return lastPartitionSum / (end - start);
        }

        double max = 0;
        for (int i = start + 1; i < end; i++) {
            double temp = solve(nums, i, end, k - 1, dp);
            double currentPartitionSum = 0;

            for (int j = start; j < i; j++) {
                currentPartitionSum += nums[j];
            }

            double average = currentPartitionSum / (i - start);
            max = Math.max(average + temp, max);
        }
        dp[start][k] = max;
        return max;
    }
}
