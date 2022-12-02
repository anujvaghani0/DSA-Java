package DynamicProgramming;

// Question link -> https://leetcode.com/problems/house-robber-ii/

public class HouseRobber {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 1};
        System.out.println(rob(numbs));
    }

    public static int rob(int[] nums) {
        return solve(nums);
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


//    2nd solution
//    private static int solve(int[] nums) {
//        int n = nums.length;
//        int previous2 = 0;
//        int previous1 = nums[0];
//
//        for (int i = 1; i < n; i++) {
//            int include = previous2 + nums[i];
//            int exculde = previous1;
//            int ans = Math.max(include, exculde);
//            previous1 = previous2;
//            previous2 = ans;
//        }
//        return previous1;
//    }
}
