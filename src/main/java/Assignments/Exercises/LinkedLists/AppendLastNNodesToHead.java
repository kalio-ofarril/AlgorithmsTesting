package Assignments.Exercises.LinkedLists;

import LinkedLists.LinkedList;
import Utils.Objects.Node;

/*
 * Append the last n nodes of a linked list to the beginning of the list. Will keeping the length as a member variable inside the LinkedList class, help?
 */

public class AppendLastNNodesToHead {

    public static LinkedList appendLastNNodesToHead(LinkedList list, int n) {

        Node current = null;

        for (int i = 0; i < n; i++) {
            list.insertAtHead(list.deleteFromTail().getData());
        }

        return list;
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

        dlist.appendLastNNodesToHead(5);

        System.out.println(dlist.toString());
    }

}
