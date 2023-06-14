package DynamicProgramming; 

import java.util.Arrays;

public class MaximumNumberOfMovesInAGrid {
    public static void main(String[] args) {

    }

    public static int maxMoves(int[][] grid) {
        int max = 0;
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        for (int i = 0; i < m; i++) {
            max = Math.max(max, dfs(i, 0, m, n, dp, Integer.MIN_VALUE, grid));
        }

        return max - 1;
    }

    private static int dfs(int i, int j, int m, int n, int[][] dp, int previous, int[][] grid) {
        if (i < 0 || i >= m || j >= n || grid[i][j] <= previous) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int topRight = 1 + dfs(i - 1, j + 1, m, n, dp, grid[i][j], grid);
        int right = 1 + dfs(i, j + 1, m, n, dp, grid[i][j], grid);
        int downRight = 1 + dfs(i + 1, j + 1, m, n, dp, grid[i][j], grid);

        return dp[i][j] = Math.max(right, Math.max(topRight, downRight));
    }
}
