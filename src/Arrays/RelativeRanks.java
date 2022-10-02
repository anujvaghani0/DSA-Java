package Arrays;

import java.util.Arrays;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] score = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }

    public static String[] findRelativeRanks(int[] score) {
        int[][] pair = new int[score.length][2];
        for (int i = 0; i < score.length; i++) {
            pair[i][0] = score[i];
            pair[i][1] = i;
        }
        Arrays.sort(pair, (a, b) -> (b[0] - a[0]));
        String[] ans = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            if (i == 0) {
                ans[pair[i][1]] = "Gold Medal";
            } else if (i == 1) {
                ans[pair[i][1]] = "Silver Medal";
            } else if (i == 2) {
                ans[pair[i][1]] = "Bronze Medal";
            } else {
                ans[pair[i][1]] = (i + 1) + "";
            }
        }
        return ans;
    }
}
