package Strings;

// Question link -> https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/0

public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));
    }

    public static String reverseWords(String S) {
        String[] temp = S.split("\\.");
        StringBuilder ans = new StringBuilder();
        for (int i = temp.length - 1; i >= 0; i--) {
            ans.append(temp[i]);
            ans.append(".");
        }
        return ans.toString().substring(0, S.length());
    }
}
