package LinkedList.Questions.EASY;

//question link -> https://leetcode.com/problems/middle-of-the-linked-list/

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
