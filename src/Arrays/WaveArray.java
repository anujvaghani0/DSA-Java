package Arrays;

//question link -> https://practice.geeksforgeeks.org/problems/wave-array-1587115621/0

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {2, 6};
        convertToWave(arr.length, arr);
    }

    public static void convertToWave(int n, int[] a) {
        if (n == 2 && a[0] < a[1]) {
            int temp = a[0];
            a[0] = a[1];
            a[1] = temp;
        }
        for (int i = 1; i < n - 1; ) {
            int temp = a[i];
            if (i % 2 == 0) {
                a[i] = a[i + 1];
                a[i + 1] = temp;
                i += 2;
            } else {
                a[i] = a[i - 1];
                a[i - 1] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
