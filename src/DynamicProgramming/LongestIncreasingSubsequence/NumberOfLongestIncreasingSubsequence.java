package DynamicProgramming.LongestIncreasingSubsequence;

import java.util.Arrays;

public class NumberOfLongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        System.out.println(findNumberOfLIS(nums));
    }

    public static int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] count = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);

        int max = 1;
        for (int i = 1; i < n; i++) {
            for (int prev = 0; prev <= i - 1; prev++) {
                if (nums[prev] < nums[i] && 1 + dp[prev] > dp[i]) {
                    dp[i] = 1 + dp[prev];
//                    inherit
                    count[i] = count[prev];
                } else if (nums[prev] < nums[i] && (1 + dp[prev] == dp[i])) {
//                    increase the count
                    count[i] += count[prev];
                }
            }
            max = Math.max(max, dp[i]);
        }

        int countLIS = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == max) {
                countLIS += count[i];
            }
        }
        return countLIS;
    }
}
