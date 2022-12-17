package Math;

// Question link -> https://practice.geeksforgeeks.org/problems/break-a-number5913/1

public class BreakANumber {
    public static void main(String[] args) {
        System.out.println(waysToBreakNumber(2));
    }

    static long mod = (long) 1e9 + 7;

    public static int waysToBreakNumber(int N) {
        long n = N;
        return (int) (((n + 1) * (n * 2) / 2) % mod);
    }
}
