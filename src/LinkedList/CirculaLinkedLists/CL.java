package LinkedList.CirculaLinkedLists;

import org.w3c.dom.Node;

public class CL {
    private Node head;
    private Node tail;

    public CL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                if (node.next != null) {
                    node = node.next;
                }
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int value) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (node.val == value) {
            head = head.next;
            tail.next = head;
        }

        do {
            Node n = node.next;
            if (n.val == value) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }


    public class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
