package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/maximum-candies-allocated-to-k-children/

public class MaximumCandiesAllocatedToKChildren {
    public static void main(String[] args) {
        int[] candies = {9, 8, 6, 4};
        System.out.println(maximumCandies(candies, 2));
    }

    public static int maximumCandies(int[] candies, long k) {
        int max = 0;
        long sum = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(candies[i], max);
            sum += candies[i];
        }

        if (sum < k) {
            return 0;
        }

        int low = 1;
        int high = max;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(candies, mid, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] candies, int mid, long k) {
        for (int i = 0; i < candies.length && k > 0; i++) {
            k -= candies[i] / mid;
        }
        return k <= 0;
    }
}
