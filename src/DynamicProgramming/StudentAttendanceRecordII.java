package DynamicProgramming;

import java.util.Arrays;

public class StudentAttendanceRecordII {
    public static void main(String[] args) {
        System.out.println(checkRecord(10101));
    }

    static int mod = (int) (1e9 + 7);

    public static int checkRecord(int n) {
        int late = 2;
        int Absents = 1;
        int[][][] dp = new int[n + 1][Absents + 1][late + 1];
        for (int[][] k : dp) {
            for (int[] l : k) {
                Arrays.fill(l, -1);
            }
        }
        int ans = solve(n, 0, 0, dp);
        System.out.println(ans);
        return ans % mod;
    }

    private static int solve(int days, int Absents, int late, int[][][] dp) {
        if (late == 3 || Absents == 2) {
            return 0;
        }

        if (days == 0) {
            return 1;
        }

        if (dp[days][Absents][late] != -1) {
            return dp[days][Absents][late];
        }

        long ans = 0;
        ans = solve(days - 1, Absents, late, dp) % mod;
        ans = (ans + (solve(days - 1, Absents + 1, 0, dp) % mod)) % mod;
//        if (late <= 2) {
        ans = (ans + (solve(days - 1, Absents, late + 1, dp) % mod)) % mod;
//        }

//        if (Absents <= 3) {

//        }
        return dp[days][Absents][late] = (int) ans;

    }
}
