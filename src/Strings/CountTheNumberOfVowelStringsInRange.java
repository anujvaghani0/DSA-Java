package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class CountTheNumberOfVowelStringsInRange {
    public static void main(String[] args) {
        String[] words = {"hey", "aeo", "mu", "ooo", "artro"};
        System.out.println(vowelStrings(words, 1, 4));
    }

    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (checkVowel(words[i].charAt(0)) && checkVowel(words[i].charAt(words[i].length() - 1))) {
                count++;
            }
        }
        return count;
    }

    private static boolean checkVowel(char c) {
        {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                return true;
            return false;
        }
    }
}
