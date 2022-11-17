package Math;

public class CalculateMoneyInLeetcodeBank {
    public static void main(String[] args) {
        System.out.println(totalMoney(4));
    }

    public static int totalMoney(int n) {
        int ans = 0;
        int count = 0;
        int z = 1;
        while (count < n) {
            for (int i = z; i < 7 + z && count < n; i++) {
                ans += i;
                count++;
            }
            z++;
        }
        return ans;
    }
}