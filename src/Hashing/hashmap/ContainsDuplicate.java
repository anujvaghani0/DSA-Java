package Hashing.hashmap; 

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i] + 1));
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < map.size(); i++) {
            if (map.get(nums[i]) >= 2) {
                return true;
            }
        }
        return false;
    }
}
