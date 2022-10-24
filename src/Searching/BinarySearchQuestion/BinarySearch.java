package Searching.BinarySearchQuestion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 8, 9, 15, 45};
        int target = 45;
        int ans = Bsearch(arr, target);
        System.out.println(ans);
    }

    public static int Bsearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
