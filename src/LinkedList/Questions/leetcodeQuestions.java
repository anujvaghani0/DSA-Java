package LinkedList.Questions;

public class leetcodeQuestions {

    //question link -> https://leetcode.com/problems/linked-list-cycle/

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    //    Find the length of the cycle
    public int lengthCycle(ListNode head) {
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

    //question link -> https://leetcode.com/problems/linked-list-cycle-ii/

    public ListNode detectCycle(ListNode head) {
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
        return s;
    }

    //question link -> https://leetcode.com/problems/happy-number/

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private static int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int reminder = number % 10;
            ans += reminder * reminder;
            number /= 10;
        }
        return ans;
    }

    //question link -> https://leetcode.com/problems/middle-of-the-linked-list/

    public ListNode middleNode(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
