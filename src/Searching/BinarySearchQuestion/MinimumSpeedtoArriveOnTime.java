package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/minimum-speed-to-arrive-on-time/

public class MinimumSpeedtoArriveOnTime {
    public static void main(String[] args) {
        int[] destinations = {1, 3, 2};
        System.out.println(minSpeedOnTime(destinations, 2.7));
    }

    public static int minSpeedOnTime(int[] dist, double hour) {
        int total = 0;
        for (int i = 0; i < dist.length; i++) {
            total += dist[i];
        }
        int start = 0;
        int end = total;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(dist, mid, hour)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] dist, int mid, double hour) {
        double currentHour = 0;
        for (int i = 0; i < dist.length; i++) {
            currentHour += Math.ceil(dist[i] * 1.0 / mid);
        }
        currentHour -= Math.ceil(dist[dist.length - 1] * 1.0 / mid);
        currentHour += dist[dist.length - 1] * 1.0 / mid;
        return currentHour <= hour;
    }
}
