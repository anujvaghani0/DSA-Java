package Arrays;

public class MinimumTimeVisitingAllPoints {
    public static void main(String[] args) {
        int[][] ans = {{1, 1}, {3, 4}, {-1, 0}};
        System.out.println(minTimeToVisitAllPoints(ans));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int a = points[i + 1][0];
            int b = points[i + 1][1];
            time += Math.max(Math.abs(a - x), Math.abs(b - y));
        }
        return time;
    }
}
