package LinkedList;

import java.util.HashSet;

public class LinkedListComponents {
    public static void main(String[] args) {

    }

    public static int numComponents(ListNode head, int[] nums) {
        ListNode current = head;
        HashSet<Integer> set = new HashSet<>();

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        boolean flag = false;

        while (current != null) {
            while (current != null && set.contains(current.val)) {
                flag = true;
                current = current.next;
            }

            if (flag) {
                count++;
            }
            flag = false;

            if (current != null) {
                current = current.next;
            }
        }
        return count;
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
