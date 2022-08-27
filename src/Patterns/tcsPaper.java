package Patterns;

public class tcsPaper {
    public static void main(String[] args) {
        patten(5);
    }

    public static void patten(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
