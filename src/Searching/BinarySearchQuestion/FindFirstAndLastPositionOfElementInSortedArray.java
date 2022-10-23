package Searching;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 8, 8, 8, 8, 10};
        int target = 8;
        int[] ans = PositionOfElementInSortedArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] PositionOfElementInSortedArray(int[] arr, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        return ans;
    }

    public static int search(int[] arr, int target, boolean firstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
