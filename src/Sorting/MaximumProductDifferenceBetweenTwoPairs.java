package Sorting;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
        System.out.println(maxProductDifference(nums));
    }

    public static int maxProductDifference(int[] nums) {
        int max = 0;
        int secondMax = 0;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
            if (nums[i] <= min) {
                secondMin = min;
                min = nums[i];
            } else if (nums[i] < secondMin) {
                secondMin = nums[i];
            }
        }
        return max * secondMax - min * secondMin;
    }
}

//2nd Solution

//    public static int maxProductDifference(int[] nums) {
//        Arrays.sort(nums);
//
//        int max = nums[nums.length - 1] * nums[nums.length - 2];
//        int min = nums[0] * nums[1];
//
//        return max - min;
//    }
