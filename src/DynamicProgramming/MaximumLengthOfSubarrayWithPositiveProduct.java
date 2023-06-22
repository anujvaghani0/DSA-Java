package DynamicProgramming;  

// Question link -> https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/

// Algorithm follow -> https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/discuss/820072/EASY-soultion-with-DRY-RUN-JAVA

public class MaximumLengthOfSubarrayWithPositiveProduct {
    public static void main(String[] args) {
        int[] nums = {1, -2, -3, 4};
        System.out.println(getMaxLen(nums));
    }

    public static int getMaxLen(int[] nums) {
        int positive = 0;
        int negative = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                positive = 0;
                negative = 0;
            } else if (nums[i] > 0) {
                positive++;
                negative = negative == 0 ? 0 : negative + 1;
            } else {
                int temp = positive;
                positive = negative == 0 ? 0 : negative + 1;
                negative = temp + 1;
            }
            ans = Math.max(ans, positive);
        }
        return ans;
    }
}
