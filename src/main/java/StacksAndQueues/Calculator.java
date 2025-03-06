package StacksAndQueues;

import java.util.Arrays;

public class Calculator {

    public static double evaluate(String expression) {
        String[] tokens = expression.split(" ");

        System.out.println(Arrays.deepToString(tokens));

        TwoStackPair twoStack = new TwoStackPair();

        for (String token : tokens) {
            token = stripBrackets(token);
            System.out.println(token);
            if (isOperator(token)) {
                twoStack.pushFirst(token);
                twoStack.pushSecond("#"); // marker in the operand stack
            } else if (isNumber(token)) {
                if (twoStack.isSecondEmpty() || (!twoStack.isSecondEmpty() && twoStack.peekSecond().equals("#"))) {
                    twoStack.pushSecond(token);
                } else {
                    while (!twoStack.isSecondEmpty() && isNumber((String)twoStack.peekSecond())) {
                        System.out.println("......");
                        System.out.println(twoStack.toString());
                        Double inStack = Double.parseDouble((String)twoStack.popSecond());
                        twoStack.popSecond(); //pop the marker
                        String operator = (String)twoStack.popFirst();
                        Double result = applyOp(operator, inStack, Double.parseDouble(token));
                        if (twoStack.isSecondEmpty() || twoStack.peekSecond().equals("#")) {
                            twoStack.pushSecond(result.toString());
                            break;
                        }
                        token = result.toString();
                        System.out.println("result");
                        System.out.println(result);
                    }
                }
            }
            System.out.println(twoStack.toString());
        }
        System.out.println("-------");
        System.out.println(twoStack.toString());
        return Double.parseDouble((String)twoStack.popSecond()); //pop from the operand stack
    }

    private static Double applyOp(String operation, Double op1, Double op2) {
        System.out.println("aaply op: " + operation + " " + op1 + " " + op2);
        if (operation.equals("+"))
            return op1 + op2;
        if (operation.equals("-"))
            return op1 - op2;
        if (operation.equals("/"))
            return op1 / op2;
        if (operation.equals("*"))
            return op1 * op2;
        if (operation.equals("%"))
            return op1 % op2;
        throw new RuntimeException("Invalid operation");
    }

    private static String stripBrackets(String s) {
        String res = s.replace('(', ' ');
        res = res.replace(')', ' ');
        return res.trim();
    }

    private static boolean isNumber(String s) {
        char[] chars = s.toCharArray();
        for (int c : chars) {
            if ((c >= 48 && c <= 57) || c == 46) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean isOperator(String c) {
        if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") || c.equals("%"))
            return true;
        return false;
    }

    public static void main(String[] args) {

        TwoStackPair twoStack = new TwoStackPair();

        /*
        twoStack.pushFirst(1);
        twoStack.pushFirst(3);
        twoStack.pushFirst(5);
        twoStack.pushSecond(2);
        twoStack.pushSecond(4);
        twoStack.pushSecond(6);

        System.out.println(twoStack.popFirst());
        System.out.println(twoStack.peekFirst());
        System.out.println(twoStack.popSecond());
        System.out.println(twoStack.peekSecond());

        System.out.println(twoStack.isFirstEmpty());
        System.out.println(twoStack.isSecondEmpty());

         */

        System.out.println(evaluate("* (+ 3 (+ 1 1)) (* 5 2)"));

    }

}
