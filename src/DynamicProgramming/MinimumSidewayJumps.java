package DynamicProgramming;  

// Question link -> https://leetcode.com/problems/minimum-sideway-jumps/

public class MinimumSidewayJumps {
    public static void main(String[] args) {
        int[] obstacles = {0, 1, 2, 3, 0};
        System.out.println(minSideJumps(obstacles));
    }

    public static int minSideJumps(int[] obstacles) {
        int n = obstacles.length;
        int[][] dp = new int[4][n];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(obstacles, 2, 0, dp);
    }

    private static int solve(int[] obstacles, int currentLane, int currentPosition, int[][] dp) {
        int n = obstacles.length - 1;
        if (currentPosition == n) {
            return 0;
        }
//        DP conditions add
        if (dp[currentLane][currentPosition] != -1) {
            return dp[currentLane][currentPosition];
        }

        if (obstacles[currentPosition + 1] != currentLane) {
            return solve(obstacles, currentLane, currentPosition + 1, dp);
        } else {
//            sideways jump needed
            int ans = Integer.MAX_VALUE;
            for (int i = 1; i <= 3; i++) {
                if (currentLane != i && obstacles[currentPosition] != i) {
                    ans = Math.min(ans, 1 + solve(obstacles, i, currentPosition, dp));
                }
            }
            dp[currentLane][currentPosition] = ans;
            return dp[currentLane][currentPosition];
        }
    }
}
