package DynamicProgramming;  

// Question link ->https://leetcode.com/problems/pizza-with-3n-slices/

public class PizzaWith3nSlices {
    public static void main(String[] args) {
        int[] slices = {8, 9, 8, 6, 1, 1};
        System.out.println(maxSizeSlices(slices));
    }

    public static int maxSizeSlices(int[] slices) {
        int n = slices.length;
        int[][] dp1 = new int[n][n];
        int[][] dp2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp1[i][j] = -1;
                dp2[i][j] = -1;
            }
        }
        int case1 = solve(slices, 0, n - 2, n / 3, dp1);
        int case2 = solve(slices, 1, n - 1, n / 3, dp2);
        return Math.max(case1, case2);
    }

    private static int solve(int[] slices, int index, int endIndex, int pick, int[][] dp) {
        if (pick == 0 || index > endIndex) {
            return 0;
        }

        if (dp[index][pick] != -1) {
            return dp[index][pick];
        }

        int take = slices[index] + solve(slices, index + 2, endIndex, pick - 1, dp);
        int notTake = solve(slices, index + 1, endIndex, pick, dp);
        int ans = Math.max(take, notTake);
        dp[index][pick] = ans;
        return dp[index][pick];
    }
}
