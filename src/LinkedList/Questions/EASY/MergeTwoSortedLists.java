package LinkedList.Questions.EASY;

//question link -> https://leetcode.com/problems/merge-two-sorted-lists/

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = new ListNode();
        ListNode prev = result;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        if (l1 != null) {
            prev.next = l1;
        }
        if (l2 != null) {
            prev.next = l2;
        }
        return result.next;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode() {
            new ListNode(0);
        }

        @Override
        public String toString() {
            return printLinkedList(this);
        }
    }
    public static void main(String[] args) {
        ListNode head = convertArrayToLinkedList(new int[]{1, 2, 4});
        ListNode head1 = convertArrayToLinkedList(new int[]{1,3,4});
        System.out.println(printLinkedList(head));
        head = mergeTwoLists(head,head1);
        System.out.println(printLinkedList(head));
    }

    private static String printLinkedList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val + ", ");
            head = head.next;
        }
        return sb.substring(0, sb.length() - 2);
    }

    private static ListNode convertArrayToLinkedList(int[] input) {
        ListNode head = new ListNode();
        ListNode dummy = head;
        for (int num : input) {
            ListNode temp = new ListNode(num);
            head.next = temp;
            head = head.next;
        }
        return dummy.next;
    }
}
