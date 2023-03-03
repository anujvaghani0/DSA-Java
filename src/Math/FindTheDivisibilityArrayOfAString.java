package Math;

import java.util.Arrays;

public class FindTheDivisibilityArrayOfAString {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibilityArray("529282143571", 4)));
    }

    public static int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int[] division = new int[n];
        long reminder = 0;
        for (int i = 0; i < n; i++) {
            int digit = word.charAt(i) - '0';
            reminder = (reminder * 10 + digit) % m;
            if (reminder == 0) {
                division[i] = 1;
            }
        }
        return division;
    }
}
