package Stacks;

// Question link -> https://leetcode.com/problems/sliding-window-maximum/

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] ans = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(maxSlidingWindow(ans, 3)));
    }

    public static int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] temp = new int[arr.length];
        int[] ans = new int[arr.length - k + 1];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (st.empty()) {
                temp[i] = n;
            } else if (st.size() > 0 && arr[st.peek()] > arr[i]) {
                temp[i] = st.peek();
            } else if (st.size() > 0 && arr[st.peek()] <= arr[i]) {
                while (st.size() > 0 && arr[st.peek()] <= arr[i]) {
                    st.pop();
                }
                if (st.size() == 0) {
                    temp[i] = n;
                } else {
                    temp[i] = st.peek();
                }
            }
            st.push(i);
        }

        int j = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            if (j < i) {
                j = i;
            }

            while (temp[j] < i + k) {
                j = temp[j];
            }
            ans[i] = arr[j];
        }
        return ans;
    }

}