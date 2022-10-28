package Searching.BinarySearchQuestion;

//question link -> https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1

public class AllocateMinimumNumberOfPages {
    public static void main(String[] args) {
        int[] a = {12, 34, 67, 90};
        System.out.println(findPages(a, 4, 2));
    }

    public static int findPages(int[] A, int N, int M) {
        int min = Integer.MAX_VALUE;
        int total = 0;
        for (int i = 0; i < N; i++) {
            min = Math.min(A[i], min);
            total += A[i];
        }

        int start = min;
        int end = total;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(A, mid, M)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] a, int mid, int m) {
        int ans = 0;
        int count = 1;
        for (int i = 0; i < a.length; i++) {
//            if (count > m || a[i] > mid) {
//                return false;
//            }
            ans += a[i];
            if (ans > mid) {
                count++;
                ans = a[i];
            }
        }
        return count <= m;
    }
}