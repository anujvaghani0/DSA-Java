package Accenture;

public class p5 {
    public static void main(String[] args) {
        System.out.println(count(20, 4));
    }

    public static int count(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }
        return sum2 - sum1;
    }
}
