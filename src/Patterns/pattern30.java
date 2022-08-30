package Patterns;

public class pattern30 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <= n - row; s++) {
                System.out.print("  ");
            }
            for (int col = row; col > 0; col--) {
                System.out.print(col + " ");
            }
            for (int col = 1; col <= row - 1; col++) {
                System.out.print((col + 1) + " ");
            }
            System.out.println();
        }
    }
}
