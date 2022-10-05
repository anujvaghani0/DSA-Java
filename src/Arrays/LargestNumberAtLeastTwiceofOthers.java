package Arrays;

import java.util.Arrays;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        int[] nums = {0, 0, 3, 2};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                second = first;
                first = nums[i];
                index = i;
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }
        if (first / 2 >= nums[nums.length - 2]) {
            return index;
        }
        return -1;
    }
}