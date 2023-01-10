package Heap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 2, 6, 8};
        System.out.println(kSort(arr, arr.length, 3));
    }

    private static ArrayList<Integer> kSort(int[] arr, int n, int k) {
        ArrayList<Integer> ls = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return new ArrayList<>();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int minCount = Math.min(arr.length, k + 1);
        for (int i = 0; i < minCount; i++) {
            pq.add(arr[i]);
        }

//        int index = 0;
        for (int i = k + 1; i < n; i++) {
            ls.add(pq.peek());
            pq.poll();
            pq.add(arr[i]);
        }
        Iterator<Integer> itr = pq.iterator();
        while (itr.hasNext()) {
            ls.add(pq.peek());
            pq.poll();
        }
        return ls;
    }
}
