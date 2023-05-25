package Recursion;

public class FindThePunishmentNumberOfAnInteger {
    public static void main(String[] args) {
        System.out.println(punishmentNumber(100));
    }

    public static int punishmentNumber(int n) {
        int temp = 1;
        for (int i = 10; i <= n; i++) {
            String s = "" + (i * i);

            if (check(s, i)) {
                temp = temp + (i * i);
            }
        }
        return temp;
    }

    private static boolean check(String s, int t) {
        if (s.length() == 0 && t == 0) {
            return true;
        }
        if (s.length() == 0) {
            return false;
        }
        if (Integer.parseInt(s) == t) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            int k = Integer.parseInt(s.substring(0, i + 1));

            if (check(s.substring(i + 1), t - k)) {
                return true;
            }
        }
        return false;
    }
}
