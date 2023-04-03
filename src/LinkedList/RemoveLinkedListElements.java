package LinkedList;

public class RemoveLinkedListElements {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode();
        ListNode current = ans;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val != val) {
                current.next = new ListNode(temp.val);
                current = current.next;
            }
            temp = temp.next;
        }
        return ans.next;
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
