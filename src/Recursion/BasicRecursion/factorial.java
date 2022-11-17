package Recursion.BasicRecursion;


public class factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fac(5));
    }

    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }
}
