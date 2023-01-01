package Backtracking;

// Question link -> https://leetcode.com/problems/unique-paths-iii/

public class UniquePathsIII {
    public static void main(String[] args) {
        int[][] grid = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}};
//        int[][] grid = {{0, 1},{2, 0}};
        System.out.println(uniquePathsIII(grid));
    }

    public static int uniquePathsIII(int[][] grid) {
        int zero = 0;
        int startX = 0;
        int startY = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    zero++;
                } else if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
            }
        }
        return dfs(grid, startX, startY, zero);
    }

    private static int dfs(int[][] grid, int x, int y, int zero) {
        if (x < 0 || x >= grid.length || y >= grid[0].length || y < 0 || grid[x][y] == -1) {
            return 0;
        }

        if (grid[x][y] == 2) {
            return zero == -1 ? 1 : 0;
        }

        grid[x][y] = -1;
        zero--;

//        The dfs call then check path it exits or not
        int up = dfs(grid, x - 1, y, zero);
        int down = dfs(grid, x + 1, y, zero);
        int left = dfs(grid, x, y - 1, zero);
        int right = dfs(grid, x, y + 1, zero);

//        backtracking the grid with put original values put zero
        grid[x][y] = 0;
        zero++;
        int totalPath = up + down + left + right;
        return totalPath;
    }
}
