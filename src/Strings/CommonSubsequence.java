package Strings;

// Question link -> https://practice.geeksforgeeks.org/problems/common-subsequence4049/1

public class CommonSubsequence {
    public static void main(String[] args) {
        System.out.println(commonSubseq("ABEF","CADE"));
    }

    public static Boolean commonSubseq(String a, String b) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                count1[a.charAt(i) - 'a']++;
            } else {
                count2[a.charAt(i) - 'A']++;
            }
        }

        for (int i = 0; i < b.length(); i++) {
            if ((b.charAt(i) >= 'a' && b.charAt(i) <= 'z') && count1[b.charAt(i) - 'a'] > 0) {
                return true;
            }
            if ((b.charAt(i) >= 'A' && b.charAt(i) <= 'Z') && count2[b.charAt(i) - 'A'] > 0) {
                return true;
            }
        }
        return false;
    }
}
