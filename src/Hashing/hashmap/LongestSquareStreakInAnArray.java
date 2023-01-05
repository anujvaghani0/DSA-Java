package Hashing.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSquareStreakInAnArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 16, 8, 2};
        System.out.println(longestSquareStreak(nums));
    }

    public static int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        int s = -1;
        for (int i = 0; i < nums.length; i++) {
            int mid = (int) Math.sqrt(nums[i]);
            if (mid * mid == nums[i] && map.containsKey(mid)) {
                map.put(nums[i], map.get(mid) + 1);
                if (map.containsKey(mid)) {
                    if (map.get(mid) + 1 > s) {
                        s = map.get(mid) + 1;
                    }
                }
            } else {
                map.put(nums[i], 1);
            }
        }
        return s;
    }
}
