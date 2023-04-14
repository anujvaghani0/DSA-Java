package Hashing.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern {
    public static void main(String[] args) {
    String[] words={"abc","deq","mee","aqq","dkd","ccc"};
        System.out.println(findAndReplacePattern(words,"abb"));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for (String s : words) {
            if (isIsomorphic(s, pattern)) {
                ans.add(s);
            }
        }
        return ans;
    }

    private static boolean isIsomorphic(String s, String pattern) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Boolean> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char S = s.charAt(i);
            char T = pattern.charAt(i);

            if (map1.containsKey(S)) {
                if (map1.get(S) != T) {
                    return false;
                }
            } else {
                if (map2.containsKey(T)) {
                    return false;
                } else {
                    map1.put(S, T);
                    map2.put(T, true);
                }
            }
        }
        return true;
    }
}
