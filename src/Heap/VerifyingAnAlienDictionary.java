package Heap;

import java.util.HashMap;
import java.util.Map;

public class VerifyingAnAlienDictionary {
    public static void main(String[] args) {
        String[] words = {"hello", "leetcode"};
        System.out.println(isAlienSorted(words, "hlabcdefgijkmnopqrstuvwxyz"));
    }

    public static boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }

        for (int i = 1; i < words.length; i++) {
            String a = words[i - 1], b = words[i];
            for (int j = 0; j < a.length(); j++) {
                if (j == b.length()) {
                    return false;
                }
                char achar = a.charAt(j), bchar = b.charAt(j);
                if (map.get(achar) < map.get(bchar)) {
                    break;
                }
                if (map.get(achar) > map.get(bchar)) {
                    return false;
                }
            }
        }
        return true;
    }
}