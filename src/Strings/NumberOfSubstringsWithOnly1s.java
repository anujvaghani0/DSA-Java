package Strings;

//question link -> https://leetcode.com/problems/number-of-substrings-with-only-1s/

public class NumberOfSubstringsWithOnly1s {
    public static void main(String[] args) {
        System.out.println(numSub("111111"));
    }

    public static int numSub(String s) {
        int ans = 0;
        int count = 0;
        int mod = (int) 1e9 + 7;

        for (int i = 0; i < s.length(); i++) {
            count = s.charAt(i) == '1' ? count + 1 : 0;
            ans = (ans + count) % mod;
        }
        return ans;
    }
}