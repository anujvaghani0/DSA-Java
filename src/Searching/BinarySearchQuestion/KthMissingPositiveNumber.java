package Searching.BinarySearchQuestion;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        System.out.println(findKthPositive(arr, 2));
    }

    public static int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] - (mid + 1) >= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low + k;
    }
}
