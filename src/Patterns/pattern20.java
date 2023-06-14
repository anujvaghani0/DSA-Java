package Patterns; 

public class pattern20 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int row = 0; row < n; row++) {
            if (row == 0 || row == n - 1) {
                for (int col = 0; col < n; col++) {
                    System.out.print("X");
                }
                if (row == n - 1) {
                    break;
                }
                System.out.println();
            }
            for (int col = 0; col < 1; col++) {
                System.out.print("X");
            }
            for (int s = 1; s < n - 1; s++) {
                System.out.print(" ");
            }
            for (int col = n; col > n - 1; col--) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
