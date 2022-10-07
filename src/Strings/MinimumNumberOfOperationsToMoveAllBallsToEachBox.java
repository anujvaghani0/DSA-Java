package Strings;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public static void main(String[] args) {
        String box = "001011";
        System.out.println(Arrays.toString(minOperations(box)));
    }

    public static int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                int count = 1;
                int count2 = 1;
                int k = i - 1;
                int z = i + 1;
                for (int j = i - 1; j >= 0; j--) {
                    ans[k--] += count++;
                }
                for (int j = i + 1; j < boxes.length(); j++) {
                    ans[z++] += count2++;
                }
            }
        }
        return ans;
    }
}
