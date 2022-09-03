package Patterns;

public class pattern16 {
    public static void main(String[] args) {
        pattern(5);
    }

    static int factorial(int n) {
        int f;
        for (f = 1; n > 1; n--) {
            f *= n;
        }
        return f;
    }

    public static int ncr(int n, int r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    public static void pattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int s = 0; s < n - row - 1; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print(ncr(row, col)+" ");
            }
            System.out.println();
        }
    }
}

