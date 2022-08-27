package Arrays;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {5, 9, 7, 3, 2, 4, 6, 8};
        int[] ans = sortArrayByParity(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] % 2 == 1) {
                while (nums[j] % 2 == 1) {
                    j = (nums.length - 1) - i;
                }
                swap(nums, i, j);
            }
        }
        return nums;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
