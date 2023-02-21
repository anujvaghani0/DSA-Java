package Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;

public class TakeGiftsFromTheRichestPile {
    public static void main(String[] args) {
        int[] gifts = {25, 64, 9, 4, 100};
        System.out.println(pickGifts(gifts, 4));
    }

    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < gifts.length; i++) {
            pq.add(gifts[i]);
        }

        while (k > 0) {
            int temp = pq.remove();
            temp = (int) Math.sqrt(temp);
            pq.add(temp);
            k--;
        }

        long left = 0;
        while (!pq.isEmpty()) {
            left += pq.poll();
        }
        return left;
    }
}
