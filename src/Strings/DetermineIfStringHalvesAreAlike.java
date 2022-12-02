package Strings;

// Question link -> https://leetcode.com/problems/determine-if-string-halves-are-alike/

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }

    public static boolean halvesAreAlike(String s) {
        int i = 0;
        int j = s.length() - 1;
        int countRight = 0;
        int countLeft = 0;
        while (i < j) {
            if (vowel(s.charAt(i++))) {
                countLeft++;
            }
            if (vowel(s.charAt(j--))) {
                countRight++;
            }

        }
        return countLeft == countRight;
    }

    private static boolean vowel(char charAt) {
        return charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u' ||
                charAt == 'E' || charAt == 'A' || charAt == 'I' || charAt == 'O' || charAt == 'U';
    }
}