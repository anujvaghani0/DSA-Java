package Hashing.hashmap;

import java.util.*;

public class FindAllLonelyNumbersInTheArray {
    public static void main(String[] args) {
        int[] nums = {10, 6, 5,8};
        System.out.println(findLonely(nums));
    }

    public static List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1 && !map.containsKey(nums[i] - 1) && !map.containsKey(nums[i] + 1)) {
                ans.add(nums[i]);
            }

        }
        return ans;
    }
}
