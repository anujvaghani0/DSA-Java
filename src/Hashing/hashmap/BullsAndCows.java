package Hashing.hashmap;

import java.util.HashMap;

public class BullsAndCows {
    public static void main(String[] args) {
            System.out.println(getHint("1807","7810"));
    }

    public static String getHint(String secret, String guess) {
        StringBuilder ans = new StringBuilder();
        int countBull = 0;
        int countCow = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < secret.length(); i++) {
            if (map.containsKey(secret.charAt(i))) {
                map.put(secret.charAt(i), map.get(secret.charAt(i)) + 1);
            } else {
                map.put(secret.charAt(i), 1);
            }
        }

        int i = 0;
        while (i < secret.length()) {
            if (map.containsKey(guess.charAt(i))) {
                if (map.containsKey(secret.charAt(i))) {
                    countBull++;

                    if (map.get(guess.charAt(i)) <= 0) {
                        countCow--;
                    }
                } else {
                    if (map.get(guess.charAt(i)) > 0) {
                        countCow++;
                    }
                }
                map.put(guess.charAt(i), map.get(guess.charAt(i)) - 1);
            }
            i++;
        }
        return Integer.toString(countBull) + "A" + Integer.toString(countCow) + "B";
    }
}
