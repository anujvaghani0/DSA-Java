package Strings;

// Question Link -> https://practice.geeksforgeeks.org/problems/find-patterns0606/1

public class FindPatterns {
    public static void main(String[] args) {
        System.out.println(numberOfSubsequences("kekptept", "kept"));
    }

    public static int numberOfSubsequences(String S, String W) {
        int ans = 0;
        boolean[] visit = new boolean[S.length()];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == W.charAt(0) && !visit[i]) {
                visit[i] = true;
                int j = i + 1;
                int k = 1;
                while (j < S.length() && k < W.length()) {
                    if (S.charAt(j) == W.charAt(k) && !visit[j]) {
                        visit[j] = true;
                        k++;
                    }
                    j++;
                }
                if (k == W.length()) {
                    ans++;
                } else {
                    break;
                }
            }
        }
        return ans;
    }
}
