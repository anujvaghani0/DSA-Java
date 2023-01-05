package GreedyAlgorithm;

import java.util.Arrays;

public class MinimumNumberOfArrowsToBurstBalloons {
    public static void main(String[] args) {
        int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        System.out.println(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int results = 1;
        int previous = 0;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[previous][1]) {
                results++;
                previous = i;
            }
        }
        return results;
    }
}
