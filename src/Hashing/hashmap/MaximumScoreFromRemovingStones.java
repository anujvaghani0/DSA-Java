package Hashing.hashmap;

import java.util.PriorityQueue;

public class MaximumScoreFromRemovingStones {
    public static void main(String[] args) {
        System.out.println(maximumScore(1, 8, 8));
    }

    public static int maximumScore(int a, int b, int c) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((m, n) -> n - m);
        pq.add(a);
        pq.add(b);
        pq.add(c);

        while (pq.size() > 1) {
            int max1 = pq.remove();
            int max2 = pq.remove();
            max1--;
            max2--;
            if (max1 > 0) {
                pq.add(max1);
            }
            if (max2 > 0) {
                pq.add(max2);
            }
            count++;
        }
        return count;
    }
}
