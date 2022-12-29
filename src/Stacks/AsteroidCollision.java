package Stacks;

// Question link -> https://leetcode.com/problems/asteroid-collision/

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {-2, -2, 1,-2};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < asteroids.length) {
            if (!st.empty() && asteroids[i] < 0 && st.peek() > 0) {
//            collision happened
                int peeked = st.peek();
                int current = asteroids[i];
                if (peeked == Math.abs(current)) {
                    st.pop();
                    i++;
                } else if (peeked > Math.abs(current)) {
//                negative number will explode
//                do not need to remove the positive number in the stack
                    i++;
                } else if (peeked < Math.abs(current)) {
//              not deleted the index because it is collision in further elements
                    st.pop();
                }
            } else {
//              If not any collision simply add in the stack
                st.add(asteroids[i]);
                i++;
            }
        }

//        add the stack to reveres order print
        int[] ans = new int[st.size()];
        int x = st.size() - 1;
        while (!st.empty()) {
            ans[x] = st.pop();
            x--;
        }
        return ans;
    }
}
