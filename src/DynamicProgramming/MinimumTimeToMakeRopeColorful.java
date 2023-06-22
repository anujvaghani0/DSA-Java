package DynamicProgramming;  

// Question link -> https://leetcode.com/problems/minimum-time-to-make-rope-colorful/

public class MinimumTimeToMakeRopeColorful {
    public static void main(String[] args) {
        int[] time = {1, 2, 3, 4, 1};
        System.out.println(minCost("aabaa", time));
    }

    public static int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        return solve(colors, 0, neededTime, dp);
    }

    private static int solve(String colors, int index, int[] neededTime, int[] dp) {
        if (index == colors.length() - 1) {
            dp[index] = 0;
            return 0;
        }

        if (dp[index] != -1) {
            return dp[index];
        }

        if (colors.charAt(index) == colors.charAt(index + 1)) {
            if (neededTime[index + 1] < neededTime[index]) {
                int temp = neededTime[index + 1];
                neededTime[index + 1] = neededTime[index];
                neededTime[index] = temp;
            }
            dp[index] = Math.min(neededTime[index], neededTime[index + 1]) +
                    solve(colors, index + 1, neededTime, dp);
            return dp[index];
        } else {
            dp[index] = solve(colors, index + 1, neededTime, dp);
            return dp[index];
        }
    }
}
