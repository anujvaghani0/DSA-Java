package Arrays;

//question link -> https://leetcode.com/problems/maximum-ascending-subarray-sum/

public class MaximumAscendingSubarraySum {
    public static void main(String[] args) {
        int[] nums = {12, 17, 15, 13, 10, 11, 12};
        System.out.println(maxAscendingSum(nums));
    }

    public static int maxAscendingSum(int[] nums) {
        int temp = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                temp += nums[i];
            } else {
                temp = nums[i];
            }
            ans = Math.max(ans, temp);
        }
        return  ans;
    }
}
