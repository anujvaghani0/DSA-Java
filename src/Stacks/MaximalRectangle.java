package Stacks;

// Question link -> https://leetcode.com/problems/maximal-rectangle/

import java.util.Stack;

public class MaximalRectangle {
    public static void main(String[] args) {
        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}};
        System.out.println(maximalRectangle(matrix));
    }

    public static int maximalRectangle(char[][] matrix) {
        int[] ans = new int[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            ans[j] = matrix[0][j] - '0';
        }
        int max = largestRectangleArea(ans);
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] - '0' == 0) {
                    ans[j] = 0;
                } else {
                    ans[j] += matrix[i][j] - '0';
                }
            }
            max = Math.max(max, largestRectangleArea(ans));
        }
        return max;
    }

    public static int largestRectangleArea(int[] heights) {
        int[] left = leftside(heights.length, heights);
        int[] right = rightside(heights, heights.length);
        int max = 0;
        for (int k = 0; k < heights.length; k++) {
            left[k] = ((right[k] - left[k]) - 1) * heights[k];
            if (left[k] > max) {
                max = left[k];
            }
        }
        return max;
    }

    public static int[] rightside(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> sti = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (st.empty()) {
                ans[i] = n;
            } else if (st.size() > 0 && st.peek() < arr[i]) {
                ans[i] = sti.peek();
            } else if (st.size() > 0 && st.peek() >= arr[i]) {
                while (st.size() > 0 && st.peek() >= arr[i]) {
                    st.pop();
                    sti.pop();
                }
                if (st.size() == 0) {
                    ans[i] = n;
                } else {
                    ans[i] = sti.peek();
                }
            }
            st.push(arr[i]);
            sti.push(i);
        }
        return ans;
    }

    public static int[] leftside(int n, int[] arr) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> sti = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.empty()) {
                ans[i] = -1;
            } else if (st.size() > 0 && st.peek() < arr[i]) {
                ans[i] = sti.peek();
            } else if (st.size() > 0 && st.peek() >= arr[i]) {
                while (st.size() > 0 && st.peek() >= arr[i]) {
                    st.pop();
                    sti.pop();
                }
                if (st.size() == 0) {
                    ans[i] = -1;
                } else {
                    ans[i] = sti.peek();
                }
            }
            st.push(arr[i]);
            sti.push(i);
        }
        return ans;
    }
}
