package Strings;

public class LongPressedName {
    public static void main(String[] args) {
        String name = "saeed";
        String typed = "ssaaedd";
        System.out.println(isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) {
            return false;
        }
        int n = 0;
        int t = 0;
        while (n < name.length() && t < typed.length()) {
            char c = name.charAt(n);
            if (c != typed.charAt(t)) {
                return false;
            }
            int countInName = 0;
            int countInTyped = 0;
            while (n < name.length() && name.charAt(n) == c) {
                n++;
                countInName++;
            }
            while (t < typed.length() && typed.charAt(t) == c) {
                t++;
                countInTyped++;
            }
            if (countInName > countInTyped) {
                return false;
            }
        }
        if (n == name.length() && t == typed.length()) {
            return true;
        } else {
            return false;
        }
    }
}
