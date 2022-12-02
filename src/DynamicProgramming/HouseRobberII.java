package DynamicProgramming;

// Question link -> https://leetcode.com/problems/house-robber-ii/

public class HouseRobberII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        if (n == 1) {
            return nums[0];
        }
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                left[i] = nums[i];
            }
            if (i != 0) {
                right[i] = nums[i];
            }
        }
        return Math.max(solve(left), solve(right));
    }

    private static int solve(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            int include = dp[i + 2] + nums[i];
            int exculde = dp[i + 1];
            dp[i] = Math.max(include, exculde);
        }
        return dp[0];
    }
}