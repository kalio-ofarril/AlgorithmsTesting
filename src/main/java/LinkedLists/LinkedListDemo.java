package LinkedLists;

public class LinkedListDemo {

    public static void main(String[] args){

        DoubleLinkedList dlist = new DoubleLinkedList();

        dlist.insertAtHead(19);
        dlist.insertAtHead(18);
        dlist.insertAtHead(17);

        System.out.println(dlist.toString());
    }
}
