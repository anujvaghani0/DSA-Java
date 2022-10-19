package LinkedList.SinglyLinkedLists;

public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(10);
        list.insertFirst(17);
        list.insertFirst(35);
        list.insertFirst(64);
        list.insertFirst(67);
        list.insertFirst(69);
        list.insertFirst(70);

        list.insertLast(98);
        list.insert(56,2);
        list.display();

        list.deleteFirst();
        list.deleteLast();
        list.display();

        list.delete(2);
        list.display();
    }
}
