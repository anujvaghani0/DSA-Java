package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/plates-between-candles/

import java.util.Arrays;

public class PlatesBetweenCandles {
    public static void main(String[] args) {
        int[][] queries = {{2, 5}, {5, 9}};
        System.out.println(Arrays.toString(platesBetweenCandles("**|**|***|", queries)));
    }

    public static int[] platesBetweenCandles(String s, int[][] queries) {
        int[] prefixsum = new int[s.length() + 1];
        int[] next = new int[s.length() + 1], prev = new int[s.length() + 1];
        Arrays.fill(next, Integer.MAX_VALUE);
        int[] res = new int[queries.length];
        for (int i = 0; i < s.length(); ++i) {
            prefixsum[i + 1] = prefixsum[i] + (s.charAt(i) == '|' ? 1 : 0);
            prev[i + 1] = s.charAt(i) == '|' ? i : prev[i];
        }
        for (int i = s.length() - 1; i >= 0; --i)
            next[i] = s.charAt(i) == '|' ? i : next[i + 1];
        for (int j = 0; j < queries.length; ++j) {
            int l = next[queries[j][0]], r = prev[queries[j][1] + 1];
            res[j] = l < r ? r - l - (prefixsum[r] - prefixsum[l]) : 0;
        }
        return res;
    }
}
