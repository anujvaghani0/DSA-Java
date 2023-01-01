package Strings;

public class HighFrequency {
    public static void main(String[] args) {
        System.out.println(solve(5, "derty"));
    }

    public static String solve(int N, String S) {
        int[] temp = new int[26];
        for (int i = 0; i < S.length(); i++) {
            temp[S.charAt(i) - 'a']++;
        }

        int max = Integer.MIN_VALUE;
        char ans = 0;
        for (int i = 0; i < temp.length; i++) {
            if (max < temp[i]) {
                ans = (char) ('a' + i);
                max = temp[i];
            }
        }
        return String.valueOf(ans);
    }
}
