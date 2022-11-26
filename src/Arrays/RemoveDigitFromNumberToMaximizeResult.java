package Arrays;

// Question link -> https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/

public class RemoveDigitFromNumberToMaximizeResult {
    public static void main(String[] args) {
        System.out.println(removeDigit("433234", '3'));
    }

    public static String removeDigit(String number, char digit) {
        for (int i = 1; i < number.length(); i++) {
            if (number.charAt(i - 1) == digit) {
                if (number.charAt(i) > number.charAt(i - 1)) {
                    return number.substring(0, i - 1) + number.substring(i);
                }
            }
        }
        int lastIndex = number.lastIndexOf(digit);
        return number.substring(0, lastIndex) + number.substring(lastIndex + 1);
    }

// second approach use where it strings size not the large are given
//    public static String removeDigit(String number, char digit) {
//        long numbers = Integer.parseInt(number);
//        long sameDigit = digit - '0';
//        long max = Integer.MIN_VALUE;
//        int count = 0;
//        long ans = 0;
//        while (numbers != 0) {
//            long rem = (numbers % 10);
//            numbers /= 10;
//            if (rem == sameDigit) {
//                max = (long) Math.max(max, ans + ((Math.pow(10,count)) * numbers));
//            }
//            ans = (long) (ans + (Math.pow(10,count)) * rem);
//            count++;
//        }
//        return String.valueOf(max);
//    }
}
