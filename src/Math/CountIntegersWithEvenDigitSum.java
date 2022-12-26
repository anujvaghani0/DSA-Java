package Math;

public class CountIntegersWithEvenDigitSum {
    public static void main(String[] args) {

    }

    public static int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (sum(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean sum(int nums) {
        int sum = 0;
        while (nums > 0) {
            sum += nums % 10;
            nums = nums / 10;
        }
        return sum % 2 == 0;
    }
}
