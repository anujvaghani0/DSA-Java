package Searching;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
    }

    public static int arrangeCoins(int n) {
        int ans = 1;
        while (n > 0) {
            ans++;
            n = n - ans;
        }
        return ans - 1;
    }
}
