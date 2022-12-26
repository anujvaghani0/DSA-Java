package DynamicProgramming;

// Question link -> https://leetcode.com/problems/ways-to-make-a-fair-array/

public class WaysToMakeAFairArray {
    public static void main(String[] args) {
        int[] nums = {2, 1, 6, 4};
        System.out.println(waysToMakeFair(nums));
    }

    public static int waysToMakeFair(int[] nums) {
        int ans = 0;
        int[] right = new int[2];
        int[] left = new int[2];
        for (int i = 0; i < nums.length; i++) {
            right[i % 2] += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            right[i % 2] -= nums[i];
            if (left[0] + right[1] == left[1] + right[0]) {
                ans++;
            }
            left[i % 2] += nums[i];
        }
        return ans;
    }
}
