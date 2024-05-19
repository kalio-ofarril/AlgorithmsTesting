package Assignments.Exercises.BasicSortingAndSearch;

/*
Write an algorithm which checks if there are duplicate characters in a string.
The method signature would look something like public boolean hasDuplicateChars(String s) .
If we pass "anaconda" the method should return true (repeated char 'a').
If we pass 'great', the method should return false, because there are no duplicate characters in the string.
What is the time complexity of this algorithm?
If we know that the string contains ONLY ASCII characters, can we improve the algorithm?
 */

import java.time.LocalTime;

public class DuplicateChecker {

    public boolean hasDuplicateChars(String s){
        char[] chars = s.toCharArray();

        for(int i=0; i<=chars.length-1; i++){
            char current = chars[i];
            for(int j=i+1; j<=chars.length-1; j++){
                if(current == chars[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasDuplicateASCIIChars(String s){
        char[] chars = s.toCharArray();

        for(int i=0; i<=chars.length-1; i++){
            char current = chars[i];
            for(int j=i+1; j<=chars.length-1; j++){
                if(current == chars[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String... args){

        DuplicateChecker duplicateChecker = new DuplicateChecker();

        System.out.println(LocalTime.now());
        System.out.println(duplicateChecker.hasDuplicateChars("anaconda"));
        System.out.println(LocalTime.now());
        System.out.println(duplicateChecker.hasDuplicateChars("great"));
        System.out.println(LocalTime.now());
    }

}
