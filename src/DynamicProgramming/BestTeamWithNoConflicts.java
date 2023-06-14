package DynamicProgramming; 

import java.util.Arrays;

public class BestTeamWithNoConflicts {
    public static void main(String[] args) {
        int[] score = {1, 2, 3, 5};
        int[] ages = {8, 9, 10, 1};
        System.out.println(bestTeamScore(score, ages));
    }

    public static int bestTeamScore(int[] scores, int[] ages) {
        int n = ages.length;
        int[][] ageScorePair = new int[n][2];
        for (int i = 0; i < n; i++) {
            ageScorePair[i][0] = ages[i];
            ageScorePair[i][1] = scores[i];
        }

//        sort in ascending order of age and then by score
        Arrays.sort(ageScorePair, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        int[] dp = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = search(dp, ageScorePair, i) + ageScorePair[i][1];
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    private static int search(int[] dp, int[][] ageScorePair, int i) {
        int max = 0;
        for (int j = 0; j < i; j++) {
            if (dp[j] > max && ageScorePair[j][1] <= ageScorePair[i][1]) {
                max = dp[j];
            }
        }
        return max;
    }
}
