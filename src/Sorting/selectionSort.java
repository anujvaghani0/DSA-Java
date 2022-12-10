package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 6, 1, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxindex = maxIndex(arr, 0, last);
            swap(arr, maxindex, last);
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int maxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}