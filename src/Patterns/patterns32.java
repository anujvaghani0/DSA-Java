package Patterns;

public class patterns32 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        int c = 65;
        for (int row = 0; row < n; row++) {
            for (int col = row; col >= 0; col--) {
                System.out.print((char) (c + (n - col - 1)) + " ");
            }
            System.out.println();
        }
    }
}
