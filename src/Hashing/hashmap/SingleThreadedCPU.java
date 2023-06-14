package Hashing.hashmap; 

import java.util.Arrays;
import java.util.PriorityQueue;

public class SingleThreadedCPU {
    public static void main(String[] args) {
        int[][] tasks = {{1, 2}, {2, 4}, {3, 2}, {4, 1}};
        System.out.println(Arrays.toString(getOrder(tasks)));
    }

    public static int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        Task[] arr = new Task[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Task(i, tasks[i][0], tasks[i][1]);
        }

        Arrays.sort(arr, (a, b) -> {
            return Integer.compare(a.enqueueTime, b.enqueueTime);
        });

        PriorityQueue<Task> pq = new PriorityQueue<>((a, b) -> {
            if (a.processingTime == b.processingTime) {
                return Integer.compare(a.index, b.index);
            }
            return Integer.compare(a.processingTime, b.processingTime);
        });

        int[] ans = new int[n];
        int ansIndex = 0;
        int taskIndex = 0;
        int currentTime = 0;

        while (ansIndex < n) {
            while (taskIndex < n && arr[taskIndex].enqueueTime <= currentTime) {
                pq.add(arr[taskIndex++]);
            }

            if (pq.isEmpty()) {
                currentTime = arr[taskIndex].enqueueTime;
            } else {
                currentTime += pq.peek().processingTime;
                ans[ansIndex++] = pq.remove().index;
            }
        }
        return ans;
    }

    static class Task {
        int index;
        int enqueueTime;
        int processingTime;

        public Task(int index, int enqueueTime, int processingTime) {
            this.index = index;
            this.enqueueTime = enqueueTime;
            this.processingTime = processingTime;
        }
    }
}
