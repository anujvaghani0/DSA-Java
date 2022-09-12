package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] ans = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> ans1 = spiralOrder(ans);
        System.out.println(ans1);
    }


    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        List<Integer> ans = new ArrayList<>();
        if (m == 0) {
            return ans;
        }
        int n = matrix[0].length;
        int rowstart = 0;
        int rowend = m;
        int colstart = 0;
        int colend = n;
        int k;
        while (rowstart < rowend && colstart < colend) {
            for (k = colstart; k < colend; k++) {
                ans.add(matrix[rowstart][k]);
            }
            rowstart += 1;
            for (k = rowstart; k < rowend; k++) {
                ans.add(matrix[k][colend - 1]);
            }
            colend -= 1;
            if (rowstart < rowend) {
                for (k = colend - 1; k >= colstart; k--) {
                    ans.add(matrix[rowend - 1][k]);
                }
                rowend -= 1;
            }
            if (colstart < colend) {
                for (k = rowend - 1; k >= rowstart; k--) {
                    ans.add(matrix[k][colstart]);
                }
                colstart += 1;
            }
        }
        return ans;
    }
}
