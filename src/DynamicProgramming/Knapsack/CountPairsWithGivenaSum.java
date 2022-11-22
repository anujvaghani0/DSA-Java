package DynamicProgramming.Knapsack;

public class CountPairsWithGivenaSum {
    public static void main(String[] args) {
    int[] arr={1, 1, 1, 1};
        System.out.println(getPairsCount(arr,arr.length,2));
    }

    public static int getPairsCount(int[] arr, int N, int sum) {
        int[][] dp = new int[N + 1][sum + 1];
        for (int i = 0; i <= sum; i++) {
            dp[0][i] = 0;
        }
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = (dp[i - 1][j - arr[i - 1]] + dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][sum];
    }
}
