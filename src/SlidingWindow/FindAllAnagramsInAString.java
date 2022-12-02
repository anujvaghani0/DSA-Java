package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        System.out.println(findAnagrams("forxxorfxdofr","for"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] charCount = new int[26];
        char[] pchar = p.toCharArray();
        for (int i = 0; i < p.length(); i++) {
            charCount[pchar[i] - 'a']++;
        }

        int i = 0;
        int j = 0;
        int count = p.length();
        while (j < s.length()) {
            if (charCount[s.charAt(j++) - 'a']-- >= 1) {
                count--;
            }
            if (count == 0) {
                ans.add(i);
            }
            if (j - i == p.length() && charCount[s.charAt(i++) - 'a']++ >= 0) {
                count++;
            }
        }
        return ans;
    }
}
