package Patterns; 

public class pattern34 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        int c = 65;
        for (int row = 0; row < n; row++) {
            for (int col = n - row - 1; col >= 0; col--) {
                System.out.print((char) (c + (col)) + " ");
            }
            System.out.println();
        }
    }
}
