package Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 5, 3, 3, 0};
        nextPermutation(nums);
    }

    public static void nextPermutation(int[] nums) {

//        pivot is the element just before the non-increasing suffix
        int pivot = indexOfLastPeek(nums) - 1;

        if (pivot != -1) {
            int nextPrefix = lastIndexOfGreater(nums, nums[pivot]);
            swap(nums, pivot, nextPrefix);
        }
        reverseSuffix(nums, pivot + 1);
        System.out.println(Arrays.toString(nums));
    }


    private static int indexOfLastPeek(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                return i;
            }
        }
        return 0;
    }


    private static int lastIndexOfGreater(int[] nums, int threshold) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (threshold < nums[i]) {
                return i;
            }
        }
        return -1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverseSuffix(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

}
