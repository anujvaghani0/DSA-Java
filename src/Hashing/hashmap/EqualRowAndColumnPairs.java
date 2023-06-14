package Hashing.hashmap; 

import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(equalPairs(grid));
    }

    public static int equalPairs(int[][] grid) {
        Map<String, Integer> mp = new HashMap<>();
        int n = grid.length;
        int m = grid[0].length;

        for (int j = 0; j < m; j++) {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < n; i++) {
                s.append(grid[i][j]).append(",");
            }
            if (mp.containsKey(s.toString())) {
                mp.put(s.toString(), mp.get(s.toString()) + 1);
            } else {
                mp.put(s.toString(), 1);
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < m; j++) {
                s.append(grid[i][j]).append(",");
            }
            System.out.println(s);
            if (mp.containsKey(s.toString())) {
                System.out.println(s + " " + mp.get(s.toString()));
                cnt += mp.get(s.toString());
            }
        }
        return cnt;
    }
}
