package Math;

// Question link -> https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number/

import java.util.Arrays;

public class FindThreeConsecutiveIntegersThatSumToAGivenNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfThree(33)));
    }

    public static long[] sumOfThree(long num) {
        long n = num / 3;

        if (n * 3 != num) {
            return new long[]{};
        }
        long[] ans = new long[3];
        ans[0] = n - 1;
        ans[1] = n;
        ans[2] = n + 1;
        return ans;
    }
}
