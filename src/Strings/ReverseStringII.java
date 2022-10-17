package Strings;

//question link -> https://leetcode.com/problems/reverse-string-ii/

import java.util.Scanner;

public class ReverseStringII {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefghijkl", 3));
    }

    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i += 2 * k;
        }
        return String.valueOf(arr);
    }

    private static void swap(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
}
