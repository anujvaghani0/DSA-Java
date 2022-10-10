package Strings;

//question link -> https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/

public class MinimumChangesToMakeAlternatingBinaryString {
    public static void main(String[] args) {
        System.out.println(minOperations("10101010101010"));
    }

    public static int minOperations(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' != i % 2) {
                count++;
            }
        }
        return Math.min(count, s.length() - count);
    }
}
