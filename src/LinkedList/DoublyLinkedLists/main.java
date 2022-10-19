package LinkedList.DoublyLinkedLists;

public class main {
    public static void main(String[] args) {
        DL list = new DL();
        list.insertFirst(70);
        list.insertFirst(69);
        list.insertFirst(59);
        list.insertFirst(57);
        list.insertFirst(45);
        list.insertFirst(35);
        list.insertFirst(9);

        list.display();
        list.insertLast(700);
        list.display();

        list.insert(59,64);
        list.display();


    }
}
