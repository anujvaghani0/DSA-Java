package Strings;

// Question link -> https://leetcode.com/problems/split-a-string-in-balanced-strings/

public class SplitAStringInBalancedString {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }

    public static int balancedStringSplit(String s) {
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'R') {
                sum++;
            } else {
                sum--;
            }
            if (sum == 0) {
                ans++;
            }
        }
        return ans;
    }
}
