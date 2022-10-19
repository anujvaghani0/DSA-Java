package LinkedList.CirculaLinkedLists;

import LinkedList.DoublyLinkedLists.DL;

public class main {
    public static void main(String[] args) {
        CL list=new CL();
        list.insert(70);
        list.insert(60);
        list.insert(50);
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);
        list.display();

        list.delete(50);
        list.display();
    }
}
