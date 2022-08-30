package Patterns;

public class pattern20 {
    public static void main(String[] args) {
    pattern(4);
    }

    public static void pattern(int n) {
        for (int row = 0; row < n; row++) {
            if (row == 0 || row == n-1) {
                for (int col = 0; col < n; col++) {
                    System.out.print("X ");
                }
            }
//            for (int col=0;col<=row;col++){
//                System.out.print("X ");
//            }
            for (int s = 1; s < n; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
