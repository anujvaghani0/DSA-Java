package Heap;

import java.util.*;

public class FindKClosestElements {
    public static void main(String[] args) {
        int[] arr = {5, 4, 9, 3, 8, 7, 6, 2};
        System.out.println(findClosestElements(arr, 4, 3));
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(new Pair(i, Math.abs(arr[i] - x)));
            if (pq.size() > k) {
                pq.remove();
            }
        }

        List<Integer> ls = new ArrayList<>();
        while (!pq.isEmpty()) {
            ls.add(arr[pq.remove().idx]);
        }

        Collections.sort(ls);
        return ls;
    }

    private static class Pair implements Comparable<Pair> {
        int idx;
        int diff;

        Pair(int idx, int diff) {
            this.idx = idx;
            this.diff = diff;
        }

        public int compareTo(Pair other) {
            if (this.diff == other.diff) return other.idx - this.idx;
            else return other.diff - this.diff;
        }
    }
}
