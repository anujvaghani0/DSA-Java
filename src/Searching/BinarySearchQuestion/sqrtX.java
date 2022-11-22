package Searching.BinarySearchQuestion;

// Question link -> https://leetcode.com/problems/sqrtx/

public class sqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        long start = 1;
        long end = x;
        while (start <= end) {
            long mid = (start) + (end - start) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) end;
    }
}
