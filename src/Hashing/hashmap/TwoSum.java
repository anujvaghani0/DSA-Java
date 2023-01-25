package Hashing.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                ans[1] = i;
                ans[0] = map.get(temp);
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
