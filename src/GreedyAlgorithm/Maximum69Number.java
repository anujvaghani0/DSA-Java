package GreedyAlgorithm;

//question link -> https://leetcode.com/problems/maximum-69-number/

public class Maximum69Number {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9996));
    }

    public static int maximum69Number(int num) {
        int maximum = 0;
        String ans = String.valueOf(num);
        char[] ans1 = ans.toCharArray();
        for (int i = 0; i < ans1.length; i++) {
            if (ans1[i] == '6') {
                ans1[i] = '9';
                maximum = Math.max(maximum, Integer.parseInt(new String(ans1)));
                ans1[i] = '6';
            }
        }
        return maximum == 0 ? num : maximum;
    }
}
