package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/

public class MinimumLimitOfBallsInABag {
    public static void main(String[] args) {
        int[] nums = {2, 4, 8, 2};
        System.out.println(minimumSize(nums, 4));
    }

    public static int minimumSize(int[] nums, int maxOperations) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        int start = 0;
        int end = max;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(nums, mid, maxOperations)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] nums, int mid, int maxOperations) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] - 1) / mid;
        }
        return count <= maxOperations;
    }
}