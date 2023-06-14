package DynamicProgramming; 

// Question link -> https://leetcode.com/problems/rotated-digits/

public class RotatedDigits {
    public static void main(String[] args) {
        System.out.println(rotatedDigits(10));
    }

    public static int rotatedDigits(int n) {
        int[] arr = new int[10];
        int[] dp = new int[n + 1];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                arr[i] = 5;
            } else if (i == 5) {
                arr[i] = 2;
            } else if (i == 6) {
                arr[i] = 9;
            } else if (i == 9) {
                arr[i] = 6;
            } else if (i == 0 || i == 1 || i == 8) {
                arr[i] = i;
            } else {
                arr[i] = -1;
            }
        }


        for (int i = 1; i < dp.length; i++) {
            int lastDigit = i % 10;
            int previous = dp[i / 10];
            if (arr[lastDigit] == -1 || previous == -1) {
                dp[i] = -1;
                continue;
            }
            int reminder = previous * 10 + arr[lastDigit];
            dp[i] = reminder;
            count += reminder == i ? 0 : 1;
        }
        return count;
    }
}
