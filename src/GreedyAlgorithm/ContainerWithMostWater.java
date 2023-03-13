package GreedyAlgorithm;

public class ContainerWithMostWater {
    public static void main(String[] args) {

    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = Integer.MIN_VALUE;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);

            if (height[left] > height[right]) {
                right--;
            } else if (height[right] > height[left]) {
                left++;
            } else {
                left++;
            }
        }
        return max;
    }
}
