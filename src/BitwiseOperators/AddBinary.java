package BitwiseOperators;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        StringBuilder s1 = new StringBuilder(a);
        StringBuilder s2 = new StringBuilder(b);
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        s1.reverse();
        s2.reverse();
        int i = 0;
        int sum;
        while (i < s1.length() || i < s2.length()) {
            sum = carry;
            if (i < s1.length()) {
                sum += s1.charAt(i) - '0';
            }
            if (i < s2.length()) {
                sum += s2.charAt(i) - '0';
            }
            if (sum == 0) {
                carry = 0;
                ans.append('0');
            }
            if (sum == 1) {
                carry = 0;
                ans.append('1');
            }
            if (sum == 2) {
                carry = 1;
                ans.append('0');
            }
            if (sum == 3) {
                carry = 1;
                ans.append('1');
            }
            i++;
        }
        if (carry == 1) {
            ans.append('1');
        }
        ans.reverse();
        return ans.toString();
    }
}
