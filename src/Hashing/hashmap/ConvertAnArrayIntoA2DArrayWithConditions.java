package Hashing.hashmap; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConvertAnArrayIntoA2DArrayWithConditions {
    public static void main(String[] args) {
        int[] temp = {1, 3, 4, 1, 2, 3, 1};
        System.out.println(findMatrix(temp));
    }

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        while (map.size() > 0) {
            List<Integer> disInt = new ArrayList<>(map.keySet());
            List<Integer> toDelete = new ArrayList<>();

            for (int key : map.keySet()) {
                map.put(key, map.get(key) - 1);
                if (map.get(key) == 0) {
                    toDelete.add(key);
                }
            }

            for (int num : toDelete) {
                map.remove(num);
            }

            ans.add(disInt);
        }
        return ans;
    }
}
