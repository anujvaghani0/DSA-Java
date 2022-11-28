package Searching.BinarySearchQuestion;

// Question link -> https://leetcode.com/problems/find-the-pivot-integer/

public class FindThePivotInteger {
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }

    public static int pivotInteger(int n) {
        int left = 1;
        int right = n;
        int sum = n * (n + 1) / 2;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid * mid - sum < 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left * left - sum == 0 ? left : -1;
    }
}
