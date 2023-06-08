package Matrix;

import java.util.HashMap;
import java.util.HashSet;

public class SumOfMatrixAfterQueries {
    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 1}, {0, 2, 2}, {0, 2, 3}, {1, 0, 4}};
        System.out.println(matrixSumQueries(3, matrix));
    }

    public static long matrixSumQueries(int n, int[][] queries) {
        HashSet<Integer> col = new HashSet<>();
        HashSet<Integer> row = new HashSet<>();
        long sum = 0L;
        for (int i = queries.length - 1; i >= 0; i--) {
            int type = queries[i][0];
            int index = queries[i][1];
            long val = queries[i][2];

            if (type == 0 && !row.contains(index)) {
                long product = val * (n - col.size());
                sum += product;
                row.add(index);
            } else if (type == 1 && !col.contains(index)) {
                long product = val * (n - row.size());
                sum += product;
                col.add(index);
            }
        }
        return sum;
    }
}
