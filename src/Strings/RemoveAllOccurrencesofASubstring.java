package Strings;

//question link -> https://leetcode.com/problems/remove-all-occurrences-of-a-substring/

public class RemoveAllOccurrencesofASubstring {
    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc","abc"));
    }

    public static String removeOccurrences(String s, String part) {
        int index = s.indexOf(part);
        while (index != -1) {
            s = s.substring(0, index) + s.substring(index + part.length());
            index = s.indexOf(part);
        }
        return s;
    }
}
