package BasicSortingAndSearch;

import java.util.Arrays;

/*
 * In place sorting is named if the amount of extra memeory used to sort the array
 * is always the same. In the case of temporary varaibles this applied. Is the amount
 * of extra memory used to sort is proportional to the number of elements that we
 * want to sort, the algorithm is not an in-place sort.
 * 
 * Other property of sorting algorithms is whether the sorting is stable vs unstable. 
 * If we happen to have two same values in the array, it is called stable if the original
 * order of the same values remain. If the order of the equal values is altered it is 
 * called an unstable sort.
 */
public class Sorting {

    public static int[] defaultData = {8,7,6,4,2};

    /*
     * We start by taking two elements and moving the greater of them to the right.
     * We continue moving to the right of the array doing this. After we traverse the
     * whole array we can ensure the last element is the greater. We then start again 
     * but stop on position earlier since we know the last element is the greater. 
     * We repeat until the array is fully ordered. 
     */
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

    /*
     * We first look fot the smallest element and swap it with the first posistion, using 
     * one memory storage. We continue looking for the smallest and placing in the second.
     * We repeat until the array is all sorted.
     * 
     * Takes the same amount of time independent of the initial ordering of the array.
     */
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

    /*
     * We start by looking at the first item. We take a look to the next one and check whether
     * it's greater than the one before. If it is, we store the last element in the temporary
     * variable and move the previous element to the current position. We then repeat the process,
     * if the value before is greater, we move it one position further until we find a value that 
     * is samaller. We place the value of the temporary variable there.
     * 
     * For nearly a sorted list the time is almost linear. 
     */
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
