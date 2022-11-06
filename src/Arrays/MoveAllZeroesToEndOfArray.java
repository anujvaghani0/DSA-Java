package Arrays;

//question link -> https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/0

import java.util.Arrays;

public class MoveAllZeroesToEndOfArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 0, 0, 4};
        pushZerosToEnd(arr, 5);
    }

    public static void pushZerosToEnd(int[] arr, int n) {
        if (arr.length == 0 || arr == null) {
            return;
        }
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
