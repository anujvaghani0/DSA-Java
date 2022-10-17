package Arrays;

//question link -> https://leetcode.com/problems/smallest-range-i/

public class SmallestRangeI {
    public static void main(String[] args) {
    int[] nums={1,3,6};
        System.out.println(smallestRangeI(nums,3));
    }

    public static int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return (min + k >= max - k) ? 0 : (max - k) - (min - k);
    }
}
