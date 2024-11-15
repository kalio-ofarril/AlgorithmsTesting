package Assignments.Exercises.LinkedLists;

import LinkedLists.LinkedList;
import Utils.Objects.Node;

public class FindKElementFromEnd {

    public static Node findKElementFromEnd(LinkedList list, int k) {
        Node current = list.getHead();

        for (int i = 0; i < list.length() - k; i++) {
            current = current.getNextNode();
        }

        return current;
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

        System.out.println(findKElementFromEnd(dlist, 5).getData());
    }

}
