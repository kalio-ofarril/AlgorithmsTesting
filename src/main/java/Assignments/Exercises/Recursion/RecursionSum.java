package Assignments.Exercises.Recursion;

public class RecursionSum {

    /*
    Write an add method, which takes two positive integers and returns their sum.
    Of course, for this problem, you need to use recursion.
    Think about what would be the base case (when a number becomes 0?).
     */

    public static int sum(int num1, int num2){
        if(num2  == 0)
            return num1;
        return 1 + sum(num1, num2 - 1);
    }

    public static void main(String[] args){
        int result = sum(7,2);
        System.out.println(result);
    }

}
