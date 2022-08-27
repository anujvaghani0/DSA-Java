package sorting;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 2, 1, 3};
        int ans = height(arr);
        System.out.println(ans);
    }

    public static int height(int[] arr) {
        int[] newHeight = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newHeight[i] = arr[i];
        }

        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (newHeight[i] != arr[i]) {
                count++;
            }
        }
        return count;
    }
}
