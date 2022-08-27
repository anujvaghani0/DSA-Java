package Recursion.BasicRecursion;

public class countZero {
    public static void main(String[] args) {
        int number = 120002350;
        System.out.println(count(number));
    }

    public static int count(int n) {
        return helper(n, 0);
    }

    public static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, count + 1);
        } else {
            return helper(n / 10, count);
        }
    }
//    public static int count(int n) {
//        int count = 0;
//        while (n > 0) {
//            int rem = n % 10;
//            if (rem == 0) {
//                count++;
//            }
//            n = n / 10;
//        }
//        return count;
//    }


}
