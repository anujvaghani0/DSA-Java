package Arrays;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElementsII {
    public static void main(String[] args) {
        int[] nums = {1, 10, 2, 9};
        System.out.println(minMoves2(nums));
    }

    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        while (i < j) {
            count += nums[j] - nums[i];
            i++;
            j--;
        }
        return count;
    }
}