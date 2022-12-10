package Sorting;

import java.util.Arrays;

//question link -> https://leetcode.com/problems/largest-number/
public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(nums));
    }

    public static String largestNumber(int[] nums) {
        StringBuilder ans = new StringBuilder();
        char[] c = Arrays.toString(nums).toCharArray();

        for (int i = 0; i < c.length; i++) {
            ans.append(c[i]);
        }
        char[] temp = ans.toString().toCharArray();
        Arrays.sort(temp);
        StringBuilder Finals = new StringBuilder();
        for (int i = temp.length - 1; i >= 0; i--) {
            Finals.append(temp[i]);
        }
        StringBuilder Finals1 = new StringBuilder();
        for (int i = 0; i < Finals.length(); i++) {
            if (Finals.charAt(i) >= '0' && Finals.charAt(i) <= '9') {
                Finals1.append(Finals.charAt(i));
            }
        }
        return Finals1.toString();
    }
}
