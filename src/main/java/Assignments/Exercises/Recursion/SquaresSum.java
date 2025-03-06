package Assignments.Exercises.Recursion;

public class SquaresSum {

    /*
    Write a recursive method to calculate the sum of squares of the first n natural numbers.
    n is to be given as an input.
     */

    public static int squareSum(int n){
        if(n == 1)
            return 1;
        return (n * n) + squareSum(n-1);
    }

    public static void main(String[] args){
        int result = squareSum(3);

        System.out.println(result);
    }

}

