package Math;

import java.util.Arrays;

public class ClosestPrimeNumbersInRange {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(closestPrimes(19, 31)));
    }

    public static int[] closestPrimes(int left, int right) {
        int[] ans = new int[2];
        int[] temp1 = prime(right);
        int minimum = Integer.MAX_VALUE;
//        int[] temp2=prime(left);
        for (int i = 0; i < temp1.length - 1; i++) {
            if (temp1[i] > left && temp1[i + 1] > right) {
                int temp = Math.min(left-Math.abs(temp1[i] - temp1[i + 1]), right-Math.abs(temp1[i+1] - temp1[i]));
                if (minimum > temp) {
                    ans[0] = temp1[i];
                    ans[1] = temp1[i + 1];
                    minimum = temp;
                }
            }
        }
        return ans;

    }

    private static int[] prime(int num) {
        int[] primes = new int[num];
        int ncounter = 0;
        int isPrime = 2;
        while (ncounter < num) {
            boolean prime = true;
            for (int j = 2; j < isPrime; j++) {
                if (isPrime % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primes[ncounter] = isPrime;
                ncounter++;
            }
            isPrime++;
        }
        return primes;
    }
}
