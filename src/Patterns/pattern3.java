package Patterns;

public class pattern3 {
    public static void main(String[] args) {
        patten(5);
    }

    public static void patten(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
