package DynamicProgramming; 

// Question link -> https://leetcode.com/problems/minimum-score-triangulation-of-polygon/

public class MinimumScoreTriangulationOfPolygon {
    public static void main(String[] args) {
        int[] ans = {1, 2, 3, 4, 5, 6};
        System.out.println(minScoreTriangulation(ans));
    }

    public static int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(values, 0, n - 1, dp);
    }

    private static int solve(int[] values, int i, int j, int[][] dp) {
        if (i + 1 == j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {
            ans = Math.min(ans, values[i] * values[j] * values[k] + solve(values, i, k, dp) +
                    solve(values, k, j, dp));
        }
        dp[i][j] = ans;
        return dp[i][j];
    }
}
