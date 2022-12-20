package Graph.BFS_DFS;

// Question link -> https://practice.geeksforgeeks.org/problems/distance-of-nearest-cell-having-1-1587115620/1

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DistanceOfNearestCellHaving1 {
    public static void main(String[] args) {
        int[][] grid = {{0, 1, 1, 0}, {1, 1, 0, 0}, {0, 0, 1, 1}};
        System.out.println(Arrays.deepToString(nearest(grid)));
    }

    public static int[][] nearest(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] visited = new int[n][m];
        int[][] distances = new int[n][m];
        Queue<pair> qu = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    qu.add(new pair(i, j, 0));
                    visited[i][j] = 1;
                }
            }
        }

        int[] drow = {-1, 0, +1, 0};
        int[] dcol = {0, +1, 0, -1};

        while (!qu.isEmpty()) {
            int nrow = qu.peek()._first;
            int ncol = qu.peek()._second;
            int step = qu.peek()._step;
            qu.remove();
            distances[nrow][ncol] = step;
            for (int i = 0; i < 4; i++) {
                int row = nrow + drow[i];
                int col = ncol + dcol[i];

                if (col >= 0 && row >= 0 && row < n && col < m && visited[row][col] == 0) {
                    visited[row][col] = 1;
                    qu.add(new pair(row, col, step + 1));
                }
            }
        }

        return distances;
    }

    static class pair {
        int _first;
        int _second;
        int _step;

        public pair(int _first, int _second, int _step) {
            this._first = _first;
            this._second = _second;
            this._step = _step;
        }
    }
}
