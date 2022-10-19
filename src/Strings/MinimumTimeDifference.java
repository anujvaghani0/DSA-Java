package Strings;

//question link -> https://leetcode.com/problems/minimum-time-difference/

import java.util.List;

public class MinimumTimeDifference {
    public static void main(String[] args) {
        String[] timepoints = {"23:59", "00:00"};
        System.out.println(findMinDifference(List.of(timepoints)));
    }

    public static int findMinDifference(List<String> timePoints) {
        boolean[] visited = new boolean[24 * 60];
        for (String time : timePoints) {
            int h = Integer.parseInt(time.substring(0, 2));
            int m = Integer.parseInt(time.substring(3));
            if (visited[h * 60 + m]) return 0;
            visited[h * 60 + m] = true;
        }

        int previous = 0, minimum = Integer.MAX_VALUE;
        int first = 0, last = 0;
        int index = visited.length - 1;

        while (!visited[index]) {
            index--;
        }
        last = index;

        index = 0;
        while (!visited[index]) {
            index++;
        }
        first = index;

        previous = first;
        for (int i = first + 1; i <= last; i++) {
            if (visited[i]) {
                minimum = Math.min(minimum, i - previous);
                previous = i;
            }
        }

        minimum = Math.min(minimum, (24 * 60 - last + first));
        return minimum;
    }
}
