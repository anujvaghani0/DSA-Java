package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/minimum-time-to-complete-trips/

public class MinimumTimeToCompleteTrips {
    public static void main(String[] args) {
        int[] times = {1, 2, 3};
        System.out.println(minimumTime(times, 5));
    }

    public static long minimumTime(int[] time, int totalTrips) {
        long low = 1;
        long high = 100000000000000L;
        long ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (isPossible(time, mid, totalTrips)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] time, long mid, int totalTrips) {
        long count = 0;
        for (int i = 0; i < time.length; i++) {
            count += mid / time[i];
        }
        return count >= totalTrips;
    }
}
