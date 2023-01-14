package DynamicProgramming.LongestIncreasingSubsequence;

import java.util.Arrays;

public class LongestStringChain {
    public static void main(String[] args) {
        String[] words = {"xbc", "pcxbcf", "xb", "cxbc", "pcxbc"};
        System.out.println(longestStrChain(words));
    }

    public static int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b)->a.length() - b.length());
        int n = words.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int max = 1;
        for (int i = 1; i < n; i++) {
            for (int prev = 0; prev <= i - 1; prev++) {
                if (compare(words[i], words[prev]) && 1 + dp[prev] > dp[i]) {
                    dp[i] = 1 + dp[prev];
                }
            }
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }

    private static boolean compare(String word1, String word2) {
        if (word1.length() != word2.length()+1) {
            return false;
        }

        int first = 0;
        int second = 0;

        while (first < word1.length()) {
            if (second < word2.length() && word1.charAt(first) == word2.charAt(second)) {
                first++;
                second++;
            } else {
                first++;
            }
        }
        if (first == word1.length() && second == word2.length()) {
            return true;
        }
        return false;
    }
}
