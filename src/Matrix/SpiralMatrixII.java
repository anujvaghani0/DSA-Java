package Matrix;

//question link -> https://leetcode.com/problems/spiral-matrix-ii/

import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }

    public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        if (n == 0) {
            return ans;
        }

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int number = 1;
        int dir = 0;

        while (top <= bottom && left <= right) {
            switch (dir) {
//              LEFT
                case 0 -> {
                    for (int i = left; i <= right; i++) {
                        ans[top][i] = number++;
                    }
                    top++;
                }

//              DOWN
                case 1 -> {
                    for (int i = top; i <= bottom; i++) {
                        ans[i][right] = number++;
                    }
                    right--;
                }

//               RIGHT
                case 2 -> {
                    for (int i = right; i >= left; i--) {
                        ans[bottom][i] = number++;
                    }
                    bottom--;
                }

//              UP
                case 3 -> {
                    for (int i = bottom; i >= top; i--) {
                        ans[i][left] = number++;
                    }
                    left++;
                }
            }
            dir = (dir + 1) % 4;
        }
        return ans;
    }
}
