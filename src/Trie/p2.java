package Trie;

import java.util.HashMap;
import java.util.Map;

public class p2 {
    public static void main(String[] args) {
        int[] arr = {1, 10, 34, 1, 25, 56, 1, 9};
        System.out.println(maximumFreq(arr));
    }

    public static int maximumFreq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maximum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
                maximum = Math.max(maximum, map.get(arr[i]));
            } else {
                map.put(arr[i], 1);
            }
        }


//        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
//            maximum = Math.max(e.getValue(), maximum);
//        }
        return maximum;
    }
}
