package DynamicProgramming.LongestIncreasingSubsequence;

import java.util.Arrays;

public class LSC {
    public static void main(String[] args) {
        int[] nums = {5, 6, 4, 7, 8, 9, 10};
        System.out.println(lengthOfLIS(nums));
    }


    public static int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(nums, 0, -1, dp);
    }

    private static int solve(int[] nums, int current, int previous, int[][] dp) {
        if (current >= nums.length) {
            return 0;
        }

        if (dp[current][previous + 1] != -1) {
            return dp[current][previous + 1];
        }

        int take = 0;
        int dotTake = solve(nums, current + 1, previous, dp);
        if (previous == -1 || nums[current] > nums[previous]) {
            take = 1 + solve(nums, current + 1, current, dp);
        }

        return dp[current][previous + 1] = Math.max(take, dotTake);

    }
}
