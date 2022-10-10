package Strings;

//question link -> https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] ans = s.split(" ");
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < ans.length; i++) {
            for (int j = ans[i].length() - 1; j >= 0; j--) {
                temp.append(ans[i].charAt(j));
            }
            temp.append(" ");
        }
        return temp.substring(0,temp.length()-1);
    }
}
