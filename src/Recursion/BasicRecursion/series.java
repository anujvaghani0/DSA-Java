package Recursion.BasicRecursion;

public class series {
    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }
}
