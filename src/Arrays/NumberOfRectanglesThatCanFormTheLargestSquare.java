package Arrays;

//question link -> https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/

public class NumberOfRectanglesThatCanFormTheLargestSquare {
    public static void main(String[] args) {
        int[][] rectangles = {{5, 8}, {3, 9}, {5, 12}, {16, 5}};
        System.out.println(countGoodRectangles(rectangles));
    }

    public static int countGoodRectangles(int[][] rectangles) {
        int[] temp = new int[rectangles.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < rectangles.length; i++) {
            temp[i] = Math.min(rectangles[i][0], rectangles[i][1]);
            max = Math.max(max, temp[i]);
        }

        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (max == temp[i]) {
                count++;
            }
        }
        return count;
    }
}
