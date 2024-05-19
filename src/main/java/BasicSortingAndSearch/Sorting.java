package BasicSortingAndSearch;

import java.util.Arrays;

public class Sorting {

    public static int[] defaultData = {8,7,6,4,2};

    public String bubbleSort(int[] array){

        System.out.println("Sorting: " + Arrays.toString(array));

        for(int i=0; i< array.length-1; i++){
            for(int j=0; j< array.length-1-i;j++){
                if(array[j+1]<array[j]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return "Sorted: " + Arrays.toString(array);
    }

    public String selectionSort(int[] data){

        System.out.println("Sorting: " + Arrays.toString(data));

        for(int i=0; i<data.length-1; i++){

            int minIndex = i;

            for(int j=i+1; j<data.length; j++){
                if(data[j] < data[minIndex]){
                    minIndex = j;
                }
            }

            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }

        return "Sorted: " + Arrays.toString(data);
    }

    public String insertionSort(int[] data){

        System.out.println("Sorting: " + Arrays.toString(data));

        for(int i=0; i<data.length; i++){

            int current = data[i];
            int j = i-1;

            while(j>=0 && data[j] > current){
                data[j+1] = data[j];
                j--;
            }

            data[j+1] = current;
        }

        return "Sorted: " + Arrays.toString(data);
    }

}
