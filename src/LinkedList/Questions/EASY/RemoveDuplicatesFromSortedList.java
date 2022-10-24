package LinkedList.Questions.EASY;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode node) {
        if (node == null) {
            return node;
        }
        ListNode head = node;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            }else {
                 node = node.next;
            }
        }
        return head;
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
        ListNode head = convertArrayToLinkedList(new int[]{1, 1, 3});
        System.out.println(printLinkedList(head));
        head = deleteDuplicates(head);
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
