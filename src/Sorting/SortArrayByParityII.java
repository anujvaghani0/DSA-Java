package Sorting;

import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] arr = {4, 6, 5, 7};
        int[] ans = sortArrayByParityII(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortArrayByParityII(int[] A) {
        int n =A.length;
        int j=1;
        for (int i = 0; i < n; i += 2)
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1)
                    j += 2;
                swap(A, i, j);
            }
        return A;
    }
    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
