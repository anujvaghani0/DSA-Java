package Hashing.hashmap; 

// Question link -> https://leetcode.com/problems/keyboard-row/

import java.util.*;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        HashMap<Character, Integer> st1 = new HashMap<>();
        HashMap<Character, Integer> st2 = new HashMap<>();
        HashMap<Character, Integer> st3 = new HashMap<>();
        String a = "qwertyuiopQWERTYUIOP";
        String b = "asdfghjklASDFGHJKL";
        String c = "zxcvbnmZXCVBNM";
        for (int i = 0; i < a.length(); i++) {
            st1.put(a.charAt(i), i);
        }
        for (int i = 0; i < b.length(); i++) {
            st2.put(b.charAt(i), i);
        }
        for (int i = 0; i < c.length(); i++) {
            st3.put(c.charAt(i), i);
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            for (int j = 0; j < temp.length(); j++) {
                if (st1.get(temp.charAt(j)) != null) {
                    count1++;
                } else if (st2.get(temp.charAt(j)) != null) {
                    count2++;
                } else if (st3.get(temp.charAt(j)) != null) {
                    count3++;
                }
            }
            if (count1 != 0 && count2 == 0 && count3 == 0) {
                ans.add(temp);
            } else if (count1 == 0 && count2 != 0 && count3 == 0) {
                ans.add(temp);
            } else if (count1 == 0 && count2 == 0 && count3 != 0) {
                ans.add(temp);
            }
        }
        return ans.toArray(new String[0]);
    }
}
