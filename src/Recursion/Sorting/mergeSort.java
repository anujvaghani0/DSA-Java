package Recursion.Sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] ans = {5,4,3,2,1};
        ans = sort(ans);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid, arr.length));
        return mergeSort(left, right);
    }

    private static int[] mergeSort(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
