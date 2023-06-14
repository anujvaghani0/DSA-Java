package Patterns; 

public class pattern12 {
    public static void main(String[] args) {
        patten(5);
    }

    public static void patten(int n) {
        for (int row = 0; row < 2 * n; row++) {
            if (row <= n - 1) {
                for (int spece = 1; spece <= row; spece++) {
                    System.out.print(" ");
                }
                for (int col = n - row; col > 0; col--) {
                    System.out.print("X ");
                }
            }
            if (row >= n) {
                for (int spece = n * 2 - row - 1; spece > 0; spece--) {
                    System.out.print(" ");
                }
                for (int col = 0; col <= row - n; col++) {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
