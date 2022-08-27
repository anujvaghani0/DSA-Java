package sorting;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diffrent = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diffrent) {
                return false;
            }
        }
        return true;
    }
}
