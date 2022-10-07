package Strings;

//question link -> https://leetcode.com/problems/number-of-ways-to-split-a-string/

public class NumberOfWaysToSplitAString {
    public static void main(String[] args) {
    String s="10101";
        System.out.println(numWays(s));
    }

    public static final int m = 1_000_000_007;

    public static int numWays(String s) {
        int once = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            once += s.charAt(i) - '0';
        }
        if (once == 0) {
            return (int)((n - 2L) * (n - 1L) / 2 % m);
        }
        if (once % 3 != 0) {
            return 0;
        }

        int onesInEachSplitedBlock = once / 3;
        int count = 0;
        long waysOfFirstCut = 0, waysOfSecondCut = 0;
        for (int i = 0; i < n ; i++) {
            count += s.charAt(i) - '0';
            if (count == onesInEachSplitedBlock) {
                waysOfFirstCut++;
            } else if (count == 2 * onesInEachSplitedBlock) {
                waysOfSecondCut++;
            }
        }
        return (int) (waysOfFirstCut * waysOfSecondCut);
    }
}
