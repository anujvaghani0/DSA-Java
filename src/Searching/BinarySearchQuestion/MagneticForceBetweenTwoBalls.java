package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/magnetic-force-between-two-balls/

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 7};
        System.out.println(maxDistance(nums, 3));
    }

    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length - 1];
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(position, mid, m)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] position, int mid, int m) {
        int initial = 1;
        int previous = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] - previous >= mid) {
                previous = position[i];
                initial++;
                if (initial == m) {
                    return true;
                }

            }
        }
        return initial >= m;
    }
}
