package Assignments.Exercises.LinkedLists;

import LinkedLists.LinkedList;
import Utils.Objects.Node;

public class IdentifyIfCircular {

    public static Boolean identifyIfCircular(LinkedList list) {
        Node head = list.getHead();
        Node current = head.getNextNode();

        while (current != null && current.getNextNode() != head) {
            current = current.getNextNode();
        }

        return current == null ? false : true;
    }

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
        System.out.println(identifyIfCircular(dlist));

        dlist.doCircular();

        System.out.println(identifyIfCircular(dlist));
    }

}
