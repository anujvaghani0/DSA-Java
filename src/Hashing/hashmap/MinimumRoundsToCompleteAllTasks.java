package Hashing.hashmap;

import java.util.HashMap;

public class MinimumRoundsToCompleteAllTasks {
    public static void main(String[] args) {
        int[] tasks = {2, 2, 3, 3, 2, 4, 4, 4, 4, 4};
        System.out.println(minimumRounds(tasks));
    }

    public static int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            if (map.containsKey(tasks[i])) {
                map.put(tasks[i], map.get(tasks[i]) + 1);
            } else {
                map.put(tasks[i], 1);
            }
        }
        int ans = 0;
        for (Integer val : map.values()) {
            int freq = val;
            if (freq < 2) {
                return -1;
            } else if (freq == 2) {
                ans += 1;
            } else {
                double temp = freq / 3.0;
                ans += Math.ceil(temp);
            }
        }
        return ans;
    }
}
