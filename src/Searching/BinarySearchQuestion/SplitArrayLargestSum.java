package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        System.out.println(splitArray(nums, 2));
    }

    public static int splitArray(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return 0;
        }
        int max = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            total += nums[i];
        }

        if (k == nums.length) {
            return max;
        }
        if (k == 1) {
            return total;
        }

        int low = max;
        int high = total;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(nums, mid, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] nums, int mid, int k) {
        int subArray = 1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > mid) {
                subArray++;
                sum = nums[i];
            }
        }
        return subArray <= k;
    }
}
