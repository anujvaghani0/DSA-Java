package Patterns;

public class pattern19 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int row = 0; row < n ; row++) {
            for (int col = 0; col <= (2 * n) - 1; col++) {
                if (col<=row){
                    System.out.print("X");
                } else if (col<2*n-1 && col>=row+1) {
                    System.out.print(" ");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
