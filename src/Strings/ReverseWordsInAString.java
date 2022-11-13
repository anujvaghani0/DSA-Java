package Strings;

//question link -> https://leetcode.com/problems/reverse-words-in-a-string/

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example  "));
    }

    public static String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (int i = parts.length - 1; i > 0; i--) {
            ans.append(parts[i]).append(" ");
        }
        ans.append(parts[0]);
        return ans.toString();
    }
}