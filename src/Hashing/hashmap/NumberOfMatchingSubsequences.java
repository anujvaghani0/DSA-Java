package Hashing.hashmap; 

import java.util.HashMap;

public class NumberOfMatchingSubsequences {
    public static void main(String[] args) {
        String[] words = {"a", "bb", "acd", "ace"};
        System.out.println(numMatchingSubseq("abcde", words));
    }

    public static int numMatchingSubseq(String s, String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }

        int ans = 0;
        char[] ch = s.toCharArray();
        for (String str : map.keySet()) {
            char[] temp = str.toCharArray();
            int j = 0;
            int i = 0;
            while (i < ch.length && j < temp.length) {
                if (ch[i] == temp[j]) {
                    i++;
                    j++;
                } else {
                    i++;
                }
            }

            if (j == temp.length) {
                ans += map.get(str);
            }
        }
        return ans;
    }
}
