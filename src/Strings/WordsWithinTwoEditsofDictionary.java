package Strings;

//question link -> https://leetcode.com/problems/words-within-two-edits-of-dictionary/

import java.util.ArrayList;
import java.util.List;

public class WordsWithinTwoEditsofDictionary {
    public static void main(String[] args) {
        String[] querious = {"word", "note", "ants", "wood"};
        String[] dic = {"wood", "joke", "moat"};
        System.out.println(twoEditWords(querious, dic));
    }

    public static List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for (String query : queries) {
            if (isCheck(query, dictionary)) {
                ans.add(query);
            }
        }
        return ans;
    }

    private static boolean isCheck(String queries, String[] dictionary) {
        int j = 0;
        while (j < dictionary.length) {
            int i = 0;
            int count = 0;
            while (i < queries.length()) {
                if (queries.charAt(i) != dictionary[j].charAt(i) || count >= 3) {
                    count++;
                }
                i++;
            }
            if (count < 3) {
                return true;
            }
            j++;
        }
        return false;
    }
}