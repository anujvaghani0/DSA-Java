package Hashing.hashmap;

import java.util.PriorityQueue;

public class MinimumOperationsToHalveArraySum {
    public static void main(String[] args) {
        int[] numbs = {18, 22, 62, 61, 1, 88, 17, 98, 38, 32, 51, 57, 7, 29,
                40, 61, 62, 13, 89, 41, 73, 85, 88, 60, 59, 76, 71, 76, 76,
                41, 29, 43, 19, 9, 79};
        System.out.println(halveArray(numbs));
    }

    public static int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>((m, n) -> Double.compare(n, m));
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            pq.add((double) nums[i]);
        }
        double half = sum / 2;
        int count = 0;
        while (sum > half) {
            double temp = pq.peek();
            pq.remove();
            temp /= 2;
            sum -= temp;
            pq.add(temp);
            count++;
        }
        return count;
    }
}
