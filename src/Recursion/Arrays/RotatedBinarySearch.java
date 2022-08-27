package Recursion.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] ans = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        System.out.println(search(ans, 6, 0, ans.length - 1));
    }

    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[s] <= arr[m]) {
            if (arr[s] <= target && arr[m] >= target) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }
        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m + 1, e);
        }
        return search(arr, target, s, m - 1);
    }
}
