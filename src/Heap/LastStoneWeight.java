package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            pq.add(stones[i]);
        }

//       check how many stones collied
        while (pq.size() > 1) {
            int firstStone = pq.poll();
            int secondStone = pq.poll();

            if (firstStone != secondStone) {
                pq.add(firstStone - secondStone);
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}
