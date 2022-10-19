package LinkedList.Questions.EASY;

public class LL {
    private ListNode head;
    private ListNode tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        ListNode node = new ListNode(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    //question link -> https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    public void deleteDuplicates() {
        ListNode node = head;
        if (node == null) {
            return;
        }
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    //question link -> https://leetcode.com/problems/merge-two-sorted-lists/

    public static LL merge(LL first, LL second) {
        ListNode f = first.head;
        ListNode s = second.head;

        LL ans = new LL();
        while (f != null && s != null) {
            if (f.val < s.val) {
                ans.insertLast(f.val);
                f = f.next;
            } else {
                ans.insertLast(s.val);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.val);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.val);
            s = s.next;
        }
        return ans;
    }

    //question link -> https://leetcode.com/problems/reverse-linked-list/

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


    public static class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int value) {
            this.val = value;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
