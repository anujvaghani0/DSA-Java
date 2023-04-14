package LinkedList;

import java.util.Arrays;

public class SpiralMatrixIV {
    public static void main(String[] args) {

    }

    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        for (int[] row : ans) {
            Arrays.fill(row, -1);
        }

        int top = 0;
        int left = 0;
        int right = n - 1;
        int bottom = m - 1;

        while (head != null) {
            for (int i = left; i <= right && head != null; i++) {
                ans[top][i] = head.val;
                head = head.next;
            }
            top++;

            for (int i = top; i <= bottom && head != null; i++) {
                ans[i][right] = head.val;
                head = head.next;
            }
            right--;


            for (int i = right; i >= left && head != null; i--) {
                ans[bottom][i] = head.val;
                head = head.next;
            }
            bottom--;

            for (int i = bottom; i >= top && head != null; i--) {
                ans[i][left] = head.val;
                head = head.next;
            }
            left++;
        }
        return ans;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
