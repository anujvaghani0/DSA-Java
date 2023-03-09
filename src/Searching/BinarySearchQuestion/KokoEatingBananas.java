package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/koko-eating-bananas/

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        System.out.println(minEatingSpeed(piles, 18));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        if (h == piles.length) {
            return max;
        }

        int low = 0;
        int high = max;
        int speed = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(piles, mid, h)) {
                speed = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return speed;
    }

    private static boolean isPossible(int[] piles, int mid, int h) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            time += (int) Math.ceil(piles[i] * 1.0 / mid);
        }

        if (time < -1) {
            return false;
        }
        return time <= h;
    }
}
