package Math;

public class CountTheDigitsThatDivideANumber {
    public static void main(String[] args) {
        System.out.println(countDigits(7));
    }

    public static int countDigits(int num) {
        int temp = num;
        int count = 0;
        while (num != 0) {
            int rem = num % 10;
            if (temp % rem == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
