package Math;

// Question link -> https://leetcode.com/problems/find-missing-observations/

import java.util.Arrays;

public class FindMissingObservations {
    public static void main(String[] args) {
        int[] rolls = {1, 5, 6};
        System.out.println(Arrays.toString(missingRolls(rolls, 3, 4)));
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int[] ans = new int[n];
        int sum = 0;
        int length = n + rolls.length;
        for (int i = 0; i < rolls.length; i++) {
            sum += rolls[i];
        }
        int target = (mean * length) - sum;
        if (target < n || target > 6 * n) {
            return new int[]{};
        }
        if (n == 1) {
            return new int[]{target};
        }
        int rem = target % n;
        for (int i = 1; i <= n; i++) {
            ans[i - 1] = target / n;
            if (rem > 0) {
                ans[i - 1] += 1;
                rem--;
            }
        }
        return ans;
    }
}
