package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(shipWithinDays(nums, 5));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int total = 0;
        for (int i = 0; i < weights.length; i++) {
            max = Math.max(weights[i], max);
            total += weights[i];
        }
        if (days == weights.length) {
            return max;
        }
        int low = max;
        int high = total;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(weights, mid, days)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] weights, int mid, int days) {
        int subArrays = 1;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            if (sum > mid) {
                subArrays++;
                sum = weights[i];
            }
        }
        return subArrays <= days;
    }
}
