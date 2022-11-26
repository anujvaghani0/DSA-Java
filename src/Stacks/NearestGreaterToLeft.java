package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreaterToLeft {
    public static void main(String[] args) {
    int[] arr={2, 3, 4, 5, 1};
        System.out.println(Arrays.toString(GreaterToLeft(arr, arr.length)));
    }

    public static int[] GreaterToLeft(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.empty()) {
                ans[i] = -1;
            } else if (st.size() > 0 && st.peek() > arr[i]) {
                ans[i] = st.peek();
            } else if (st.size() > 0 && st.peek() <= arr[i]) {
                while (st.size() > 0 && st.peek() <= arr[i]) {
                    st.pop();
                }
                if (st.size() == 0) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                }
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
