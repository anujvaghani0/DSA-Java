package Searching.BinarySearchQuestion;

//question link -> https://leetcode.com/problems/sum-of-square-numbers/

public class SumofSquareNumbers {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(3));
    }

    public static boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long) Math.sqrt(c);

        while (start <= end) {
            long mid = start * start + end * end;
            if (mid == (long) c) {
                return true;
            } else if (mid > (long) c) {
                end--;
            } else {
                start++;
            }
        }
        return false;
    }
}
