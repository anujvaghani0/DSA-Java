package Arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTheNumberIsFascinating {
    public static void main(String[] args) {

    }

    public static boolean isFascinating(int n) {
        String n2 = String.valueOf(2 * n);
        String n3 = String.valueOf(3 * n);
        String str = n + n2 + n3;
        if (str.contains("0")) {
            return  false;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add((int) str.charAt(i));
        }

        if (set.size() != str.length()) {
            return  false;
        }

        return  true;

    }
}
