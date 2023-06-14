package Arrays;

//question link -> https://leetcode.com/problems/maximum-difference-between-increasing-elements/

public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 10};
        System.out.println(maximumDifference(nums));
    }

    public static int maximumDifference(int[] nums) {
        int difference = -1;
        for (int i = 1, min = nums[0]; i < nums.length; i++) {
            if (nums[i] > min) {
                difference = Math.min(difference, nums[i] - min);
            }
            min = Math.min(min, nums[i]);
        }
        return  difference;
    }

//        int difference = -1;
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] < nums[j]) {
//                    difference = Math.max(difference, (nums[j] - nums[i]));
//                }
//            }
//        }
//        return  difference;
}
