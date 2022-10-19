package LinkedList.Questions;

public class sorintgUsingLinkedList {

//    public ListNode sortList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode mid = getMid(head);
//        ListNode left = sortList(head);
//        ListNode right = sortList(mid);
//
//        return merge(left, right);
//    }
//
//    public ListNode merge(ListNode list1, ListNode list2) {
//        ListNode dummyHead=new ListNode();
//        ListNode tail=dummyHead;
//    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
