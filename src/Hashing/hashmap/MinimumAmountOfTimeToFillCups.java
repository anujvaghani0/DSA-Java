package Hashing.hashmap;

// Question link -> https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumAmountOfTimeToFillCups {
    public static void main(String[] args) {
        int[] amount = {1, 4, 2};
        System.out.println(fillCups(amount));
    }

    public static int fillCups(int[] amount) {
        int c = 0;
        int t1 = 0;
        int t2 = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < amount.length; i++) {
            pq.add(amount[i]);
        }
        while (pq.peek() != 0) {
            t1 = pq.remove();
            t2 = pq.remove();
            if (t2 != 0) {
                pq.add(t1 - 1);
                pq.add(t2 - 1);
                c++;
            } else {
                return c + t1;
            }
        }
        return c;
    }
}
