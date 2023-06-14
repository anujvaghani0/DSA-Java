package DynamicProgramming; 

// Question link -> https://leetcode.com/problems/stone-game-vii/

import java.util.Arrays;

public class StoneGameVII {
    public static void main(String[] args) {
        int[] stones = {5, 3, 1, 4, 2};
        System.out.println(stoneGameVII(stones));
    }

    public static int stoneGameVII(int[] stones) {
        int n = stones.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += stones[i];
        }
        return solve(stones, sum, 0, 0, n - 1, dp);
    }

    private static int solve(int[] stones, int sum, int player, int start, int end, int[][] dp) {
        if (start == end) {
            return 0;
        }

        if (dp[start][end] != -1) {
            return dp[start][end];
        }

        int difference;
        if (player == 0) {   // Alex
            int left = sum - stones[start] + solve(stones, sum - stones[start], 1, start + 1, end, dp);
            int right = sum - stones[end] + solve(stones, sum - stones[end], 1, start, end - 1, dp);
            difference = Math.max(left, right);
        } else {  //bob
            int left = -(sum - stones[start]) + solve(stones, sum - stones[start], 0, start + 1, end, dp);
            int right = -(sum - stones[end]) + solve(stones, sum - stones[end], 0, start, end - 1, dp);
            difference = Math.min(left, right);
        }
        dp[start][end] = difference;
        return difference;
    }
}
