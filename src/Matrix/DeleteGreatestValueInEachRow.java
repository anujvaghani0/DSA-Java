package Matrix;

import java.util.Arrays;

public class DeleteGreatestValueInEachRow {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 4}, {3, 3, 1}};
        System.out.println(deleteGreatestValue(arr));
    }

    public static int deleteGreatestValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }

        int ans = 0;
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(grid[j][i], max);
            }
            ans += max;
        }
        return ans;
    }
}
