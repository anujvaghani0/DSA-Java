package Math;

// Question link -> https://leetcode.com/problems/smallest-value-after-replacing-with-sum-of-prime-factors/

public class SmallestValueAfterReplacingWithSumOfPrimeFactors {
    public static void main(String[] args) {
        System.out.println(smallestValue(4));
//        smallestValue(15);
    }

    public static int smallestValue(int n) {
        if (n == 0 || n == 4) {
            return 4;
        }
        return factors(n);
    }

    private static int factors(int n) {
        int i, sum = 0;
        for (i = 2; i <= n; i++) {
            while (n % i == 0) {
                sum += i;
                n /= i;
            }
        }
        return isPrime(sum) ? sum : factors(sum);
    }

    private static boolean isPrime(int sum) {
        for (int i = 2; i < sum / 2; i++) {
            if (sum % i == 0) return false;
        }
        return true;
    }
}
