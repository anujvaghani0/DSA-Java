package Sorting;

import java.util.Arrays;

public class FindTheValueOfThePartition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4};
        System.out.println(findValueOfPartition(nums));
    }

    public static int findValueOfPartition(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int minimum = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 1; i--) {
            minimum = Math.min(minimum, Math.abs(nums[i] - nums[i - 1]));
        }
        return minimum;
    }
}
