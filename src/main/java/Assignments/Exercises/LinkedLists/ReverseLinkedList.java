package Assignments.Exercises.LinkedLists;

import LinkedLists.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {

        LinkedList dlist = new LinkedList();

        dlist.insertAtHead(1);
        dlist.insertAtHead(2);
        dlist.insertAtHead(3);
        dlist.insertAtHead(4);
        dlist.insertAtHead(5);
        dlist.insertAtHead(6);
        dlist.insertAtHead(7);
        dlist.insertAtHead(8);

        System.out.println(dlist.toString());

        dlist.reverse2();

        System.out.println(dlist.toString());
    }

}
