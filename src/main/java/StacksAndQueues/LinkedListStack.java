package StacksAndQueues;

import Utils.Objects.DoubleLinkedNode;

public class LinkedListStack {

    public DoubleLinkedNode tail;

    public void push(int value){
        if(tail == null){
            this.tail = new DoubleLinkedNode(value);
        }else{
            DoubleLinkedNode temp = tail;
            DoubleLinkedNode newTail = new DoubleLinkedNode(value);
            newTail.setPreviousNode(tail);
            temp.setNextNode(newTail);
            this.tail = newTail;
        }
    }

    public void pop(){
        if(tail == null){
            System.out.println("Empty Stack");
        }else{
            tail = tail.getPreviousNode();
        }
    }

    public void peek(){
        if(tail == null){
            System.out.println("Empty Stack");
        }else{
            System.out.println(tail.getData());
        }
    }

}
