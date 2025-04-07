package MoreSorting;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] array, int start, int end){
        if(start < end){
            int pivot = partition(array, start, end);

            quickSort(array,start,pivot-1);
            quickSort(array,pivot+1,end);
        }
    }

    public static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start;

        for(int j=start; j<end; j++){
            if(array[j] <= pivot){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
        int temp = array[i];
        array[i] = pivot;
        array[end] = temp;
        return i;
    }

    public static void main(String[] args){
        int[] sample = {4,3,1,2,7,5,6};

        System.out.println(Arrays.toString(sample));

        quickSort(sample,0,sample.length-1);

        System.out.println(Arrays.toString(sample));
    }

}
