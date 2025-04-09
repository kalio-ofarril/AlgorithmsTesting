package MoreSorting;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ShellSort {

    public static int getKnuthSequence(int arrayLength, int iteration){
        int temp = 1;
        int counter = 0;
        while(arrayLength > 3*temp+1){
            temp = 3*temp+1;
            counter++;
        }

        int h = 1;
        while(iteration < counter){
            h = 3*h+1;
            iteration++;
        }

        return h;
    }

    public static void shellSort(int[] array){

        int counter = -1;
        int knuthNumber = getKnuthSequence(array.length,0);
        while(knuthNumber > 1){
            counter++;
            knuthNumber = getKnuthSequence(array.length,counter);

            for(int i = 0; i < array.length; i = i + knuthNumber){
                int current = array[i];
                int j = i - knuthNumber;

                while(j>=0 && array[j] > current){
                    array[j+knuthNumber] = array[j];
                    j = j - knuthNumber;
                }
                array[j+knuthNumber] = current;
            }
        }
    }

    public static void main(String[] args){
        int[] randomIntsArray = IntStream.generate(() -> new Random().nextInt(50)).limit(5).toArray();

        System.out.println(Arrays.toString(randomIntsArray));

        shellSort(randomIntsArray);

        System.out.println(Arrays.toString(randomIntsArray));
    }

}
