package LinkedLists;

import Utils.Objects.DoubleLinkedNode;
import Utils.Objects.Node;

public class DoubleLinkedList {

    public DoubleLinkedNode head;

    public void insertAtHead(int data){
        DoubleLinkedNode newNode = new DoubleLinkedNode(data);
        newNode.setNextNode(this.head);

        if(this.head != null){
            this.head.setPreviousNode(newNode);
        }

        this.head = newNode;
    }

    public int length(){
        int length = 0;
        DoubleLinkedNode current = this.head;

        while(current != null){
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    @Override
    public String toString(){
        String string = "{";
        DoubleLinkedNode current = this.head;

        while(current != null){
            string += current.getData() + ",";
            current = current.getNextNode();
        }

        string += "}";
        return string;
    }

}
