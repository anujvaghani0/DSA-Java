package Strings;

// Question link -> https://leetcode.com/problems/determine-if-two-strings-are-close/

import java.util.Arrays;

public class DetermineIfTwoStringsAreClose {
    public static void main(String[] args) {
        System.out.println(closeStrings("ab","aa"));
    }

    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];
        helper(count1, word1);
        helper(count2, word2);

        for (int i = 0; i < 26; i++) {
            if (count1[i] == 0 && count2[i] != 0 || count1[i] != 0 && count2[i] == 0) {
                return false;
            }
        }
        Arrays.sort(count1);
        Arrays.sort(count2);
        return Arrays.equals(count1, count2);
    }

    private static void helper(int[] count1, String word1) {
        char[] temp = word1.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            count1[temp[i] - 'a']++;
        }
        return;
    }
}
