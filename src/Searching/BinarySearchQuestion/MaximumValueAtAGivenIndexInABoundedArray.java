package Searching.BinarySearchQuestion;

public class MaximumValueAtAGivenIndexInABoundedArray {
    public static void main(String[] args) {
        System.out.println(maxValue(4, 2, 6));
    }

    public static int maxValue(int n, int index, int maxSum) {
        long low = 1;
        long high = 10;
        long result = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long left = Sum(Math.min(index, mid - 1), mid);
            left += Math.max(0, index - mid + 1);

            long right = Sum(Math.min(n - index - 1, mid - 1), mid);
            right += Math.max(0, (n - index - mid));

            if (left + right + mid <= maxSum) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int) result;
    }

    private static long Sum(long noOfElement, long mid) {
        return mid * (noOfElement) - ((noOfElement* (noOfElement + 1)) / 2);
    }
}
