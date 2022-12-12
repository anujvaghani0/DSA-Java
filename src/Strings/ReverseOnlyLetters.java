package Strings;

// Question link -> https://leetcode.com/problems/reverse-only-letters/

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    public static String reverseOnlyLetters(String s) {
        StringBuilder ans = new StringBuilder(s);
        for (int i = 0, j = s.length() - 1; i < j; ) {
            if (!Character.isLetter(ans.charAt(i))) {
                i++;
            } else if (!Character.isLetter(ans.charAt(j))) {
                j--;
            } else {
                ans.setCharAt(i, s.charAt(j));
                ans.setCharAt(j--, s.charAt(i++));
            }
        }
        return ans.toString();
    }
}