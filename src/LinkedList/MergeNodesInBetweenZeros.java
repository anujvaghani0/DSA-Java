package LinkedList;

public class MergeNodesInBetweenZeros {
    public static void main(String[] args) {

    }

    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode();
        ListNode temp = ans;
        ListNode current = head;
        int sum = 0;
        int count = 0;
        while (current != null) {
            if (current.val == 0) {
                count++;
            } else {
                sum += current.val;
            }

            if (count == 2) {
                ListNode newNode = new ListNode(sum);
                ans.next = newNode;
                ans = ans.next;
                sum = 0;
                count = 1;
            }

            current = current.next;
        }
        return temp.next;
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
