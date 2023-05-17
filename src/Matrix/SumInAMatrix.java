package Matrix;

import java.util.Arrays;

public class SumInAMatrix {
    public static void main(String[] args) {
        int[][] temp = {{7, 2, 1}, {6, 4, 2}, {6, 5, 3}, {3, 2, 1}};
        System.out.println(matrixSum(temp));

    }

    public static int matrixSum(int[][] nums) {
        int sum = 0;
        int m = nums.length;
        int n = nums[0].length;

        for (int i = 0; i < m; i++) {
            Arrays.sort(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < m; j++) {
                max = Math.max(max, nums[j][i]);
            }
            sum += max;
        }
        return sum;
    }
}
