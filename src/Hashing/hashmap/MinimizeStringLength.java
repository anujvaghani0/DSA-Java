package Hashing.hashmap;

import java.util.HashMap;

public class MinimizeStringLength {
    public static void main(String[] args) {
        System.out.println(minimizedStringLength("aaabc"));
    }

    public static int minimizedStringLength(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (map.containsKey(s)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        return map.size();
    }
}
