package Graph.BFS_DFS;

// Question link -> https://practice.geeksforgeeks.org/problems/number-of-distinct-islands/1

import java.util.ArrayList;
import java.util.HashSet;

public class NumberOfDistinctIsland {
    public static void main(String[] args) {
        int[][] grid = {{1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1}};
        System.out.println(countDistinctIslands(grid));
    }

    public static int countDistinctIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        HashSet<ArrayList<String>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == 0 && grid[i][j] == 1) {
                    ArrayList<String> temp = new ArrayList<>();
                    dfs(i, j, visited, grid, temp, i, j);
                    st.add(temp);
                }
            }
        }
        return st.size();
    }

    private static void dfs(int row, int col, int[][] visited, int[][] grid, ArrayList<String> temp, int row0, int col0) {
        visited[row][col] = 1;
        temp.add(convert(row - row0, col - col0));
        int n = grid.length;
        int m = grid[0].length;
        int[] drow = {-1, 0, +1, 0};
        int[] dcol = {0, -1, 0, +1};
        for (int i = 0; i < 4; i++) {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                    && visited[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                dfs(nrow, ncol, visited, grid, temp, row0, col0);
            }
        }
    }

    private static String convert(int a, int b) {
        return Integer.toString(a) + " " + Integer.toString(b);
    }
}
