package DynamicProgramming;

// Question link -> https://leetcode.com/problems/longest-increasing-subsequence/

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                } else {
                    dp[i] = Math.max(dp[i], 1);
                }
            }
        }
        int max = 1;
        int i = 0;
        for (int k = 0; k < dp.length; k++) {
            max = Math.max(dp[i++], max);
        }
        return max;
    }
}
