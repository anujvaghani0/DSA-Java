package Strings;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String s = "abcd";
        char ch = 'e';
        System.out.println(reversePrefix(s, ch));
    }

    public static String reversePrefix(String word, char ch) {
        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < word.length()) {
            if (word.charAt(i) == ch) {
                temp.append(word.charAt(i));
                i++;
                temp.reverse();
                break;
            } else {
                temp.append(word.charAt(i));
                i++;
            }
        }
        ans.append(temp);
        while (i < word.length()) {
            ans.append(word.charAt(i));
            i++;
        }
        return ans.toString();
    }
}