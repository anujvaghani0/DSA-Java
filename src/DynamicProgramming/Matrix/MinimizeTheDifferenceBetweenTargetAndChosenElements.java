package DynamicProgramming.Matrix;

// Question link -> https://leetcode.com/problems/minimize-the-difference-between-target-and-chosen-elements/

import java.util.Arrays;

public class MinimizeTheDifferenceBetweenTargetAndChosenElements {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(minimizeTheDifference(matrix, 13));
    }

    public static int minimizeTheDifference(int[][] mat, int target) {
            int[][] dp = new int[mat.length][5001];
            for (int i = 0; i < mat.length; i++) {
                Arrays.fill(dp[i], -1);
            }

            return solve(mat, 0, 0, target, dp);
        }

        private static int solve(int[][] mat, int index, int values, int target, int[][] dp) {
            if (index == mat.length) {
                return Math.abs(values - target);
            }

            if (dp[index][values] != -1) {
                return dp[index][values];
            }

            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < mat[0].length; i++) {
                ans = Math.min(ans, solve(mat, index + 1,
                        values + mat[index][i], target, dp));
            }
//            System.out.println(Arrays.deepToString(dp));
            return dp[index][values] = ans;
        }
}
