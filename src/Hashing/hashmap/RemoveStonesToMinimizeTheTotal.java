package Hashing.hashmap;

// Question link -> https://leetcode.com/problems/remove-stones-to-minimize-the-total/

import java.util.PriorityQueue;

public class RemoveStonesToMinimizeTheTotal {
    public static void main(String[] args) {
        int[] piles = {5, 4, 9};
        System.out.println(minStoneSum(piles, 2));
    }

    public static int minStoneSum(int[] piles, int k) {
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((m, n) -> n - m);
        for (int i = 0; i < piles.length; i++) {
            pq.add(piles[i]);
            sum += piles[i];
        }

        while (k > 0) {
            double temp = pq.peek();
            sum -= temp;
            pq.remove();
            temp = (double) Math.ceil(temp / 2);
            sum += temp;
            pq.add((int) temp);
            k--;
        }
        return sum;
    }
}
