package Arrays;

//question link -> https://leetcode.com/problems/apply-operations-to-an-array/

import java.util.Arrays;

public class ApplyOperationsToAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 0};
        System.out.println(Arrays.toString(applyOperations(arr)));
    }

    public static int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        moveZero(nums);
        return nums;
    }

    private static void moveZero(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                k++;
            } else if (k > 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - k] = temp;
            }
        }
    }
}
