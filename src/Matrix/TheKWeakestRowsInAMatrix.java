package Matrix;

import java.util.Arrays;

public class TheKWeakestRowsInAMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int k = 3;
        System.out.println(Arrays.toString(kWeakestRows(matrix, k)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat.length;
        int[] temp = new int[m];
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            temp[i] = count;
        }

        int[] ans = new int[k];
        int min = Integer.MAX_VALUE;
        int z = 0;
        int index = 0;
        while (z < k) {
            for (int i = 0; i < temp.length; i++) {
                if (min > temp[i]) {
                    min = temp[i];
                    index = i;
                }
            }
            temp[index] = Integer.MAX_VALUE;
            ans[z] = index;
            index = 0;
            min = Integer.MAX_VALUE;
            z++;
        }
        return ans;
    }
}