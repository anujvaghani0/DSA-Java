package Patterns; 

public class pattern26 {
    public static void main(String[] args) {
        pattern(6);
    }

    public static void pattern(int n) {
        int ans=1;
        for (int row = 0; row < n; row++) {
            for (int col = n - row; col > 0; col--) {
                System.out.print(ans+" ");
            }
            ans++;
            System.out.println();
        }

    }
}
