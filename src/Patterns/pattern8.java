package Patterns; 

public class pattern8 {
    public static void main(String[] args) {
        patten(5);
    }

    public static void patten(int n) {
        for (int row = 0; row < n; row++) {
            for (int spece = n - row - 1; spece > 0; spece--) {
                System.out.print("  ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("X ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
