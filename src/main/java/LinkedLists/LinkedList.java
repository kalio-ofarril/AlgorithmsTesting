package LinkedLists;

import Utils.Objects.Node;

public class LinkedList {

    private Node head;

    public Node getHead() {
        return this.head;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public void deleteFromHead() {
        this.head = this.head.getNextNode();
    }

    public Node deleteFromTail() {
        Node current = this.head;
        for (int i = 0; i < this.length() - 2; i++) {
            current = current.getNextNode();
        }
        Node deletedNode = current.getNextNode();
        current.setNextNode(null);
        return deletedNode;
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

    public void appendLastNNodesToHead(int n) {
        Node current = this.head;
        Node newTail = this.head;

        for (int i = 0; i < this.length() - n - 1; i++) {
            current = current.getNextNode();
            newTail = newTail.getNextNode();
        }

        while (current.getNextNode() != null) {
            current = current.getNextNode();
        }

        current.setNextNode(head);
        head = newTail.getNextNode();
        newTail.setNextNode(null);

    }

    public void reverse() {
        Node current = this.head;
        Node lastNode = this.head;

        for (int i = 0; i < this.length() - 1; i++) {
            lastNode = this.head;
            for (int j = 0; j < this.length() - 1 - i; j++) {
                lastNode = lastNode.getNextNode();
            }
            Node node = new Node(current.getData());
            node.setNextNode(lastNode.getNextNode());
            lastNode.setNextNode(node);
            this.head = current.getNextNode();
            current = current.getNextNode();
        }
    }

    public void reverse2() {
        Node previous = null;
        Node current = this.head;
        Node next;

        while (current != null) {
            next = current.getNextNode();
            current.setNextNode(previous);
            previous = current;
            current = next;
        }
        this.head = previous;
    }

    public void deleteKNode(int k) {
        Node current = this.head;
        Node previous;

        for (int i = 0; i < k - 2; i++) {
            current = current.getNextNode();
        }

        previous = current;
        current = current.getNextNode();

        previous.setNextNode(current.getNextNode());
    }

    public void doCircular() {
        Node lastNode = this.head;

        for (int i = 0; i < this.length() - 1; i++) {
            lastNode = lastNode.getNextNode();
        }

        lastNode.setNextNode(this.head);
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
