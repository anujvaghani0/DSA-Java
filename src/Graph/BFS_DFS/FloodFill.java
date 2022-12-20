package Graph.BFS_DFS;

// Question link -> https://leetcode.com/problems/flood-fill/

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] images = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        System.out.println(Arrays.deepToString(floodFill(images, 1, 1, 2)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                ans[i][j] = image[i][j];
            }
        }
        if (ans[sr][sc] != color) {
            dfs(ans, sr, sc, image[sr][sc], color);
        }
        return ans;
    }

    private static void dfs(int[][] grid, int row, int col, int start, int color) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length
                || grid[row][col] != start) {
            return;
        }

        grid[row][col] = color;
        dfs(grid, row + 1, col, start, color);
        dfs(grid, row - 1, col, start, color);
        dfs(grid, row, col + 1, start, color);
        dfs(grid, row, col - 1, start, color);
    }
}
