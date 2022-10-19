package Arrays;

//question link -> https://leetcode.com/problems/counting-words-with-a-given-prefix/

public class CountingWordsWithAGivenPrefix {
    public static void main(String[] args) {
        String[] words = {"pay", "attention", "practice", "attend"};
        System.out.println(prefixCount(words, "at"));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
