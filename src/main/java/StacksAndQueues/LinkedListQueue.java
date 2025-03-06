package StacksAndQueues;

import Utils.Objects.DoubleLinkedNode;

public class LinkedListQueue {

    private DoubleLinkedNode head;
    private DoubleLinkedNode tail;

    public void add(int value){
        DoubleLinkedNode temp = new DoubleLinkedNode(value);

        if(head == null){
            head = temp;
            tail = temp;
        }else{
            tail.setNextNode(temp);
            temp.setPreviousNode(tail);
            tail = temp;
        }
    }

    public void remove(){
        if(head == null){
            System.out.println("The stack is empty");
        }else{
            if(head.getNextNode() != null){
                head = head.getNextNode();
                head.setPreviousNode(null);
            }else{
                head = null;
            }
        }
    }

    public void peek(){
        if(head == null){
            System.out.println("The stack is empty");
        }else{
            System.out.println(head.getData());
        }
    }

}
