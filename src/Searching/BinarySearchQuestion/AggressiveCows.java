package Searching.BinarySearchQuestion;

//question link -> https://practice.geeksforgeeks.org/problems/aggressive-cows/1

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] ans = {3, 86, 38, 56, 97, 61, 39};
        System.out.println(solve(7, 7, ans));
    }

    public static int solve(int n, int k, int[] v) {
        Arrays.sort(v);
        int start = 1;
        int end = v[n - 1] - v[0];
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(v, mid, k)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] v, int mid, int k) {
        int count = 1;
        int previous = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] - previous >= mid) {
                count++;
                previous = v[i];
            }
        }
        return count >= k;
    }
}