package DynamicProgramming;

// Question link -> https://leetcode.com/problems/domino-and-tromino-tiling/

public class DominoAndTrominoTiling {
    public static void main(String[] args) {
        System.out.println(numTilings(3));
    }

    static long mode = (long) (1e9 + 7);

    public static int numTilings(int n) {
        int[] dp = new int[n + 4];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        for (int i = 4; i <= n; i++) {
            dp[i] = (int) (((2 * dp[i - 1]) % mode) + dp[i - 3]);
            dp[i] %= mode;
        }
        return dp[n];
    }
}
