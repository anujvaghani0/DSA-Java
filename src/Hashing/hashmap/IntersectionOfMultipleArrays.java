package Hashing.hashmap;

// Question link -> https://leetcode.com/problems/intersection-of-multiple-arrays/

import java.util.*;

public class IntersectionOfMultipleArrays {
    public static void main(String[] args) {
        int[][] nums = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        System.out.println(intersection(nums));
    }

    public static List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (map.containsKey(nums[i][j])) {
                    map.put(nums[i][j], map.get(nums[i][j]) + 1);
                } else {
                    map.put(nums[i][j], 1);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == nums.length) {
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
