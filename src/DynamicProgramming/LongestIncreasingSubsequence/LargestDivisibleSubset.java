package DynamicProgramming.LongestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public static void main(String[] args) {

    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int N = nums.length;
        int[] dp = new int[N];
        int[] hash = new int[N];
        Arrays.fill(dp, 1);
        Arrays.fill(hash, 1);

        for (int i = 0; i < N; i++) {
            hash[i] = i;   // initializing with current index
            for (int prev = 0; prev <= i - 1; prev++) {
                if (nums[i] % nums[prev] == 0 && 1 + dp[prev] > dp[i]) {
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
        ls.add(nums[lastIndex]);

        while (hash[lastIndex] != lastIndex) {
            lastIndex = hash[lastIndex];
            ls.add(nums[lastIndex]);
        }

//        Reverse the final list
        ArrayList<Integer> Rls = new ArrayList<>();
        for (int i = ls.size() - 1; i >= 0; i--) {
            Rls.add(ls.get(i));
        }

        return Rls;
    }
}
