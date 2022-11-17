package GreedyAlgorithm;

//question link -> https://leetcode.com/problems/minimum-suffix-flips/

public class MinimumSuffixFlips {
    public static void main(String[] args) {
        System.out.println(minFlips("101"));
    }

    public static int minFlips(String target) {
        int count = 0;
        char current = '0';
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != current) {
                count++;
                current = target.charAt(i);
            }
        }
        return count;
    }
}
