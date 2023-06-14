package Hashing.hashmap; 

import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 1, 1, 1, 0};
        System.out.println(findMaxLength(nums));
    }

    public static int findMaxLength(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0) ? -1 : 1;
            if (map.containsKey(sum)) {
                ans = Math.max(ans, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return ans;
    }
}
