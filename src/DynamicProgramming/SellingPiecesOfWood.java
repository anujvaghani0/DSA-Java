package DynamicProgramming;  

public class SellingPiecesOfWood {
    public static void main(String[] args) {
        int[][] prices = {{1, 4, 2}, {2, 2, 7}, {2, 1, 3}};
        System.out.println(sellingWood(3, 5, prices));
    }


    public static long sellingWood(int m, int n, int[][] prices) {
        long[][] dp = new long[m + 1][n + 1];

        for (int[] price : prices) {
            dp[price[0]][price[1]] = price[2];
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {

//            all horizontal possible
                for (int k = 1; k <= i / 2; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - k][j] + dp[k][j]);
                }

//                all vertical possible
                for (int k = 1; k <= j / 2; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - k] + dp[i][k]);
                }
            }
        }
        return dp[m][n];
    }

}
