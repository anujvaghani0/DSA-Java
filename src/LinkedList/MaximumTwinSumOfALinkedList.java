package LinkedList;

public class MaximumTwinSumOfALinkedList {
    public static void main(String[] args) {

    }


    public static int pairSum(ListNode head) {
        int[] arr = new int[100000];
        int index = 0;
        while (head != null) {
            arr[index++] = head.val;
            head = head.next;
        }

        int maxSum = 0;
        for (int i = 0; i < index / 2; i++) {
            int twinSum = arr[i] + arr[index - i - 1];
            maxSum = Math.max(twinSum, maxSum);
        }
        return maxSum;
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
