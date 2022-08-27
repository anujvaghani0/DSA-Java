package Patterns;

public class p31 {
    public static void main(String[] args) {
        patten(4);
    }

    public static void patten(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int everyIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(everyIndex + " ");
            }
            System.out.println();
        }
    }
}
