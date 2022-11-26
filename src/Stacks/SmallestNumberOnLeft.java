package Stacks;

// Question link -> https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SmallestNumberOnLeft {
    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 3, 4, 5};
        System.out.println(leftSmaller(arr.length, arr));
    }

    public static List<Integer> leftSmaller(int n, int[] arr) {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.empty()) {
                ans.add(-1);
            } else if (st.size() > 0 && st.peek() < arr[i]) {
                ans.add(st.peek());
            } else if (st.size() > 0 && st.peek() >= arr[i]) {
                while (st.size() > 0 && st.peek() >= arr[i]) {
                    st.pop();
                }
                if (st.size() == 0) {
                    ans.add(-1);
                } else {
                    ans.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
