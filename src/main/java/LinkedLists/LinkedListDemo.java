package LinkedLists;

public class LinkedListDemo {

    public static void main(String[] args) {

        DoubleLinkedList dlist = new DoubleLinkedList();

        dlist.insertAtHead(2);
        dlist.insertAtHead(5);
        dlist.insertAtHead(4);
        dlist.insertAtHead(1);

        System.out.println(dlist.toString());
        dlist.sort();
        System.out.println(dlist.toString());
    }
}
