package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] ans = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] ans2 = {4, 8};
        System.out.println(Arrays.deepToString(insert(ans, ans2)));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int[] toAdd = newInterval;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] > toAdd[1]) {
                ans.add(toAdd);
                toAdd = intervals[i];
            } else if (intervals[i][1] >= toAdd[0]) {
                toAdd = new int[]{Math.min(intervals[i][0], toAdd[0]), Math.max(intervals[i][1], toAdd[1])};
            } else {
                ans.add(intervals[i]);
            }
        }
        ans.add(toAdd);
        return ans.toArray(new int[ans.size()][2]);
    }
}
