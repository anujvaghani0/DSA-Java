package Patterns;

public class p10 {
    public static void main(String[] args) {
    patten(5);
    }

    public static void patten(int n) {
        for (int row = 0; row <= n; row++) {
            for (int spece = n-row; spece>=1 ; spece--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}
