package Recursion.BasicRecursion;


public class Palindrome {
    public static void main(String[] args) {
        int n = 123621;
        System.out.println(palin(n));
    }

    public static int rev2(int n) {
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }

    public static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digit - 1)) + helper(n / 10, digit - 1);
    }

    static boolean palin(int n) {
        return n == rev2(n);
    }
}
