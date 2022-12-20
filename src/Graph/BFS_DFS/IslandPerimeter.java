package Graph.BFS_DFS;

// Question link -> https://leetcode.com/problems/island-perimeter/

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                     return dfs(grid, i, j);
                }
            }
        }
        return -1;
    }

    private static int dfs(int[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length
                || grid[row][col] == 0) {
            return 1;
        }

        if (grid[row][col] == -1) {
            return 0;
        }

        grid[row][col] = -1;
        return dfs(grid, row + 1, col) + dfs(grid, row - 1, col) +
                dfs(grid, row, col + 1) + dfs(grid, row, col - 1);
    }
}
