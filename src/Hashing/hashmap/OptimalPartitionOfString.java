package Hashing.hashmap;

import java.util.HashMap;

public class OptimalPartitionOfString {
    public static void main(String[] args) {
        System.out.println(partitionString("abacaba"));
    }

    public static int partitionString(String s) {
        int index = 0;
        int count = 0;
        HashMap<Character, Boolean> map = new HashMap<>();
        while (index < s.length()) {
            if (map.containsKey(s.charAt(index))) {
                count++;
                map.clear();
            }
            map.put(s.charAt(index++), true);
        }
        return count + 1;
    }
}
