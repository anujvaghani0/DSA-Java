package Graph.BFS_DFS; 

// Question link -> https://leetcode.com/problems/rotting-oranges/

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<pair> qu = new LinkedList<>();
        int[][] visited = new int[m][n];
        int fresh = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    qu.add(new pair(i, j, 0));
                    visited[i][j] = 2;
                } else {
                    visited[i][j] = 0;
                }

                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        int time = 0;
        int[] nrow = {-1, 0, +1, 0};
        int[] ncol = {0, 1, 0, -1};
        int count = 0;
        while (!qu.isEmpty()) {
            int r = qu.peek()._row;
            int c = qu.peek()._col;
            int t = qu.peek()._time;
            time = Math.max(time, t);
            qu.remove();

            for (int i = 0; i < 4; i++) {
                int row = r + nrow[i];
                int col = c + ncol[i];

                if (row >= 0 && col >= 0 && row < m && col < n &&
                        grid[row][col] == 1 && visited[row][col] == 0) {
                    qu.add(new pair(row, col, time + 1));
                    visited[row][col] = 2;
                    count++;
                }
            }
        }
        if (count != fresh) {
            return -1;
        }
        return time;
    }


    static class pair {
        int _row;
        int _col;
        int _time;

        public pair(int _row, int _col, int _time) {
            this._row = _row;
            this._col = _col;
            this._time = _time;
        }
    }
}
