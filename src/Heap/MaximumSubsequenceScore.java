package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaximumSubsequenceScore {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 3, 2};
        int[] nums2 = {2, 1, 3, 4};
        System.out.println(maxScore(nums1, nums2, 3));
    }


    public static long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        Pair[] nums = new Pair[n];
        for (int i = 0; i < n; i++) {
            nums[i] = new Pair(nums1[i], nums2[i]);
        }
        Arrays.sort(nums, (a, b) -> b._second - a._second);
        Queue<Integer> pq = new PriorityQueue<>();
        long sum = 0;
        for (int i = 0; i < k; i++) {
            Pair pair = nums[i];
            pq.add(pair._first);
            sum += pair._first;
        }

        long result = sum * nums[k - 1]._second;
        for (int i = k; i < n; i++) {
            if (pq.size() == k) {
                sum -= pq.poll();
            }
            pq.add(nums[i]._first);
            sum += nums[i]._first;
            result = Math.max(result, sum * nums[i]._second);
        }
        return  result;
    }

    static class Pair {
        int _first;
        int _second;

        public Pair(int _first, int _second) {
            this._first = _first;
            this._second = _second;
        }
    }
}
