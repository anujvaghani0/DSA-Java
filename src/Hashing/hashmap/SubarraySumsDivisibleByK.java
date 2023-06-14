package Hashing.hashmap; 

import java.util.HashMap;
import java.util.Map;

public class SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        int[] nums = {-6, 5, 0, -2, -3, 1};
        System.out.println(subarraysDivByK(nums, 5));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int total = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int reminder = sum % k;
            if (reminder < 0) {
                reminder += k;
            }

            if (map.containsKey(reminder)) {
                total += map.get(reminder);
                map.put(reminder, map.get(reminder) + 1);
            }

            map.putIfAbsent(reminder, 1);
        }
        return total;
    }
}
