package Patterns;

public class p8 {
    public static void main(String[] args) {
        patten(5);
    }

    public static void patten(int n) {
        for (int row = 0; row <= n; row++) {
            for (int spece = 0; spece < n - row; spece++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print("*" + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
