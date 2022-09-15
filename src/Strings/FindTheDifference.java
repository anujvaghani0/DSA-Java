package Strings;

public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }

    public static char findTheDifference(String s, String t) {
        char ans = 0;
        char[] temp1 = s.toCharArray();
        char[] temp2 = t.toCharArray();
        for (int i = 0; i < temp1.length; i++) {
            ans ^= temp1[i];
        }
        for (int i = 0; i < temp2.length; i++) {
            ans ^= temp2[i];
        }
        return ans;
    }
}
