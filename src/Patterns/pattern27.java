package Patterns; 

public class pattern27 {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {
        int left = 1;
        int k = n;
        int value = n * (n - 1) + n + 1;
        int right = value;
        for (int row = 0; row < n; row++) {
            for (int s = 0; s < row; s++) {
                System.out.print("  ");
            }
            for (int col = n - row; col > 0; col--) {
                System.out.print(left + " ");
                left++;
            }
            for (int col = 0; col < n - row; col++) {
                System.out.print(right + " ");
                right++;
            }
            System.out.println();
            k--;
            right = value - k;
            value = right;
        }
    }
}
