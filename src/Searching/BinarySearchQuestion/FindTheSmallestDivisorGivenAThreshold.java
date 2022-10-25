package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/

public class FindTheSmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
        int[] arr = {12, 50, 11, 75, 57, 12, 73, 4, 69, 78};
        System.out.println(smallestDivisor(arr, 649));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        if (threshold == nums.length) {
            return max;
        }

        int low = 1;
        int high = max;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(nums, mid, threshold)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] nums, int mid, int threshold) {
        int divisor = 0;
        for (int i = 0; i < nums.length; i++) {
            divisor += (int) Math.ceil(nums[i] * 1.0 / mid);
        }
        return divisor <= threshold;
    }
}
