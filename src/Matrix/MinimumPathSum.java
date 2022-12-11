package Matrix;

// Question link -> https://leetcode.com/problems/minimum-path-sum/

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    arr[i][j] = arr[i][j] + arr[i][j - 1];
                } else if (j == 0) {
                    arr[i][j] = arr[i][j] + arr[i - 1][j];
                } else {
                    arr[i][j] = Math.min(arr[i - 1][j] + arr[i][j],
                            arr[i][j - 1] + arr[i][j]);
                }
            }
        }
        return arr[n - 1][m - 1];
    }
}
