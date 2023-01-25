package LinkedList;

public class FlatteningALinkedList {
    public static void main(String[] args) {

    }

    public static Node flatten(Node root) {
        if (root == null || root.next == null) {
            return root;
        }

        root.next = flatten(root.next);

        //    now merge the list
        root = mergeListed(root, root.next);
        return root;
    }


    public static Node mergeListed(Node a, Node b) {
        Node temp = new Node(0);
        Node ans = temp;

        while (a != null && b != null) {
            if (a.data < b.data) {
                temp.bottom = a;
                temp = temp.bottom;
                a = a.bottom;
            } else {
                temp.bottom = b;
                temp = temp.bottom;
                b = b.bottom;
            }
        }
        if (a != null) {
            temp.bottom = a;
        } else {
            temp.bottom = b;
        }

        return ans.bottom;
    }

    static class Node {
        int data;
        Node next;
        Node bottom;

        Node(int d) {
            data = d;
            next = null;
            bottom = null;
        }
    }
}
