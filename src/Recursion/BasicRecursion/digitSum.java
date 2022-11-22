package Recursion.BasicRecursion;

public class digitSum {
    public static void main(String[] args) {
        int n = 15632;
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sum(n / 10);
    }
}
