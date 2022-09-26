package Matrix;

import java.util.Arrays;

public class DiagonalTraverse {
    public static void main(String[] args) {
    int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(findDiagonalOrder(matrix)));
    }

    public static int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 1) {
            return new int[]{0};
        }
        int row = 0;
        int col = 0;
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = mat[row][col];
            if ((row + col) % 2 == 0) {
                if (col == n - 1) {
                    row++;
                } else if (row == 0) {
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    col++;
                } else if (col == 0) {
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return ans;
    }
}
