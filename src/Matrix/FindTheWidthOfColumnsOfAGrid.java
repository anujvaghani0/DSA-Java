package Matrix;

import java.util.Arrays;

public class FindTheWidthOfColumnsOfAGrid {
    public static void main(String[] args) {
        int[][] grid = {{-15, 1, 3}, {15, 7, 12}, {5, 6, -2}};
        System.out.println(Arrays.toString(findColumnWidth(grid)));
    }

    public static int[] findColumnWidth(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < m; j++) {
                max = Math.max(max, String.valueOf(grid[j][i]).length());
            }
            ans[i] = max;
        }
        return ans;
    }
}
