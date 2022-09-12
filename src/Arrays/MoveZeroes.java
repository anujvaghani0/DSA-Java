package Arrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] num = {0, 1, 0, 3, 12};
        moveZeroes(num);
    }

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
//        System.out.println(Arrays.toString(nums));
    }
}