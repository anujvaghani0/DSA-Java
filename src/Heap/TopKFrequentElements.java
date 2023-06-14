package Heap;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {4, 4, 4, 4, 1, 1, 1, 2, 2, 3};
        System.out.println(Arrays.toString(topKFrequent(nums, 3)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> map.get(y).compareTo(map.get(x)));
        pq.addAll(map.keySet());

        int[] ans = new int[k];
        int index = 0;
        while (!pq.isEmpty() && index < k) {
            ans[index++] = pq.remove();
        }
        return  ans;
    }
}
