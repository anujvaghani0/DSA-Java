package Graph.BFS_DFS; 

// Question link -> https://leetcode.com/problems/jump-game-iii/

import java.util.LinkedList;
import java.util.Queue;

public class JumpGameIII {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 1, 2};
        System.out.println(canReach(arr, 2));
    }

    public static boolean canReach(int[] arr, int start) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(start);

        while (!qu.isEmpty()) {
            int index = qu.peek();
            qu.remove();

//            If getting the ans return true
            if (arr[index] == 0) {
                return true;
            }

            int right = index + arr[index];
            int left = index - arr[index];

//            mark the visited index -1
            arr[index] = -1;

            if (right < arr.length && arr[right] != -1) {
                qu.add(right);
            }
            if (left >= 0 && arr[left] != -1) {
                qu.add(left);
            }
        }
        return false;
    }
}
