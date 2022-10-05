package Arrays;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElements {
    public static void main(String[] args) {
        int[] nums = {6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4};
        System.out.println(trimMean(nums));
    }

    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        int toRemove = length * 5 / 100;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        for (int i = length - 1; i >= length - toRemove; i--) {
            total -= arr[i];
        }
        length -= (2 * toRemove);
        return (double) ((double) (total) / (double) (length));
    }
}