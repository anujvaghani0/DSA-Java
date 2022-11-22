package DynamicProgramming.Knapsack;

// Question link -> https://leetcode.com/problems/partition-equal-subset-sum/

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        System.out.println(canPartition(nums));
    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 == 0) {
           return isSubsetSum(nums.length, nums, sum / 2);
        }
        return false;
    }

    private static Boolean isSubsetSum(int N, int arr[], int sum) {
        boolean[][] dp = new boolean[N + 1][sum + 1];
        for (int i = 0; i <= sum; i++) {
            dp[0][i] = false;
        }
        for (int i = 0; i <= N; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = (dp[i - 1][j - arr[i - 1]] || dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][sum];
    }
}
