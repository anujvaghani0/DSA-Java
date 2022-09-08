package Math;

public class PowerofFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(4));
    }

    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        if ((n & (n - 1)) != 0) {
            return false;
        }
        return (n - 1) % 3 == 0;
    }
}