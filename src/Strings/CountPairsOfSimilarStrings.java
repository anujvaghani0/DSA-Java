package Strings;

// Question link -> https://leetcode.com/problems/count-pairs-of-similar-strings/

import java.util.Arrays;

public class CountPairsOfSimilarStrings {
    public static void main(String[] args) {
        String[] words = {"aba","aabb","abcd","bac","aabc"};
        System.out.println(similarPairs(words));
    }

    public static int similarPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (removeDups(words[i]).equals(removeDups(words[j]))) {
                    count++;
                }
            }
        }
        return count;
    }

    private static String helper(String str) {
        int res_ind = 1, ip_ind = 1;
        char[] arr = str.toCharArray();
        while (ip_ind != arr.length) {
            if (arr[ip_ind] != arr[ip_ind - 1]) {
                arr[res_ind] = arr[ip_ind];
                res_ind++;
            }
            ip_ind++;
        }
        str = new String(arr);
        return str.substring(0, res_ind);
    }

    private static String removeDups(String str) {
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        str = new String(temp);
        return helper(str);
    }
}
