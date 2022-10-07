package Strings;

//question link -> https://leetcode.com/problems/apply-discount-to-prices/

import java.util.Arrays;

public class ApplyDiscountToPrices {
    public static void main(String[] args) {
        String sentence = "ka3caz4837h6ada4 r1 $602";
        System.out.println(discountPrices(sentence, 9));
    }

    public static String discountPrices(String sentence, int discount) {
        String[] temp = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].charAt(0) == '$') {
                for (int j = temp[i].length() - 1; j >= 0; j--) {
                    continue;
                }
            } else if (temp[i].charAt(0) == '$') {
                double digit = Double.parseDouble(temp[i].substring(1, temp[i].length()));
                double sum = (discount * digit) / 100;
                temp[i] = "$" + String.format("%.2f", digit - sum);
            }
        }
//        for (int i=0;i<temp.length;i++){
//            ans.append(temp[i]).append(" ");
//        }
//
//        return ans.toString();
        return String.join(" ", temp);
    }
}
