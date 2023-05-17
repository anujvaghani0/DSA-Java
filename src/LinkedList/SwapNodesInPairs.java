package LinkedList;

public class SwapNodesInPairs {
    public static void main(String[] args) {

    }


    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
    
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        while (true) {
            int current = temp2.val;
            temp2.val = temp1.val;
            temp1.val = current;
            if (temp2.next != null) {
                temp1 = temp2.next;
            } else {
                return head;
            }
            if (temp1.next != null) {
                temp2 = temp1.next;
            } else {
                return head;
            }
        }
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
