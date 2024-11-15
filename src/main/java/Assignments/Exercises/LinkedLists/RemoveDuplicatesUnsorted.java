package Assignments.Exercises.LinkedLists;

import java.util.HashSet;
import java.util.Set;

import LinkedLists.LinkedList;
import Utils.Objects.Node;

public class RemoveDuplicatesUnsorted {

    public static LinkedList removeDuplicatesUnsorted(LinkedList list) {
        Node current = list.getHead();
        Node previous = null;
        Set<Integer> existingValues = new HashSet<>();

        while (current.getNextNode() != null) {
            if (existingValues.contains(current.getData())) {
                previous.setNextNode(current.getNextNode());
            } else {
                existingValues.add(current.getData());
                previous = current;
            }
            current = current.getNextNode();
        }

        return list;
    }

    public static LinkedList removeDuplicatesUnsortedInPlace(LinkedList list) {
        Node current = list.getHead();
        Node searcher;

        while (current.getNextNode() != null) {
            searcher = current;

            while (searcher.getNextNode() != null) {
                if (searcher.getNextNode().getData() == current.getData()) {
                    searcher.setNextNode(searcher.getNextNode().getNextNode());
                } else {
                    searcher = searcher.getNextNode();
                }
            }
            current = current.getNextNode();
        }

        return list;
    }

    public static void main(String[] args) {

        LinkedList dlist = new LinkedList();

        dlist.insertAtHead(1);
        dlist.insertAtHead(2);
        dlist.insertAtHead(2);
        dlist.insertAtHead(4);
        dlist.insertAtHead(4);
        dlist.insertAtHead(4);
        dlist.insertAtHead(6);
        dlist.insertAtHead(2);

        System.out.println(dlist.toString());

        System.out.println(removeDuplicatesUnsortedInPlace(dlist).toString());

    }

}
