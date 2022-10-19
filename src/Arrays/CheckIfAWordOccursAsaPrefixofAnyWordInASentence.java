package Arrays;

//question link -> https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/

public class CheckIfAWordOccursAsaPrefixofAnyWordInASentence {
    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int count = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                count = i + 1;
                break;
            }
        }
        return count;
    }
}
