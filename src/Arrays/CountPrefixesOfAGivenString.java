package Arrays;

//question link -> https://leetcode.com/problems/count-prefixes-of-a-given-string/

public class CountPrefixesOfAGivenString {
    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "ab", "bc", "abc"};
        System.out.println(countPrefixes(words, "abc"));
    }

    public static int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String word : words) {
            if (s.startsWith(word)) {
                count++;
            }
        }
        return count;
    }
}
