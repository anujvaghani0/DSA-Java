package Strings;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("ababa"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        String str1 = str.substring(1, str.length() - 1);
        if (str1.contains(s)) {
            return true;
        } else {
            return false;
        }
    }
}
