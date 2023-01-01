package Math;

import java.util.HashSet;

public class DistinctPrimeFactorsOfProductOfArray {
    public static void main(String[] args) {
        int[] nums = {2,4,3,7,10,6};
        System.out.println(distinctPrimeFactors(nums));
    }

    public static int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> primes = new HashSet<>();
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int prime : primes) {
                if (nums[i] % prime == 0 || prime % nums[i] == 0) {
                    set.add(prime);
                }
            }
        }
        return set.size();
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

