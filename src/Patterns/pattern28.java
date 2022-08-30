package Patterns;

public class pattern28 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int row = 0; row < n * 2; row++) {
            if (row <= n - 1) {
                for (int s = 0; s < n - row - 1; s++) {
                    System.out.print(" ");
                }
                for (int col = 0; col <= row; col++) {
                    System.out.print("X ");
                }
            }
            if (row >= n) {
                for (int spece = 0; spece <= row - n; spece++) {
                    System.out.print(" ");
                }
                for (int col = 0; col < n * 2 - row - 1; col++) {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}