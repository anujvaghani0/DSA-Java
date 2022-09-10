package Arrays;

public class palindrome {
    public static void main(String[] args) {
        int n = -121;
        System.out.println(palindrome(n));
    }

    public static boolean palindrome(int n) {
        int ans = 0;
        int temp = n;
        while (n > 0) {
            int r = n % 10;
            ans = (ans * 10) + r;
            n = n / 10;
        }
        if (ans == temp) {
            return true;
        }
        return false;
    }
}
