package Patterns;

public class pattern19 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= (2 * n) - 1; col++) {
                if (col <= row) {
                    System.out.print("X");
                } else if (col < n * 2 - row - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }

        for (int row = n - 1; row > 0; row--) {
            for (int col = 0; col <= (2 * n) - 1; col++) {
                if (row > col) {
                    System.out.print("X");
                } else if (col < n * 2 - row) {
                    System.out.print(" ");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
