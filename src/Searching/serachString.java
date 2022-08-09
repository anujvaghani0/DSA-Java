package Searching;

import java.util.Arrays;

public class serachString {
    public static void main(String[] args) {
        String name = "anujvaghani";
        char target = 's';
        boolean ans = serach(name, target);
        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean serach(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
