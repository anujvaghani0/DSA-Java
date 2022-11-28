package Math;

// Question link -> https://practice.geeksforgeeks.org/problems/add-binary-strings3805/1

public class AddBinaryStrings {
    public static void main(String[] args) {
        System.out.println(addBinary("1101","111"));
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
        int i1 = 0;
        while (ans.charAt(i1) != '1') {
            if (ans.charAt(0) == '0') {
                ans.delete(i1, i1 + 1);
            }
        }
        return ans.toString();
    }
}
