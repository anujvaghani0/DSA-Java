package DynamicProgramming;  

import java.util.Arrays;

public class MinimumCostForTickets {
    public static void main(String[] args) {
        int[] days = {2, 5};
        int[] costs = {1, 4, 15};
        System.out.println(mincostTickets(days, costs));
    }

    public static int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return solve(n, days, costs, 0, dp);
    }

    private static int solve(int n, int[] days, int[] costs, int index, int[] dp) {
        if (index >= n) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }

//        1 days for
        int options1 = costs[0] + solve(n, days, costs, index + 1, dp);

//        7 Days for
        int i;
        for (i = index; i < n && days[i] < days[index] + 7; i++) ;
        int options2 = costs[1] + solve(n, days, costs, i, dp);

//        30 Days for
        for (i = index; i < n && days[i] < days[index] + 30; i++) ;
        int options3 = costs[2] + solve(n, days, costs, i, dp);

        dp[index] = Math.min(options1, Math.min(options2, options3));
        return dp[index];
    }
}
