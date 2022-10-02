package Arrays;

public class DistanceBetweenBusStops {
    public static void main(String[] args) {
        int[] d = {8, 11, 6, 7, 10, 11, 2};
        System.out.println(distanceBetweenBusStops(d, 0, 3));
    }

    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        int ans = 0;
        int total = 0;
        for (int i = 0; i < distance.length; i++) {
            if (i >= start && i < destination) {
                ans += distance[i];
            }
            total += distance[i];
        }
        return Math.min(ans, total - ans);
    }
}