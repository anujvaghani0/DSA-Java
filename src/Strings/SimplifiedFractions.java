package Strings;

//question link -> https://leetcode.com/problems/simplified-fractions/

import java.util.ArrayList;
import java.util.List;

public class SimplifiedFractions {
    public static void main(String[] args) {
        System.out.println(simplifiedFractions(4));
    }

    public static List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<>();
        for (int denominator = 2; denominator <= n; denominator++) {
            for (int numerator = 1; numerator < denominator; numerator++) {
                if (gcd(numerator, denominator) == 1) {
                    ans.add(numerator + "/" + denominator);
                }
            }
        }
        return ans;
    }

    private static int gcd(int numerator, int denominator) {
        return numerator == 0 ? denominator : gcd(denominator % numerator, numerator);
    }
}
