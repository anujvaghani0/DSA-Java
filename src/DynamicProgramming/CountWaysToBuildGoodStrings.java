package DynamicProgramming;  

// Question link -> https://leetcode.com/problems/count-ways-to-build-good-strings/

import java.util.Arrays;

public class CountWaysToBuildGoodStrings {
    public static void main(String[] args) {
        System.out.println(countGoodStrings(2, 3, 1, 2));
    }

    static int mod = (int) (1e9 + 7);

    public static int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high + 1];
        Arrays.fill(dp, -1);
        int ans = 0;
        for (int i = low; i <= high; i++) {
            ans = (int) (((ans % mod) + (solve(i, dp, zero, one) % mod)) % mod);
        }
        return ans;
    }

    private static long solve(int target, int[] dp, int zero, int one) {
        if (target == 0) {
            return 1;
        }
        if (target < 0) {
            return 0;
        }
        if (dp[target] != -1) {
            return dp[target];
        }

//        adding zero
        int Zerosum = (int) solve(target - zero, dp, zero, one);

//        adding one
        int Onesum = (int) solve(target - one, dp, zero, one);
        dp[target] = (Zerosum + Onesum) % mod;
        return dp[target];
    }
}
