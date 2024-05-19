package LinkedLists;

import Utils.Objects.NodeGeneric;

public class LinkedListGeneric<T> {

    private NodeGeneric<T> head;

    public NodeGeneric<T> getHead() {
        return this.head;
    }

    public void addAtStart(T data) {
        NodeGeneric<T> newNode = new NodeGeneric<T>(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public NodeGeneric<T> deleteAtStart() {
        NodeGeneric<T> toDel = this.head;
        this.head = this.head.getNextNode();
        return toDel;
    }

    public NodeGeneric<T> find(T data) {
        NodeGeneric<T> curr = this.head;
        while (curr != null) {
            if (curr.getClass().equals(data)) {
                return curr;
            }
            curr = curr.getNextNode();
        }
        return null;
    }

    public int length() {
        if (head == null)
            return 0;
        int length = 0;
        NodeGeneric<T> curr = this.head;
        while (curr != null) {
            length += 1;
            curr = curr.getNextNode();
        }
        return length;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

}