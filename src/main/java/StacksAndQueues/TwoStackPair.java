package StacksAndQueues;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoStackPair {

    Object[] array = new Object[100];
    int top1 = -2, top2 = -1;

    public void pushFirst(Object data) {
        array[top1 += 2] = data;
    }

    public void pushSecond(Object data) {
        array[top2 += 2] = data;
    }

    public Object peekFirst() {
        if (top1 >= 0)
            return array[top1];
        throw new RuntimeException("First stack is empty");
    }

    public Object peekSecond() {
        if (top2 >= 0)
            return array[top2];
        throw new RuntimeException("Second stack is empty");
    }

    public Object popFirst() {
        if (top1 < 0)
            throw new RuntimeException("First stack is empty");
        top1 -= 2;
        return array[top1 + 2];
    }

    public Object popSecond() {
        if (top2 < 0)
            throw new RuntimeException("Second stack is empty");
        top2 -= 2;
        return array[top2 + 2];
    }

    public boolean isFirstEmpty() {
        return top1 < 0;
    }

    public boolean isSecondEmpty() {
        return top2 < 0;
    }

    @Override
    public String toString(){
        return Arrays
                .stream(array)
                .map(o -> {return (String) o == null ? " " : o.toString();})
                .collect(Collectors.joining());
    }

}
