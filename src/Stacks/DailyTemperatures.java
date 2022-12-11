package Stacks;

// Question link -> https://leetcode.com/problems/daily-temperatures/

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> sti = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (st.empty()) {
                ans[i] = 0;
            } else if (st.size() > 0 && st.peek() > temperatures[i]) {
                ans[i] = Math.abs((i - sti.peek()));
            } else if (st.size() > 0 && st.peek() <= temperatures[i]) {
                while (st.size() > 0 && st.peek() <= temperatures[i]) {
                    st.pop();
                    sti.pop();
                }
                if (st.size() == 0) {
                    ans[i] = 0;
                } else {
                    ans[i] = Math.abs((i - sti.peek()));
                }
            }
            st.push(temperatures[i]);
            sti.push(i);
        }
        return ans;
    }
}
