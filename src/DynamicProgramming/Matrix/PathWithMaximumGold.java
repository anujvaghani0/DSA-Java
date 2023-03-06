package DynamicProgramming.Matrix;

import java.util.Arrays;

public class PathWithMaximumGold {
    public static void main(String[] args) {
    int[][] grid={{0,6,0},{5,8,7},{0,9,0}};
        System.out.println(getMaximumGold(grid));
    }

    public static int getMaximumGold(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];

        for (int j = grid[0].length - 1; j >= 0; j--) {
            for (int i = grid.length - 1; i >= 0; i--) {
                if (j == grid[0].length - 1) {
                    dp[i][j] = grid[i][j];
                } else if (i == 0) {
                    dp[i][j] = grid[i][j] + Math.max(grid[i][j + 1], grid[i + 1][j + 1]);
                } else if (i == grid.length - 1) {
                    dp[i][j] = grid[i][j] + Math.max(grid[i][j + 1], grid[i - 1][j + 1]);
                } else {
                    dp[i][j] = grid[i][j] + Math.max(grid[i][j + 1], Math.max(grid[i + 1][j + 1], grid[i - 1][j + 1]));
                }
            }
        }

        System.out.println(Arrays.deepToString(dp));
        int max = dp[0][0];
        for (int i = 1; i < dp.length; i++) {
            if (dp[i][0] > max) {
                max = dp[i][0];
            }
        }
        return max;
    }
}
