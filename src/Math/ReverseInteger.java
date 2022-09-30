package Math;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(321));
    }

    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int rem = x % 10;
            int temp = (10 * ans) + rem;
            if ((temp - rem) / 10 != ans) {
                return 0;
            }
            ans = temp;
            x = x / 10;
        }
        return ans;
    }
}