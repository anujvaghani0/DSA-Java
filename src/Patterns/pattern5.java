package Patterns;

public class pattern5 {
    public static void main(String[] args) {
        patten(5);
    }

    public static void patten(int n) {
        for (int row = 1; row < n * 2; row++) {
            int totalColum = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColum; col++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
