package Patterns;

public class pattenPaper {
    public static void main(String[] args) {
        patten(5);
    }

    public static void patten(int n) {
        for (int row = 0; row <= n * 2; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
