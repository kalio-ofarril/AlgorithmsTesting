package LinkedLists;

import Utils.Objects.Node;

public class DoubleEndedList {
    private Node head;
    private Node tail;

    public void insertAtTail(int data) {

        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        }

        if (this.tail != null) {
            this.tail.setNextNode(newNode);
        }

        this.tail = newNode;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public void deleteFromHead() {
        this.head = this.head.getNextNode();
    }

    public int length() {
        int length = 0;
        Node current = this.head;

        while (current != null) {
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    public Node find(int data) {
        Node current = this.head;

        while (current != null) {
            if (current.getData() == data) {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current != null) {
            result += current.toString() + ",";
            current = current.getNextNode();
        }

        result += "}";
        return result;
    }
}
