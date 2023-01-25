package Recursion;

import java.util.ArrayList;
import java.util.List;


public class PalindromePartitioning {
    public static void main(String[] args) {
        System.out.println(partition("aabb"));
    }

    public static List<List<String>> partition(String s) {
            List<List<String>> ans = new ArrayList<>();
            List<String> part = new ArrayList<>();
            solve(s, 0, part, ans);
            return ans;
        }

        public static void solve(String s, int index, List<String> part, List<List<String>> ans) {
            if (s.length() == index) {
                ans.add(new ArrayList<>(part));
                return;
            }

            for (int i = index; i < s.length(); i++) {
                if (isPalindrome(s, index, i)) {
                    part.add(s.substring(index, i + 1));
                    solve(s, i + 1, part, ans);
                    part.remove(part.size() - 1);
                }
            }
        }

        public static boolean isPalindrome(String s, int start, int end) {
            while (start <= end) {
                if (s.charAt(start++) != s.charAt(end--)) {
                    return false;
                }
            }
            return true;
    }
}
