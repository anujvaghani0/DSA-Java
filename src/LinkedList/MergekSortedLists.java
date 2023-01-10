package LinkedList;

import java.util.PriorityQueue;

public class MergekSortedLists {
    public static void main(String[] args) {

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        for (ListNode l : lists) {
            if (l != null) {
                pq.add(l);
            }
        }

        ListNode dummy = new ListNode();
        ListNode previous = dummy;

        while (!pq.isEmpty()) {
            ListNode pop = pq.poll();
            dummy.next = pop;

            if (pop.next != null) {
                pq.add(pop.next);
            }

            dummy = pop;
            pop.next = null;
        }
        return previous.next;
    }

    public static class ListNode {
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
