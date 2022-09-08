package Math;

public class NumberofDigitOne {
    public static void main(String[] args) {
        System.out.println(countDigitOne(21));
    }

    public static int countDigitOne(int n) {
        int count = 0;
        for (long k = 1; k <= n; k *= 10) {
            long r = n / k;
            long m = n % k;
            count += (r + 8) / 10 * k + (r % 10 == 1 ? m + 1 : 0);
        }
        return count;
    }
}
