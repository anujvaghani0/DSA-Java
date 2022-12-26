package Searching.BinarySearchQuestion;

// Question link -> https://leetcode.com/problems/longest-subsequence-with-limited-sum/

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 1};
        int[] queries = {3, 10, 21};
        System.out.println(Arrays.toString(answerQueries(nums, queries)));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        int m = queries.length;
        Arrays.sort(nums);

//       prefix sum
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }

        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int q = queries[i];
            int low = 0;
            int high = n - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == q) {
                    ans[i] = mid + 1;
                    break;
                } else if (nums[mid] < q) {
                    ans[i] = mid + 1;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return ans;
    }
}
