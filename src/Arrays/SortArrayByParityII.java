package Arrays;

import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        int[] ans = sortArrayByParityII(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int j = 1;
        for (int i = 0; i < n; i += 2)
            if (nums[i] % 2 == 1) {
                while (nums[j] % 2 == 1) {
                    j += 2;
                }
                swap(nums, i, j);
            }
        return nums;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
