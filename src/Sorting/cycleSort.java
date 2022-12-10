package Sorting;

import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
