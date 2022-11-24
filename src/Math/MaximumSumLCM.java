package Math;

// Question link -> https://practice.geeksforgeeks.org/problems/maximum-sum-lcm3025/1

public class MaximumSumLCM {
    public static void main(String[] args) {
        System.out.println(maxSumLCM(12));
    }

    public static long maxSumLCM(int n) {
        long sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) {
                    sum += n / i;
                }
            }
        }
        return sum;
    }
}