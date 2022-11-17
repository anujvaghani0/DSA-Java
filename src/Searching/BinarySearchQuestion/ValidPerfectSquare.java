package Searching.BinarySearchQuestion;

// Question link -> https://leetcode.com/problems/valid-perfect-square/

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid > num) {
                end = mid - 1;
            } else if (mid * mid < num) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
