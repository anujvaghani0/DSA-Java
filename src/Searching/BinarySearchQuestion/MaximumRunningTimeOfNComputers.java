package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/maximum-running-time-of-n-computers/

public class MaximumRunningTimeOfNComputers {
    public static void main(String[] args) {
        int[] batteries = {3, 3, 3};
        System.out.println(maxRunTime(2, batteries));
    }

    public static long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (int i = 0; i < batteries.length; i++) {
            sum += batteries[i];
        }

        long start = 1;
        long end = sum;
        long ans = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isPossible(batteries, mid, n)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] batteries, long mid, int n) {
        long duration = 0;
        for (int i = 0; i < batteries.length; i++) {
            if (batteries[i] > mid) {
                duration += mid;
            } else {
                duration += batteries[i];
            }
        }
        return duration >= n * mid;
    }
}