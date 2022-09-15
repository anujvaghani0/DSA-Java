package Arrays;

public class MaximizeDistanceToClosestPerson {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 1};
        System.out.println(maxDistToClosest(arr));
    }

    public static int maxDistToClosest(int[] seats) {
        if (seats == null) {
            return 0;
        }
        int max = 1;
        int left = 0;
        int right = 0;
        while (right < seats.length) {
            while (left < seats.length && seats[left] == 1) {
                left++;
            }
            right = left;
            while (right < seats.length && seats[right] == 0) {
                right++;
            }
            max = Math.max((right - left + 1) / 2, max);
            if ((right == seats.length && seats[right - 1] == 0) || (left == 0 && seats[left] == 0)) {
                max = Math.max(right - left, max);
            }
            left++;
        }
        return max;
    }
}
