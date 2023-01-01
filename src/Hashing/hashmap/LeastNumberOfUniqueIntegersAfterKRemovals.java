package Hashing.hashmap;

// Question link -> https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeastNumberOfUniqueIntegersAfterKRemovals {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 1, 3, 3, 2};
        System.out.println(findLeastNumOfUniqueInts(arr, 3));
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
//        insert all numbers in the hashmap
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

//        Set the priority to the numbers like less count to give more priority and more count to give a less priority
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }

        while (k > 0) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            k = k - entry.getValue();
        }

//        if k is negative position then return priority Queue itself return do not need to do extra think
        return k < 0 ? pq.size() + 1 : pq.size();
    }
}
