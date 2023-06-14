package Arrays;

//question link -> https://leetcode.com/problems/longest-continuous-increasing-subsequence/

public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 2, 3, 4, 5};
        System.out.println(findLengthOfLCIS(nums));
    }

    public static int findLengthOfLCIS(int[] nums) {
        int count = 0;
        int previous = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                previous++;
            } else {
                if (count < previous) {
                    count = previous;
                }
                previous = 1;
            }
        }
        return  Math.max(previous, count);
    }
}
