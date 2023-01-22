package Matrix;

import java.util.Arrays;

public class IncrementSubmatricesByOne {
    public static void main(String[] args) {
        int[][] q = {{1, 1, 2, 2}, {0, 0, 1, 1}};
        System.out.println(Arrays.deepToString(rangeAddQueries(3, q)));
    }

    public static int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] matrix = new int[n][n];
        for (int[] query : queries) {
            int row1 = query[0], col1 = query[1], row2 = query[2], col2 = query[3];
            for (int i = row1; i <= row2; i++) {
                for (int j = col1; j <= col2; j++) {
                    matrix[i][j]++;
                }
            }
        }
        return matrix;
    }
}
