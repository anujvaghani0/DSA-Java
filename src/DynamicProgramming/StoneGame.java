package DynamicProgramming;

// Question link -> https://leetcode.com/problems/stone-game/

import java.util.Arrays;

public class StoneGame {
    public static void main(String[] args) {
        int[] piles = {5, 3, 4, 5};
        System.out.println(stoneGame(piles));
    }

    public static boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(piles, 0, 0, n - 1, dp) > 0;
    }

    private static int solve(int[] piles, int player, int start, int end, int[][] dp) {
        if (start > end) {
            return 0;
        }

        if (start == end) {
            return 0;
        }

        if (dp[start][end] != -1) {
            return dp[start][end];
        }

        int stones;
        if (player == 0) {   // Alex
            int left = piles[start] + solve(piles, 1, start + 1, end, dp);
            int right = piles[end] + solve(piles, 1, start, end - 1, dp);
            stones = Math.max(left, right);
        } else {  //bob
            int left = -piles[start] + solve(piles, 0, start + 1, end, dp);
            int right = -piles[end] + solve(piles, 0, start, end - 1, dp);
            stones = Math.max(left, right);
        }
        dp[start][end] = stones;
        return stones;
    }
}
