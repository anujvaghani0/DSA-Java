package Sorting;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores {
    public static void main(String[] args) {
        int[] arr = {9, 4, 1, 7};
        int k = 2;
        System.out.println(minimumDifference(arr, k));
    }

    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i + k - 1 >= nums.length) {
                break;
            }
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
        }
        return ans;
    }
}
