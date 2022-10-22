package Math;

//question link -> https://leetcode.com/problems/integer-to-roman/

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }

    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strings = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                ans.append(strings[i]);
            }
        }
        return ans.toString();
    }
}