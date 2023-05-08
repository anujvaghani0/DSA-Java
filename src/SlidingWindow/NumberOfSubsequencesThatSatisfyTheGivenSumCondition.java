package SlidingWindow;

import java.util.Arrays;

public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
    public static void main(String[] args) {
    int[] nums={3,5,6,7};
        System.out.println(numSubseq(nums,9));
    }

    public static int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length;
        int ans = 0;
        int[] p = new int[right];
        p[0] = 1;
        for (int i = 1; i < right; i++) {
            p[i] = (int) ((p[i - 1] * 2) % 1000000007);
        }
        right--;
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                ans += p[right - left];
                ans %= 1000000007;
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
