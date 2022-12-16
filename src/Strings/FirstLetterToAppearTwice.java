package Strings;

// Question link -> https://leetcode.com/problems/first-letter-to-appear-twice/

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz"));
    }

    public static char repeatedCharacter(String s) {
        int[] temp = new int[26];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            temp[s.charAt(i) - 'a']++;
            if (temp[s.charAt(i) - 'a']==2) {
                ans = s.charAt(i)-'a';
                break;
            }
        }
        return (char) ((ans) + 'a');
    }
}