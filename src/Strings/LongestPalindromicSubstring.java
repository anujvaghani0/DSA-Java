package Strings;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        int max = 0;
        int start_index = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (check(i, j, s)) {
                    if (j - i + 1 > max) {
                        max = j - i + 1;
                        start_index = i;
                    }
                }
            }
        }
        return s.substring(start_index, start_index + max);
    }

    public static boolean check(int i, int j, String s) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
