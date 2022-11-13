package Math;

//question link -> https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/

import java.util.Arrays;

public class MinimumSumofFourDigitNumberAfterSplittingDigits {
    public static void main(String[] args) {
        System.out.println(minimumSum(4009));
    }

    public static int minimumSum(int num) {
        int[] digit = new int[4];
        int current = 0;
        while (num > 0) {
            digit[current++] = num % 10;
            num /= 10;
        }

        Arrays.sort(digit);
        int num1 = digit[0] * 10 + digit[2];
        int num2 = digit[1] * 10 + digit[3];
        return num1 + num2;
    }
}
