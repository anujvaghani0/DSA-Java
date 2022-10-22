package LinkedList.Questions.EASY;


public class main {

    public static class ListNode {
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

    public static ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }
        if (length == 0) {
            return null;
        }

        ListNode f = head;
        ListNode s = head;
        while (length > 0) {
            s = s.next;
            length--;
        }

        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return f;
    }

    public static int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ListNode head = convertArrayToLinkedList(new int[]{1, 2, 4});
//        ListNode head1 = convertArrayToLinkedList(new int[]{1, 3, 4});
        System.out.println(printLinkedList(head));
        head = detectCycle(head);
        System.out.println(printLinkedList(head));
    }

    private static String printLinkedList(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append(", ");
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