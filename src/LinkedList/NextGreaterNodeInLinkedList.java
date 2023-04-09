package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterNodeInLinkedList {
    public static void main(String[] args) {

    }

//    public static int[] nextLargerNodes(ListNode head) {
//        int n = 0;
//        ListNode temp = head;
//        while (temp != null) {
//            n++;
//            temp = temp.next;
//        }
//
////        now find next greater node
//        int[] ans=new int[n];
//        int index=0;
//        temp=head;
//        Stack<List<Integer>> st=new Stack<>();
//        while (temp!=null){
//            List<Integer> x;
//            x=new ArrayList<>();
//            x.add(temp.val);
//            while (!st.empty() && st.peek().get(0)<temp.val){
//
//            }
//        }
//    }


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
