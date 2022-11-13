package Strings;

//question link -> https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/

public class MinimumLengthOfStringAfterDeletingSimilarEnds {
    public static void main(String[] args) {
        System.out.println(minimumLength("aabccabba"));
    }

    public static int minimumLength(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                char ch = s.charAt(i);
                while (s.charAt(i) == ch && i < j) {
                    i++;
                }
                while (s.charAt(j) == ch && i <= j) {
                    j--;
                }
            } else {
                break;
            }
        }
        return j - i + 1;
    }
}
