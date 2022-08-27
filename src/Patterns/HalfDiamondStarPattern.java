package Patterns;

public class HalfDiamondStarPattern {
    public static void main(String[] args) {
        patten(5);
    }

    public static void patten(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            int totalCloumRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalCloumRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
