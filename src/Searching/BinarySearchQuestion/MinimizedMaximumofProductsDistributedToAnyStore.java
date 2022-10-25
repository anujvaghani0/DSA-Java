package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/

public class MinimizedMaximumofProductsDistributedToAnyStore {
    public static void main(String[] args) {
        int[] arr = {15, 10, 10};
        System.out.println(minimizedMaximum(7, arr));
    }

    public static int minimizedMaximum(int n, int[] quantities) {
        int max = 0;
        for (int i = 0; i < quantities.length; i++) {
            max = Math.max(max, quantities[i]);
        }

        int start = 0;
        int end = max;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(quantities, mid, n)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] quantities, int mid, int n) {
        int count = 0;
        for (int i = 0; i < quantities.length; i++) {
            count += Math.ceil(quantities[i] / (mid * 1.0));
        }
        return count <= n;
    }
}
