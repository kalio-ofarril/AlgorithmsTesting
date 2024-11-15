package LinkedLists;

import Utils.Objects.DoubleLinkedNode;
import Utils.Objects.Node;

public class DoubleLinkedList {

    public DoubleLinkedNode head;

    public void insertAtHead(int data) {
        DoubleLinkedNode newNode = new DoubleLinkedNode(data);
        newNode.setNextNode(this.head);

        if (this.head != null) {
            this.head.setPreviousNode(newNode);
        }

        this.head = newNode;
    }

    public void sort() {
        DoubleLinkedNode current = head.getNextNode();

        while (current != null) {

            DoubleLinkedNode lookingAtNode = current.getPreviousNode();
            while (lookingAtNode != null && (lookingAtNode.getData() > current.getData())) {
                lookingAtNode = lookingAtNode.getPreviousNode();
            }

            DoubleLinkedNode currentNextNode = current.getNextNode();
            if (lookingAtNode != null || current == head) {
                current.getPreviousNode().setNextNode(currentNextNode);
                if (currentNextNode != null) {
                    currentNextNode.setPreviousNode(current.getPreviousNode());
                }
                current.setPreviousNode(lookingAtNode);
            }
            if (lookingAtNode == null) {
                if (current != head) {
                    current.setNextNode(head);
                    current.getNextNode().setPreviousNode(current);
                    head = current;
                }
            } else {
                current.setNextNode(lookingAtNode.getNextNode());
                current.getNextNode().setPreviousNode(current);
                lookingAtNode.setNextNode(current);
            }
            current = currentNextNode;
        }

    }

    public int length() {
        int length = 0;
        DoubleLinkedNode current = this.head;

        while (current != null) {
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    @Override
    public String toString() {
        String string = "{";
        DoubleLinkedNode current = this.head;

        while (current != null) {
            string += current.getData() + ",";
            current = current.getNextNode();
        }

        string += "}";
        return string;
    }

}
