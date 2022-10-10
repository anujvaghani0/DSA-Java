package Strings;

//question link -> https://leetcode.com/problems/replace-all-digits-with-characters/

public class ReplaceAllDigitsWithCharacters {
    public static void main(String[] args) {
        System.out.println(replaceDigits("a1b2c3d4e"));
    }

    public static String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                ans.append(s.charAt(i));
            } else {
                ans.append((char) ((s.charAt(i) + s.charAt(i - 1)) - '0'));
            }
        }
        return ans.toString();
    }
}