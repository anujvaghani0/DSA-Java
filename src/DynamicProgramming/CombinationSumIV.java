package DynamicProgramming; 

// Question link -> https://leetcode.com/problems/combination-sum/

import java.util.Arrays;

public class CombinationSumIV {
    public static void main(String[] args) {
        int[] nums={1,2};
        System.out.println(combinationSum4(nums,3));
    }

    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp,-1);
        return solve(nums, target, dp);
    }

    private static int solve(int[] nums, int target, int[] dp) {
        if (target == 0) {
            return 1;
        }
        if (target < 0) {
            return 0;
        }

        if (dp[target] != -1) {
            return dp[target];
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += solve(nums, target-nums[i], dp);
        }

        dp[target] = ans;
        return dp[target];
    }
}
