package Array;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
     int[][] ans=new int[arr.length][arr.length];
        setZeroes(ans);
        System.out.println(Arrays.toString(ans));
    }


    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < m; k++) {
                        if (matrix[i][k] != 0) {
                            matrix[i][k] = -9999;
                        }
                    }
                }
            }
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < n; k++) {
                        if (matrix[k][j] != 0) {
                            matrix[k][j] = -9999;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -9999) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
