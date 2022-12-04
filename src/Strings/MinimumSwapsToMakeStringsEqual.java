package Strings;

import java.util.Arrays;

public class MinimumSwapsToMakeStringsEqual {
    public static void main(String[] args) {
        System.out.println(minimumSwap("xx", "xy"));
    }

    public static int minimumSwap(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if (n != m) {
            return -1;
        }
        int xmis=0;
        return 0;
    }
}
