package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] ans = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(ans));
    }

    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0) {
            return "";
        }
        if (n == 1) {
            return strs[0];
        }
        Arrays.sort(strs);
        int min = strs[0].length();
        String first = strs[0];
        String last = strs[n - 1];
        int i = 0;
        while (i < min && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }
}
