package Strings;

public class ValidPalindromeII {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
    }

    public static boolean validPalindrome(String s) {
        String temp = s;
        StringBuilder ans = new StringBuilder();
        for (int i = temp.length(); i > 0; i--) {
            ans.append(temp.charAt(i - 1));
        }
        if (ans.toString().equals(temp)) {
            return true;
        }
        return false;
    }
}
