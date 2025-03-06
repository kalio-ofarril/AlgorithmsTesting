package Recursion;

public class Factorial {

    public static int factorial(int n){
        System.out.println("-----");
        System.out.println(n);
        if(n == 0)
            return 1;
        return n*factorial(n-1);
    }

    public static int factorial(int n, int result){
        System.out.println("-----");
        System.out.println(n);
        System.out.println(result);
        if(n==0)
            return result;
        return factorial(n-1, n*result);
    }

    public static void main(String[] args){
        System.out.println(factorial(4));
        System.out.println("+++++++++++++++");
        System.out.println(factorial(4,1));
    }

}
