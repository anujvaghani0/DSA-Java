package Recursion.Arrays;

import java.util.Arrays;

public class mergeSortInplace {
    public static void main(String[] args) {
        int[] ans = {5, 4, 3, 2, 1};
        merge(ans, 0, ans.length);
        System.out.println(Arrays.toString(ans));
    }

    public static void merge(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;
        merge(arr, s, mid);
        merge(arr, mid, e);
        mergeSort(arr, s, mid, e);
    }

    private static void mergeSort(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
