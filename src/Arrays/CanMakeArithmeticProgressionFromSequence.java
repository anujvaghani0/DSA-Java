package Arrays;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {

    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if (arr.length == 1) {
            return true;
        }

        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }
}
