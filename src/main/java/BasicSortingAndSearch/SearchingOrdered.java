package BasicSortingAndSearch;

import java.util.Arrays;

public class SearchingOrdered {

    public Integer[] data;

    public SearchingOrdered(){
        this.data = new Integer[100];
    }

    public SearchingOrdered(int size){
        this.data = new Integer[size];
    }

    /*
     * A fast way to search in an ordered array. In the worst case scenario the search is 
     * in the order of log_(2)(n).
     */
    public int binarySearch(int item){
        int maxIndex = this.getDataSize()-1;
        int minIndex = 0;
        int indexToLook = (int) Math.floor((maxIndex+minIndex)/2);

        while(maxIndex>minIndex && this.data[indexToLook] != item){
            if(this.data[indexToLook] > item){
                maxIndex = indexToLook-1;
            }else{
                minIndex = indexToLook+1;
            }
            indexToLook = (int) Math.floor((maxIndex+minIndex)/2);
        }

        return this.data[indexToLook] == item ? indexToLook : -1;
    }

    public int binarySearchRecursive(int item){
        return binarySearch(item, 0, this.getDataSize()-1);
    }

    public int binarySearch(int item, int minIndex, int maxIndex){

        System.out.println("------");

        System.out.println("min: " + minIndex);
        System.out.println("max: " + maxIndex);

        if(minIndex==maxIndex){
            if(data[maxIndex]==item){
                return maxIndex;
            }
            return -1;
        }

        int indexToLook = (int) Math.floor((minIndex + maxIndex) / 2);

        System.out.println("Looking: " + indexToLook);

        if(data[indexToLook] == item){
            return indexToLook;
        }

        if(data[maxIndex]<item){
            return binarySearch(item,minIndex,indexToLook-1);
        }
        return binarySearch(item, indexToLook+1,maxIndex);
    }

    public void insert(int value){
        int index = 0;
        while(index<data.length && data[index]!=null){
            if(data[index]>value) break;
            index++;
        }
        shifElementsToRight(index);
        data[index] = value;
    }

    public void delete(int value){
        int index = this.binarySearch(value);
        if(index>=0){
            shiftElementsToLeft(index);
        }
    }

    public int getDataSize(){
        int size = 0;
        while((size<this.data.length) && this.data[size]!=null){
            size++;
        }
        return size;
    }

    public void shifElementsToRight(int index){
        for(int i=this.getDataSize()-1; i>=index; i--){
            data[i+1] = data[i];
        }
    }

    public void shiftElementsToLeft(int index){
        for(int i=index; i<=this.getDataSize()-1; i++){
            data[i-1] = data[i];
        }
        data[this.getDataSize()-1] = null;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(this.data);
    }
}
