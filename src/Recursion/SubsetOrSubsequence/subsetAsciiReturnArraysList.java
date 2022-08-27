package Recursion.SubsetOrSubsequence;

import java.util.ArrayList;

public class subsetAsciiReturnArraysList {
    public static void main(String[] args) {
        System.out.println(subset("", "abc"));
    }

    public static ArrayList<String> subset(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subset(p + ch, up.substring(1));
        ArrayList<String> second = subset(p, up.substring(1));
        ArrayList<String> third = subset(p + (ch + 0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
