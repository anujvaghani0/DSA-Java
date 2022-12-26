package Strings;

// Question link -> https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/

public class ShortestDistanceToTargetStringInACircularArray {
    public static void main(String[] args) {
        String[] words = {"hello", "i", "am", "leetcode", "hello"};
        System.out.println(closetTarget(words, "hello", 1));
    }

    public static int closetTarget(String[] words, String target, int startIndex) {
        int ans = Integer.MAX_VALUE;
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (target.equals(words[i])) {
                int distance = Math.abs(i - startIndex);
                ans = Math.min(ans, distance);
                ans = Math.min(ans, n - distance);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
