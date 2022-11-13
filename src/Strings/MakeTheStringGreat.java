package Strings;

//using recursion

public class MakeTheStringGreat {
    public static void main(String[] args) {
        System.out.println(makeGood("abBAcC"));
    }

    public static String makeGood(String s) {
        int lower = 65;
        int higher = 65;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) - s.charAt(i) == 32) {
                i++;
                continue;
            }
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
