package Stacks;

// Question link -> https://leetcode.com/problems/next-greater-element-ii/

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 3, 2};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int size = (n * 2) - 1;
        int k = n - 1;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        while (size >= 0) {
            int index = size % n;
            while (!st.empty() && st.peek() <= nums[index]) {
                st.pop();
            }
            if (size < n) {
                if (!st.isEmpty() && st.peek() > nums[index]) {
                    ans[k] = st.peek();
                }
                k--;
            }
            st.push(nums[index]);
            size--;
        }
        return ans;
    }
}
