package Strings;

//question link -> https://leetcode.com/problems/orderly-queue/

import java.util.Arrays;

public class OrderlyQueue {
    public static void main(String[] args) {
        System.out.println(orderlyQueue("cba", 1));
    }

    public static String orderlyQueue(String s, int k) {
        if (k == 1) {
            StringBuilder ans = new StringBuilder(s);
            for (int i = 1; i < s.length(); i++) {
                StringBuilder temp2 = new StringBuilder(s.substring(i) + s.substring(0, i));
                if (ans.compareTo(temp2) > 0) {
                    ans = temp2;
                }
            }
            return ans.toString();
        } else {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
    }
}
