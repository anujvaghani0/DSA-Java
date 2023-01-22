package Math;

//question link -> https://leetcode.com/problems/add-digits/

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        while (num >= 10) {
            num = digitSum(num);
        }
        return num;
    }
//    some changes

    private static int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
}
