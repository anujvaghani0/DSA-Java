package Patterns; 

public class pattern21 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        int ans = 0;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print((ans + 1) + " ");
                ans++;
            }
            System.out.println();
        }
    }
}
