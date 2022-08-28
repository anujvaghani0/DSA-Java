package Recursion.SubsetOrSubsequence;

import java.util.ArrayList;

public class LetterCombinationsOfAPhoneNumberReturnArraysList {
    public static void main(String[] args) {
        System.out.println(phonePed("", "12"));
    }

    public static ArrayList<String> phonePed(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(phonePed(p + ch, up.substring(1)));
        }
        return ans;
    }
}
