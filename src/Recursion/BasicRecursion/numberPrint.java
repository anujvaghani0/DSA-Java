package Recursion.BasicRecursion;

public class numberPrint {
    public static void main(String[] args) {
        print(0);
    }

    public static void print(int n) {
        if (n == 5) {
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
