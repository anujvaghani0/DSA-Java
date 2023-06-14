package Graph.ShortestPath; 

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {
    public static void main(String[] args) {
//        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        int[][] grid = {{0}};
        System.out.println(shortestPathBinaryMatrix(grid));
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] != 0 || grid[grid.length - 1][grid[0].length - 1] != 0) {
            return -1;
        }
        if (grid.length == 1) {
            return 1;
        }
        Queue<pair> qu = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] distance = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(distance[i], (int) 1e9);
        }

        distance[0][0] = 0;
        qu.add(new pair(1, 0, 0));

        int[] dr = {-1, 0, 1, 0, 1, -1, 1, -1};
        int[] dc = {0, 1, 0, -1, 1, -1, -1, 1};
        while (!qu.isEmpty()) {
            pair p = qu.peek();
            qu.remove();
            int dit = p.distance;
            int row = p.first;
            int col = p.second;

            for (int i = 0; i < 8; i++) {
                int newr = row + dr[i];
                int newc = col + dc[i];

                if (newr >= 0 && newr < n && newc >= 0 && newc < m &&
                        grid[newr][newc] == 0 && dit + 1 < distance[newr][newc]) {
                    distance[newr][newc] = 1 + dit;
                    if (newr == n - 1 && newc == m - 1) {
                        return dit + 1;
                    }
                    qu.add(new pair(1 + dit, newr, newc));
                }

            }
        }
        return -1;
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
