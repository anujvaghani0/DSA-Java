package Hashing.hashmap; 

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Implementation {
    public static void main(String[] args) {
//      Implementation
        HashMap<String, Integer> map = new HashMap<>();

//        Insert
        map.put("USA", 10);
        map.put("INDIA", 12);
        map.put("DUBAI", 15);
        map.put("CANADA", 20);
//        map.put("INDIA",20);

//        The map has Unordered printing
        System.out.println(map);

//        search
        if (map.containsKey("INDIA")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("INDIA"));
        System.out.println(map.get("UK"));
        System.out.println();

//        for loop in the hashmap
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + " -> ");
            System.out.println(e.getValue());
        }

//        Using set method printing a hashmap
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + "->" + map.get(key));
        }
//        remove the key value on the map
        map.remove("DUBAI");
    }
}
