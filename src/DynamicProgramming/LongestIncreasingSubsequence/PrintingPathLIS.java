package DynamicProgramming.LongestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintingPathLIS {
    public static void main(String[] args) {
        int[] arr = {5, 4, 11, 1, 16, 8};
        System.out.println(longestIncreasingSubsequence(arr.length, arr));
    }

    public static ArrayList<Integer> longestIncreasingSubsequence(int N, int[] arr) {
        int[] dp = new int[N];
        int[] hash = new int[N];
        Arrays.fill(dp, 1);
        Arrays.fill(hash, 1);

        for (int i = 0; i < N; i++) {
            hash[i] = i;   // initializing with current index
            for (int prev = 0; prev <= i - 1; prev++) {
                if (arr[prev] < arr[i] && 1 + dp[prev] > dp[i]) {
                    dp[i] = 1 + dp[prev];
                    hash[i] = prev;
                }
            }
        }

        int ans = -1;
        int lastIndex = -1;
        for (int i = 0; i < N; i++) {
            if (dp[i] > ans) {
                ans = dp[i];
                lastIndex = i;
            }
        }


        List<Integer> ls = new ArrayList<>();
        ls.add(arr[lastIndex]);

        while (hash[lastIndex] != lastIndex) {
            lastIndex = hash[lastIndex];
            ls.add(arr[lastIndex]);
        }

//        Reverse the final list
        ArrayList<Integer> Rls = new ArrayList<>();
        for (int i = ls.size() - 1; i >= 0; i--) {
            Rls.add(ls.get(i));
        }

        return Rls;
    }
}
