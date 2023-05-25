package Strings;

public class LexicographicallySmallestPalindrome {
    public static void main(String[] args) {
        System.out.println(makeSmallestPalindrome("seven"));
    }

    public static String makeSmallestPalindrome(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (c[i] < c[j]) {
                c[j--] = c[i++];
            } else {
                c[i++] = c[j--];
            }
        }
        return new String(c);
    }
}
