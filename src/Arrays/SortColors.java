package Arrays;

// Question link -> https://leetcode.com/problems/sort-colors/

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
    }

    public static void sortColors(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int ans = 0;
        while (ans < j) {
            if (arr[ans] == 0) {
                swap(arr, ans++, i++);
            } else if (arr[ans] == 1) {
                ans++;
            } else {
                swap(arr, ans, j--);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    2nd solution
//    public static void sortColors(int[] nums) {
//        int zeroCount = 0;
//        int oneCount = 0;
//        int twoCount = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) zeroCount++;
//            if (nums[i] == 1) oneCount++;
//            if (nums[i] == 2) twoCount++;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (i < zeroCount) nums[i] = 0;
//            if (i >= zeroCount && i < zeroCount + oneCount) nums[i] = 1;
//            if (i >= zeroCount + oneCount) nums[i] = 2;
//        }
//        System.out.println(Arrays.toString(nums));
//    }

//    3rd solution
//    public static void sortColors(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j] < arr[j - 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                }
//            }
//        }
//    }
}