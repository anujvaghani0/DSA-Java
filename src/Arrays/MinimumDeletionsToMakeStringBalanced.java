package Arrays;

// Question link -> https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/

//Based on the algorithm

public class MinimumDeletionsToMakeStringBalanced {
    public static void main(String[] args) {
        System.out.println(minimumDeletions("aababbab"));
    }

    public static int minimumDeletions(String s) {
        int[] as = new int[s.length()];
        int[] bs = new int[s.length()];

        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            as[i] = count;
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        count = 0;

        for (int i = 0; i < s.length(); i++) {
            bs[i] = count;
            if (s.charAt(i) == 'b') {
                count++;
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            ans = Math.min(ans, as[i] + bs[i]);
        }
        return  ans;
    }
}
