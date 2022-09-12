package Matrix;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] ans = matrixReshape(matrix, 2, 4);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int row = 0;
        int col = 0;
        int[][] ans = new int[r][c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return ans;
    }
}
