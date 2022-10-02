package sorting;

import java.util.Arrays;

public class threeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        System.out.println(threeSumClosest(nums, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int difference = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(difference)) {
                    difference = target - sum;
                }
                if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return (target - difference);
    }
}
