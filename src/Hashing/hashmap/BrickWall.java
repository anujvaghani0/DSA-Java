package Hashing.hashmap;

import java.util.HashMap;
import java.util.List;

public class BrickWall {
    public static void main(String[] args) {

    }

    public static int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxUntouched = 0;

        for (List<Integer> row : wall) {
            int brickEND = 0;
            for (int i = 0; i < row.size() -1; i++) {
                brickEND += row.get(i);
                if (map.containsKey(brickEND)) {
                    map.put(brickEND, map.get(brickEND) + 1);
                } else {
                    map.put(brickEND, 1);
                }
                maxUntouched = Math.max(maxUntouched, map.get(brickEND));

            }
        }
        return wall.size() - maxUntouched;
    }
}
