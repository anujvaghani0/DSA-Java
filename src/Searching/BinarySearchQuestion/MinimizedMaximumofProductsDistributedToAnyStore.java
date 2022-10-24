package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/

public class MinimizedMaximumofProductsDistributedToAnyStore {
    public static void main(String[] args) {
        int[] arr = {15, 10, 10};
        System.out.println(minimizedMaximum(7, arr));
    }

    public static int minimizedMaximum(int n, int[] quantities) {
        int low = 1;
        int high = 100000;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int sum = 0;
            for (int i = 0; i < quantities.length; i++) {
                sum += (quantities[i] + mid - 1) / mid;
            }
            if (sum > n) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
