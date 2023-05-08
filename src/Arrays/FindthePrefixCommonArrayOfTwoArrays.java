package Arrays;

import java.util.Arrays;

public class FindthePrefixCommonArrayOfTwoArrays {
    public static void main(String[] args) {
    int[] a={1,3,2,4};
    int[] b={3,1,2,4};
        System.out.println(Arrays.toString(findThePrefixCommonArray(a, b)));
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == B[i]) {
                count++;
            }
            C[i] = count;
        }
        return C;
    }
}
