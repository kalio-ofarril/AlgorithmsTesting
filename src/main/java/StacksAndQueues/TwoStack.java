package StacksAndQueues;

import java.util.Arrays;
import java.util.stream.Stream;

public class TwoStack {

    int[] stack = new int[15];

    int stackTail1 = -1;
    int stackTail2 = 9;

    public void push1(int value){
        if(stackTail1 == 9){
            System.out.println("Stack 1 is full");
        }else{
            stack[++stackTail1] = value;
        }
    }

    public void push2(int value){
        if(stackTail2 == 14){
            System.out.println("Stack 2 is full");
        }else{
            stack[++stackTail2] = value;
        }
    }

    public void peek1(){
        if (stackTail1 == -1) {
            System.out.println("No stack 1");
        } else {
            System.out.println(stack[stackTail1]);
        }
    }

    public void peek2(){
        if (stackTail2 == 9) {
            System.out.println("No stack 2");
        } else {
            System.out.println(stack[stackTail2]);
        }
    }

    public void pop1(){
        if (stackTail1 == -1) {
            System.out.println("No stack 1");
        }else{
            stackTail1--;
        }
    }

    public void pop2(){
        if (stackTail2 == 9) {
            System.out.println("No stack 2");
        }else{
            stackTail2--;
        }
    }

    public void seeStack(){
        System.out.println(Arrays.toString(stack));
    }

}
