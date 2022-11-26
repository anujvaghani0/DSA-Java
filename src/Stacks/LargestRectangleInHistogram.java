package Stacks;

// Question link -> https://leetcode.com/problems/largest-rectangle-in-histogram/

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(arr));
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
//                ans[i] = st.peek();
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
