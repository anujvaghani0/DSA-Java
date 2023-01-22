package Trie;

public class p1 {
    public static void main(String[] args) {
        System.out.println(word("The quick brown fox jumps over the lazy dog"));
    }

    public static boolean word(String word) {
        int[] temp = new int[26];
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                continue;
            } else {
                temp[Character.toLowerCase(word.charAt(i)) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (temp[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
