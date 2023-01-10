package Strings;

import java.util.HashSet;

public class MakeNumberofDistinctCharactersEqual {
    public static void main(String[] args) {
        System.out.println(isItPossible("ab", "abcc"));
    }

    public static boolean isItPossible(String word1, String word2) {
        int[] w1 = new int[26];
        int[] w2 = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            w1[word1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word2.length(); i++) {
            w2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (w1[i] == 0) {
                continue;
            }
            w1[i]--;
            for (int j = 0; j < 26; j++) {
                if (w2[j] == 0) {
                    continue;
                }
                w2[j]--;
                w1[j]++;
                w2[i]--;
                if (checkForSame(w1, w2)) {
                    return true;
                }

                w1[j]--;
                w2[i]--;
                w2[j]++;
            }
            w1[i]++;
        }
        return false;
    }

    private static boolean checkForSame(int[] w1, int[] w2) {
        int c1 = 0;
        int c2 = 0;
        for (int c : w1) {
            if (c != 0) {
                c1++;
            }
        }
        for (int c : w2) {
            if (c != 0) {
                c2++;
            }
        }

        return c1 == c2;
    }
}
