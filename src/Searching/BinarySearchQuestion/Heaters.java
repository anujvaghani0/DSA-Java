package Searching.BinarySearchQuestion;

import java.util.Arrays;

public class Heaters {
    public static void main(String[] args) {
        int[] a = {1, 5};
        int[] heaters = {2};
        System.out.println(findRadius(a, heaters));
    }

    public static int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < houses.length; i++) {
            int index = findTheCloset(heaters, houses[i]);
            max = Math.max(max, Math.abs(heaters[index] - houses[i]));
        }
        return max;
    }

    private static int findTheCloset(int[] heaters, int target) {
        int left = 0;
        int right = heaters.length - 1;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (Math.abs(heaters[mid] - target) < Math.abs(heaters[ans] - target)) {
                ans = mid;
            }
            if (heaters[mid] == target) {
                return mid;
            } else if (heaters[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
