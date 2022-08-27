package Recursion.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 40;
        int ans = search(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    public static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return search(arr, target, mid + 1, e);
        }
        return search(arr, target, s, mid - 1);
    }
}
