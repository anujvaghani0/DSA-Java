package Strings;

//question link -> https://leetcode.com/problems/rearrange-words-in-a-sentence/

import java.util.Arrays;

public class RearrangeWordsInASentence {
    public static void main(String[] args) {
        System.out.println(arrangeWords("Keep calm and code on"));
    }

    public static String arrangeWords(String text) {
        String[] s = text.split(" ");
        Arrays.sort(s, (s1, s2) -> {
            return s1.length() - s2.length();
        });
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            temp.append(" ").append(s[i].toLowerCase());
        }
        char[] ans = temp.substring(1).toCharArray();
        ans[0] = (char) (ans[0] + 'A' - 'a');
        return new String(ans);
    }
}
