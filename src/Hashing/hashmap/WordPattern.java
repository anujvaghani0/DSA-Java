package Hashing.hashmap; 

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] temp = s.split(" ");
        if (temp.length != pattern.length()) return false;
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char a = pattern.charAt(i);
            if (!map.isEmpty() && map.containsKey(a) && !map.get(a).equals(temp[i])) {
                return false;
            }
            if (!map.isEmpty() && map.containsKey(a) && map.get(a).equals(temp[i])) {
                continue;
            }
            if (!map.isEmpty() && map.containsValue(temp[i])) {
                return false;
            }
            map.put(a, temp[i]);
        }
        return true;
    }
}
