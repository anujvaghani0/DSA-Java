package Sorting;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedSubarray(nums));
    }

    public static int findUnsortedSubarray(int[] nums) {
            int[] arr = nums.clone();
            Arrays.sort(arr);
            int start = arr.length;
            int end = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != nums[i]) {
                    start = Math.min(start, i);
                    end = Math.max(end, i);
                }
            }
            if (end - start >= 0) {
                return end - start + 1;
            }
            return 0;
    }
}
