package DynamicProgramming;  

// Question link -> https://leetcode.com/problems/reducing-dishes/

import java.util.Arrays;

public class ReducingDishes {
    public static void main(String[] args) {
    int[] satisfaction={4,0,-1};
        System.out.println(maxSatisfaction(satisfaction));
    }

    public static int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(satisfaction, 0, 0, dp);
    }

    private static int solve(int[] satisfaction, int index, int time, int[][] dp) {
        if (index == satisfaction.length) {
            return 0;
        }

        if (dp[index][time] != -1) {
            return dp[index][time];
        }

        int include = satisfaction[index] * (time + 1) + solve(satisfaction, index + 1, time + 1, dp);
        int exclude = solve(satisfaction, index + 1, time, dp);
        dp[index][time] = Math.max(include, exclude);
        return dp[index][time];
    }
}
