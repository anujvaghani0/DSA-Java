package Hashing.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int[] numbs = {1, 1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(frequencySort(numbs)));
    }

    public static int[] frequencySort(int[] nums) {
        int[] ans = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a._frequency == b._frequency ? b._num - a._num : a._frequency - b._frequency);
        for (int i : map.keySet()) {
            pq.add(new Pair(i, map.get(i)));
        }

        int i = 0;
        while (!pq.isEmpty()) {
            int n = pq.peek()._num;
            int f = pq.peek()._frequency;

            pq.remove();
            for (int j = 0; j < f; j++) {
                ans[i++] = n;
            }
        }
        return ans;
    }

    static class Pair {
        int _num;
        int _frequency;

        public Pair(int _num, int _frequency) {
            this._num = _num;
            this._frequency = _frequency;
        }
    }
}
