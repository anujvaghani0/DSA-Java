package DynamicProgramming;

// Question link -> https://practice.geeksforgeeks.org/problems/painting-the-fence3727/1

import java.util.Arrays;

public class PaintingTheFence {
    public static void main(String[] args) {
        System.out.println(countWays(79, 53));
    }

    public static long countWays(int n, int k) {
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, k, dp);
    }

    private static long solve(int n, int k, long[] dp) {
        if (n == 1) {
            return k;
        }

        if (n == 2) {
            return k + (long) k * (k - 1);
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        long same = solve(n - 2, k, dp) * (k - 1);
        long diff = solve(n - 1, k, dp) * (k - 1);
        dp[n] = (same + diff) % 1000000007;
        return dp[n];
    }
}
