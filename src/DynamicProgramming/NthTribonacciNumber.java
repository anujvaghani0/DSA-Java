package DynamicProgramming;

import java.util.Arrays;

public class NthTribonacciNumber {
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

    public static int tribonacci(int n) {
        int[] tribonacci = new int[n + 1];
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        tribonacci[0] = 0;
        tribonacci[1] = 1;
        tribonacci[2] = 1;
        for (int i = 3; i < n+1; i++) {
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
        }
        System.out.println(Arrays.toString(tribonacci));
        return tribonacci[n];
    }
}
