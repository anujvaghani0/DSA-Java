package Strings;

public class DigitsOfStringAfterConvert {
    public static void main(String[] args) {
        System.out.println(getLucky("leetcode", 2));
    }

    public static int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(Integer.toString(s.charAt(i) - 'a' + 1));
        }
        int ans = 0;
        while (k != 0) {
            ans = 0;
            for (int i = 0; i < sb.length(); i++) {
                ans += sb.charAt(i) - '0';
            }
            sb.delete(0, sb.length());
            sb.append(Integer.toString(ans));
            k--;
        }
        return ans;
    }
}