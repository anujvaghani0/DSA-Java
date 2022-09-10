package Math;

public class PowerofThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(-1));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            int r = n % 3;
            n = n / 3;
            if (r != 0) {
                return false;
            }
        }
        return true;
    }
}
