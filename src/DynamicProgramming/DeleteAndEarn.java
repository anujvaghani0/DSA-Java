package DynamicProgramming; 

public class DeleteAndEarn {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 3, 4};
        System.out.println(deleteAndEarn(nums));
    }

    public static int deleteAndEarn(int[] nums) {
//        Tabulation
//        similar to houseRobber problem
        int[] ans = new int[10001];
        for (int i = 0; i < nums.length; i++) {
            ans[nums[i]] += nums[i];
        }

        int[] dp = new int[10001];
        dp[0] = ans[0];
        dp[1] = Math.max(ans[0], ans[1]);
        for (int i = 2; i <= 10000; i++) {
//            In two case are there
//            first will take the number
            int include = dp[i - 2] + ans[i];

//            second case is skip the number do not take it the number
            int exculde = dp[i - 1];
            dp[i] = Math.max(include, exculde);
        }
        return dp[10000];
    }
}
