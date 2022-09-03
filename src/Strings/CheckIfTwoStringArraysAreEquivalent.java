package Strings;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.print((arrayStringsAreEqual(word1, word2)));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i1 = 0, i2 = 0, j1 = 0, j2 = 0;
        while (true) {
            if (word1[i1].charAt(j1) != word2[i2].charAt(j2)) {
                return false;
            }
            if (j1 == word1[i1].length() - 1) {
                i1++;
                j1 = 0;
            } else {
                j1++;
            }
            if (j2 == word2[i2].length() - 1) {
                i2++;
                j2 = 0;
            } else {
                j2++;
            }
            if (i1 == word1.length && i2 == word2.length) {
                return true;
            } else if (i1 == word1.length || i2 == word2.length) {
                return false;
            }
        }
    }
}
