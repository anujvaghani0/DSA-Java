package Searching.BinarySearchQuestion;

// Question link -> https://leetcode.com/problems/find-in-mountain-array/

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        System.out.println(findInMountainArray(arr, 3));
    }

    public static int findInMountainArray(int[] arr, int target) {
        int peak = findInMountainArrayIndex(target, arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    private static int findInMountainArrayIndex(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start - (start - end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }


    private static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
