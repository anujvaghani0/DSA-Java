package Graph.ShortestPath; 

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceInABinaryMaze {
    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0},
                {1, 0, 0, 1}};
        int[] source = {0, 1};
        int[] destination = {2, 2};
        System.out.println(shortestPath(grid, source, destination));
    }

    public static int shortestPath(int[][] grid, int[] source, int[] destination) {
        if (source[0] == destination[0] && source[1] == destination[1]) {
            return 0;
        }

        Queue<pair> qu = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] distance = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(distance[i], (int) 1e9);
        }

        distance[source[0]][source[1]] = 0;
        qu.add(new pair(0, source[0], source[1]));

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        while (!qu.isEmpty()) {
            pair p = qu.peek();
            qu.remove();
            int dit = p.distance;
            int row = p.first;
            int col = p.second;

            for (int i = 0; i < 4; i++) {
                int newr = row + dr[i];
                int newc = col + dc[i];

                if (newr >= 0 && newr < n && newc >= 0 && newc < m &&
                        grid[newr][newc] == 1 && dit + 1 < distance[newr][newc]) {
                    distance[newr][newc] = 1 + dit;
                    if (newr == destination[0] && newc == destination[1]) {
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
