package Strings;

// Question link -> https://leetcode.com/problems/greatest-common-divisor-of-strings/

public class GreatestCommonDivisorofStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }
        if (str2.equals(str1)) {
            return str1;
        }
        if (str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
        return "";
    }
}
