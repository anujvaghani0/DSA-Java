package Patterns;

public class pattern11 {
    public static void main(String[] args) {
        patten(5);
    }

    public static void patten(int n) {
        for (int row = 0; row < n; row++) {
            for (int space = n - row - 1; space > 0; space--) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
