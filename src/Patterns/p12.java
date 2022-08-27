package Patterns;

public class p12 {
    public static void main(String[] args) {
    patten(5);
    }
    public static void patten(int n) {
        for (int row = 0; row <= n*2; row++) {
            int c = row > n ? row : n-row;
            for (int space = 0; space < c; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=c; col++) {
                System.out.print("*"+" ");
            }
//            for (int col = 1; col <= c;col++) {
//                System.out.print("*" + " ");
//            }

            System.out.println();

        }
    }
}
