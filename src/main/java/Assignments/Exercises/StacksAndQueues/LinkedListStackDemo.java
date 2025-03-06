package Assignments.Exercises.StacksAndQueues;

import StacksAndQueues.LinkedListQueue;
import StacksAndQueues.LinkedListStack;
import StacksAndQueues.TwoStack;

public class LinkedListStackDemo {

    public static void main(String[] args){

        LinkedListQueue stack = new LinkedListQueue();

        stack.peek();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);

        stack.peek();
        stack.remove();
        stack.peek();
        stack.remove();
        stack.remove();
        stack.peek();
        stack.remove();
        stack.peek();

    }

}
