package LinkedList;

public class DeleteTheMiddleNodeOfALinkedList {
    public static void main(String[] args) {

    }

    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode current = head;
        ListNode next;
        if (head.next == null) {
            head = head.next;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        while (current != null) {
            if (current.next == slow) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
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
