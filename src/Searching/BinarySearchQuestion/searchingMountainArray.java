package Searching.BinarySearchQuestion;

import java.util.ArrayList;
import java.util.List;

public class searchingMountainArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int ans = findInMountainArray(arr, target);
        System.out.println(ans);
    }

    public static int findInMountainArray(int[] arr, int target) {
        int peak = mountain(arr);
        int firstTry = orderBinary(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderBinary(arr, target, peak + 1, arr.length - 1);
    }

    public static int mountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int orderBinary(int[] arr, int target, int start, int end) {
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
