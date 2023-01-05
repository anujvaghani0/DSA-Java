package Graph.BFS_DFS;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();
        int row = heights.length;
        int col = heights[0].length;
        boolean[][] Atlantic = new boolean[row][col];
        boolean[][] Pacific = new boolean[row][col];

        for (int i = 0; i < col; i++) {
            dfs(0, i, row, col, Atlantic, heights[0][i], heights);
            dfs(i, col - 1, row, col, Pacific, heights[row - 1][i], heights);
        }



        return ans;
    }

    private static void dfs(int i, int j, int row, int col, boolean[][] visited, int prev, int[][] heights) {
    return;
    }
}
