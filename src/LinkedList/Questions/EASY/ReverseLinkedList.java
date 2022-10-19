package LinkedList.Questions.EASY;

//question link -> https://leetcode.com/problems/reverse-linked-list/

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head==null){
            return head;
        }
        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = previous;
            previous = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return previous;
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
