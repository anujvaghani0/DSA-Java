package Heap;

import java.util.PriorityQueue;

public class MiceandCheese {
    public static void main(String[] args) {
        int[] reward1 = {1, 1, 3, 4};
        int[] reward2 = {4, 4, 1, 1};
        System.out.println(miceAndCheese(reward1, reward2,2));
    }

    public static int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int n = reward1.length;
        int ans = 0;
        for (int cheese : reward2) {
            ans += cheese;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.offer(reward1[i] - reward2[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        while (pq.size() > 0) {
            ans += pq.poll();
        }
        return ans;
    }
}
