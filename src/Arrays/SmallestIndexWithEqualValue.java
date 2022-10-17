package Arrays;

//question link -> https://leetcode.com/problems/smallest-index-with-equal-value/

public class SmallestIndexWithEqualValue {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 1};
        System.out.println(smallestEqual(nums));
    }

    public static int smallestEqual(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                min = Math.min(min, i);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}