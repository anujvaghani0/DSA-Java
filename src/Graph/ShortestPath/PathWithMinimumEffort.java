package Graph.ShortestPath;

// Question link -> https://leetcode.com/problems/path-with-minimum-effort/

import java.util.Arrays;
import java.util.PriorityQueue;

public class PathWithMinimumEffort {
    public static void main(String[] args) {
        int[][] grid = {{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        System.out.println(minimumEffortPath(grid));
    }

    public static int minimumEffortPath(int[][] heights) {
        PriorityQueue<pair> pq = new PriorityQueue<>((x, y) -> x.distance - y.distance);
        int n = heights.length;
        int m = heights[0].length;
        int[][] distance = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(distance[i], (int) (1e9));
        }

        distance[0][0] = 0;
        pq.add(new pair(0, 0, 0));
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        while (!pq.isEmpty()) {
            pair it = pq.peek();
            pq.remove();
            int diff = it.distance;
            int row = it.first;
            int col = it.second;

            if (row == n - 1 && col == m - 1) {
                return diff;
            }

            for (int i = 0; i < 4; i++) {
                int newr = row + dr[i];
                int newc = col + dc[i];

                if (newr >= 0 && newr < n && newc >= 0 && newc < m) {
                    int newEffort = Math.max(Math.abs(heights[row][col] - heights[newr][newc]), diff);
                    if (newEffort < distance[newr][newc]) {
                        distance[newr][newc] = newEffort;
                        pq.add(new pair(newEffort, newr, newc));
                    }
                }
            }
        }
        return 0;
    }

    static class pair {
        int distance;
        int first;
        int second;

        public pair(int distance, int first, int second) {
            this.distance = distance;
            this.first = first;
            this.second = second;
        }
    }
}
