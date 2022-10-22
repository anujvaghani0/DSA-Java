package Strings;

//question link -> https://leetcode.com/problems/string-to-integer-atoi/submissions/

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi(" "));
    }

    public static int myAtoi(String s) {
        int index = 0;
        int sign = 1;
        int total = 0;
        if (s.length() == 0) {
            return 0;
        }
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        while (index < s.length()) {
            int digit = s.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }

            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = 10 * total + digit;
            index++;
        }
        return total * sign;
    }
}
