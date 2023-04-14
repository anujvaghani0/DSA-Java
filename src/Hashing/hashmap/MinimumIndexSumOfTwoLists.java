package Hashing.hashmap;

import java.util.*;

public class MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        String[] l1 = {"happy", "sad", "good"};
        String[] l2 = {"sad", "happy", "good"};
        System.out.println(Arrays.toString(findRestaurant(l1, l2)));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) {
            return findRestaurant(list2, list1);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> ans = new ArrayList<>();
        int minimumSum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            String temp = list2[i];
            if (map.containsKey(temp)) {
                int sum = map.get(temp) + i;
                if (sum < minimumSum) {
                    ans = new ArrayList<>();
                    minimumSum = sum;
                }

                if (sum == minimumSum) {
                    ans.add(temp);
                }
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
