package LinkedList.Questions.MEDIUM;

//question link -> https://leetcode.com/problems/reverse-linked-list-ii/

import java.util.List;

public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            previous = current;
            current = current.next;
        }

        ListNode last = previous;
        ListNode newEnd = current;


//        Reverse between left & right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = previous;
            previous = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = previous;
        } else {
            head = previous;
        }

        newEnd.next = current;
        return head;
    }


    public class ListNode {
        int val;
        public ListNode next;

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
