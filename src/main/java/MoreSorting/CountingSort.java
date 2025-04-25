package MoreSorting;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class CountingSort {

    public static int[] countingSort(int[] array, int max){
        int[] counter = new int[max];

        for(int i : array){
            counter[i]++;
        }

        int[] result = new int[array.length];

        int j = 0;
        for(int i=0; i < counter.length; i++){
            while(counter[i] > 0){
                result[j] = i;
                counter[i]--;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int max = 100;
        int[] randomIntsArray = IntStream.generate(() -> new Random().nextInt(max)).limit(20).toArray();

        System.out.println(Arrays.toString(randomIntsArray));

        System.out.println(Arrays.toString(countingSort(randomIntsArray , max)));
    }

}
