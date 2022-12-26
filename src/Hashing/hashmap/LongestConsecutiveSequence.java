package Hashing.hashmap;

// Question link -> https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int longStreak = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int currentStreak = 1;
                int currentNumber = nums[i];
                while (set.contains(currentNumber + 1)) {
                    currentStreak++;
                    currentNumber++;
                }
                longStreak = Math.max(longStreak, currentStreak);
            }
        }
        return longStreak;
    }
}
