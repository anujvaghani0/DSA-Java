package Searching.BinarySearchQuestion;

public class SumOfMutatedArrayClosestToTarget {
    public static void main(String[] args) {
        int[] arr = {4, 9, 3};
        System.out.println(findBestValue(arr, 10));
    }

    public static int findBestValue(int[] arr, int target) {
        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }

        int low = 0;
        int higher = sum;
        while (low < higher) {
            int mid = low + (higher - low) / 2;
            if (check(arr, mid, target) <= check(arr, mid + 1, target)) {
                higher = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private static int check(int[] arr, int mid, int target) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (mid < arr[i]) {
                sum += mid;
            } else {
                sum += arr[i];
            }
        }
        return Math.abs(sum - target);
    }
}
