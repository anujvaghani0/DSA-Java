package Arrays;

//question link -> https://leetcode.com/problems/largest-perimeter-triangle/

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(largestPerimeter(nums));
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 1; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return  nums[i] + nums[i - 2] + nums[i - 1];
            }
        }
        return  0;
    }
}
