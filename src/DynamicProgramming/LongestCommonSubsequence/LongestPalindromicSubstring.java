package DynamicProgramming.LongestCommonSubsequence;

// Question link -> https://leetcode.com/problems/longest-palindromic-substring/

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        StringBuilder text1 = new StringBuilder(s);
        String text2 = text1.reverse().toString();
        String ans = "";
        int max = Integer.MIN_VALUE;
        int n = text1.length();
        int m = text2.length();

//        base case
        if (n == 1) {
            return s;
        }

//        if the check string S and reverse String are same
//        if the same string return main string because it already Palindrome
        if (s.equals(text2)) {
            return s;
        }
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];

//                    print the sequences Palindrome
                    if (dp[i][j] > max) {
                        String temp = s.substring(i - dp[i][j], i);
                        StringBuilder temprev = new StringBuilder(temp);
                        String newRev = temprev.reverse().toString();
                        if (temp.equals(newRev)) {
                            max = dp[i][j];
                            ans = temp;
                        }
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }
}
