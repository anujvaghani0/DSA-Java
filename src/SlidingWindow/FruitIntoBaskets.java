package SlidingWindow;

import java.util.HashMap;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {0, 1, 2, 1};
        System.out.println(totalFruit(fruits));
    }

    public static int totalFruit(int[] fruits) {
        int i = 0;
        int j = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (j < fruits.length) {
            if (map.containsKey(fruits[j])) {
                map.put(fruits[j], map.get(fruits[j] + 1));
            } else {
                map.put(fruits[j], 1);
            }

            while (i <= j && map.size() > 2) {
                if (map.get(fruits[i]) == 1) {
                    map.remove(fruits[i]);
                } else {
                    map.put(fruits[i], map.get(fruits[i] - 1));
                }
                i++;
            }

            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}
