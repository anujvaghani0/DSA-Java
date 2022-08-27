package Arrays;

public class MaximumProductOfThreeNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4};
        int ans = maximumProduct(nums);
        System.out.println(ans);
    }

    public static int maximumProduct(int[] arr) {
        if (arr.length < 3) {
            return -1;
        }
        int minFirst = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minFirst) {
                minSecond = minFirst;
                minFirst = arr[i];
            } else if (arr[i] <= minSecond) {
                minSecond = arr[i];
            }
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        return Math.max(minFirst * minSecond * first, first * second * third);
    }
}
