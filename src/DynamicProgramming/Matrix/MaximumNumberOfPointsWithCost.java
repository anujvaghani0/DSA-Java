package DynamicProgramming.Matrix;

// Question link -> https://leetcode.com/problems/maximum-number-of-points-with-cost/

public class MaximumNumberOfPointsWithCost {
    public static void main(String[] args) {
        int[][] matrix = {{0, 3, 0, 4, 2}, {5, 2, 2, 4, 1}, {5, 0, 0, 5, 1}, {2, 0, 1, 0, 3}};
        System.out.println(maxPoints(matrix));
    }

    public static long maxPoints(int[][] points) {
        long[] dp = new long[points[0].length];

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                dp[j] += points[i][j];
            }

            for (int j = 1; j < dp.length; j++) {
                dp[j] = Math.max(dp[j], dp[j - 1] - 1);
            }

            for (int j = dp.length - 2; j >= 0; j--) {
                dp[j] = Math.max(dp[j], dp[j + 1] - 1);
            }
        }
        long ans = 0;
        for (int i = 0; i < dp.length; i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
