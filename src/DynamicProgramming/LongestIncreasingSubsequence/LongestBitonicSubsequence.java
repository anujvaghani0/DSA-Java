package DynamicProgramming.LongestIncreasingSubsequence;

import java.util.Arrays;

public class LongestBitonicSubsequence {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 2};
        System.out.println(LongestBitonicSequence(nums));
    }

    public static int LongestBitonicSequence(int[] nums) {
        int n = nums.length;
        int[] dp1 = new int[n];
        Arrays.fill(dp1, 1);
        int[] dp2 = new int[n];
        Arrays.fill(dp2, 1);

        int max = 0;
        for (int i = 1; i < n; i++) {
            for (int prev = 0; prev <= i - 1; prev++) {
                if (nums[prev] < nums[i] && 1 + dp1[prev] > dp1[i]) {
                    dp1[i] = 1 + dp1[prev];
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int prev = n - 1; prev > i; prev--) {
                if (nums[prev] < nums[i] && 1 + dp2[prev] > dp2[i]) {
                    dp2[i] = 1 + dp2[prev];
                }
            }
        }

        for (int i = 0; i < dp2.length; i++) {
            int sum = dp1[i] + dp2[i];
            max = Math.max(sum, max);
        }
        return max - 1;
    }
}
