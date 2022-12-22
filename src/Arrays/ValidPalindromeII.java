package Arrays;

// Question link -> https://leetcode.com/problems/valid-palindrome-ii/

public class ValidPalindromeII {
    public static void main(String[] args) {
        System.out.println(validPalindrome("abca"));
    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);

            }
        }
        return true;
    }

    private static boolean isPalindrome(String s, int a, int b) {
        while (a <= b) {
            if (s.charAt(a) == s.charAt(b)) {
                a++;
                b--;
            } else {
                return false;
            }
        }
        return true;
    }
}
