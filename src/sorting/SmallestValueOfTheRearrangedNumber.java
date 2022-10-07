package sorting;

//question link -> https://leetcode.com/problems/smallest-value-of-the-rearranged-number/

import java.util.Arrays;

public class SmallestValueOfTheRearrangedNumber {
    public static void main(String[] args) {
        System.out.println(smallestNumber(250560));
    }

    public static long smallestNumber(long num) {
        if (num == 0) {
            return 0;
        }
        boolean isNegative = num < 0;
        num = num < 0 ? num * -1 : num;
        char[] c = String.valueOf(num).toCharArray();
        Arrays.sort(c);
        String ans;
        if (!isNegative) {
            int non = 0;
            for (; non < c.length; non++) {
                if (c[non] != '0') {
                    break;
                }
            }
            char temp = c[non];
            c[non] = c[0];
            c[0] = temp;
            ans = new String(c);
        } else {
            ans = new String(c);
            StringBuilder sb = new StringBuilder(ans);
            ans = "-".concat(sb.reverse().toString());
        }
        return Long.valueOf(ans);
    }
}
