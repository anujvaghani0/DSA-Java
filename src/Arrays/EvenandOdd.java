package Arrays;

import java.util.Arrays;

public class EvenandOdd {
    public static void main(String[] args) {
        int[] arr = {9 ,3 ,8 ,8};
        reArrange(arr, arr.length);
    }

    public static void reArrange(int[] arr, int N) {
        for (int i = 0; i < N-1; i++) {
            if ((arr[i] % 2 == 0 && i % 2 == 0) || (arr[i] % 2 != 0 && i % 2 != 0)) {
                continue;
            }
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
