package Patterns;

public class pattern35 {
    public static void main(String[] args) {
    pattern(4);
    }

    public static void pattern(int n) {
        for (int row = 0; row < n; row++) {
            int left=1;
            int right=1;
            for (int col = 0; col <= (2 * n) - 1; col++) {
                if (col <= row) {
                    System.out.print(left);
                    left++;
                } else if (col < n * 2 - row - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(right);
                    right++;
                }
            }
            System.out.println();
        }
    }
}
