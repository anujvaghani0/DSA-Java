package Patterns;

public class pattern27 {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {
        int ans = 1;
        for (int row = 0; row < n; row++) {
            for (int s = 0; s < row; s++) {
                System.out.print("  ");
            }
            for (int col = n - row; col > 0; col--) {
                System.out.print(ans + " ");
                ans++;
            }
//            for (int col = 0; col < n - row; col++) {
//                System.out.print(ans + " ");
//                ans++;
//            }

            System.out.println();
        }
    }
}
