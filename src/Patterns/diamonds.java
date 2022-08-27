package Patterns;

public class diamonds {
    public static void main(String[] args) {
        patten(4);
    }

    public static void patten(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            int totalCloumRow = row > n ? 2 * n - row : row;
            int noOfSpece = n - totalCloumRow;
            for (int s = 0; s < noOfSpece; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCloumRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
