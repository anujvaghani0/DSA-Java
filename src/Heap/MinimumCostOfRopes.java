package Heap;

import java.util.PriorityQueue;

public class MinimumCostOfRopes {
    public static void main(String[] args) {
        long[] arr = {4, 3, 2, 6};
        System.out.println(minCost(arr, arr.length));
    }

    public static long minCost(long[] arr, int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>((a, b) -> Math.toIntExact((a - b)));

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        long cost = 0;
        long ans = 0;
        while (pq.size() >= 2) {
            long first = pq.poll();
            long second = pq.poll();
            cost = first + second;
            ans += cost;
            pq.add(cost);
        }
        return ans;
    }
}
