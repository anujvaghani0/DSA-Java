package Arrays;

import java.util.Arrays;

public class MaximumSumWithExactlyKElements {
    public static void main(String[] args) {
        int[] nums = {5,5,5};
        System.out.println(maximizeSum(nums, 2));
    }

    public static int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = nums[n - 1];
        while (k != 1) {
            sum += nums[n - 1] + 1;
            nums[n - 1] = nums[n - 1] + 1;
            k--;
        }
        return  sum;
    }
}
