package DynamicProgramming;  

public class ChampagneTower {
    public static void main(String[] args) {
        System.out.println(champagneTower(3,2,2));
    }

    public static double champagneTower(int poured, int query_row, int query_glass) {
//        if the poured is null return zero
        if (poured == 0) {
            return 0;
        }

        double[][] dp = new double[query_row + 1][query_glass + 2];
        dp[0][0] = poured;
        for (int i = 0; i < query_row; i++) {
            for (int j = 0; j <= query_glass; j++) {
                if (dp[i][j] > 1.0) {
                    double spare = dp[i][j] - 1;
                    spare /= 2;
                    dp[i][j] = 1;
                    dp[i + 1][j] += spare;
                    dp[i + 1][j + 1] += spare;
                }
            }
        }
        return Math.min(dp[query_row][query_glass], 1.0);
    }
}
