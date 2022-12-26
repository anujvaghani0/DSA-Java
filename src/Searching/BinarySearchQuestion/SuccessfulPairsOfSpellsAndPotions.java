package Searching.BinarySearchQuestion;

// Question link -> https://leetcode.com/problems/successful-pairs-of-spells-and-potions/

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions {
    public static void main(String[] args) {
        int[] spells = {5, 1, 3};
        int[] potions = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(successfulPairs(spells, potions, 7)));
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int low = 0;
            int index = -1;
            int high = m - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if ((long) potions[mid] * spells[i] >= success) {
                    index = m - mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            ans[i] = index == -1 ? 0 : index;
        }
        return ans;
    }
}
