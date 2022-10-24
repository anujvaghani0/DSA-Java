package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/

public class MinimumNumberofDaysToMakemBouquets {
    public static void main(String[] args) {
        int[] bloomDay = {1, 10, 3, 10, 2};
        System.out.println(minDays(bloomDay, 3, 1));
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < m * k) {
            return -1;
        }
        int right = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            if (right < bloomDay[i]) {
                right = bloomDay[i];
            }
        }
        int low = 0;
        int high = right;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }


    private static boolean isPossible(int[] bloomDay, int m, int k, int days) {
        int count = 0;
        int adjacent = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= days) {
                adjacent++;
                if (adjacent == k) {
                    count++;
                    if (count == m) {
                        return true;
                    }
                    adjacent = 0;
                }
            } else {
                adjacent = 0;
            }
        }
        return false;
    }
}
