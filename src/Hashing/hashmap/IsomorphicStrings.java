package Hashing.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IsomorphicStrings {
    public static void main(String[] args) {
//        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        int n = s.length() - 1;

        while (n >= 0) {
            if (map.containsKey(s.charAt(n)) && map.get(s.charAt(n)) != t.charAt(n)) {
                return false;
            }

            if (!map.containsKey(s.charAt(n)) && set.contains(t.charAt(n))) {
                return false;
            }

            set.add(t.charAt(n));
            map.put(s.charAt(n), t.charAt(n));
            n--;
        }
        return true;
    }
}
