package Strings;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        boolean check = true;
        while (i < word1.length() && j < word2.length()) {
            if (check) {
                ans.append(word1.charAt(i));
                i++;
                check = false;
            } else {
                ans.append(word2.charAt(j));
                j++;
                check = true;
            }
        }

        while (i < word1.length()) {
            ans.append(word1.charAt(i));
            i++;
        }
        while (j < word2.length()) {
            ans.append(word2.charAt(j));
            j++;
        }
        return ans.toString();
    }
}
