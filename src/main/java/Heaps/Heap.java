package Heaps;

import java.util.Arrays;

public class Heap {

    private Integer[] heapData;
    private int currentPosition = -1;

    public Heap(int size){
        this.heapData = new Integer[size];
    }

    public void insert(int item){
        if(isFull())
            throw new RuntimeException("Heap is full");
        this.heapData[++currentPosition] = item;
        fixUp(currentPosition);
    }

    public int deleteRoot(){
        int result = heapData[0];
        heapData[0] = heapData[currentPosition--];
        heapData[currentPosition+1] = null;
        fixDown(0,-1);
        return result;
    }

    public void heapSort(){
        for(int i=0; i < currentPosition; i++){
            int temp = heapData[0];
            heapData[0] = heapData[currentPosition-i];
            heapData[currentPosition-i] = temp;
            fixDown(0, currentPosition-i-1);
        }
    }

    public static Heap heapify(int [] data){
        Heap heap = new Heap(data.length);
        for(int i =0; i<data.length; i++){
            heap.insert(data[i]);
        }
        return heap;
    }

    public void fixUp(int index){
        int i = (index-1)/2;  // parent index
        while(i >= 0 && heapData[i] < heapData[index]){
            int temp = heapData[i];
            heapData[i] = heapData[index];
            heapData[index] = temp;
            index = i;
            i = (index-1)/2;
        }
    }

    public void fixDown(int index, int upto){
        if(upto < 0)
            upto = currentPosition;
        while (index <= upto){
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            if(leftChild <= upto){
                int childToSwap;
                if(rightChild > upto)
                    childToSwap = leftChild;
                else
                    childToSwap = (heapData[leftChild] > heapData[rightChild]) ? leftChild : rightChild;

                if(heapData[index] < heapData[childToSwap]){
                    int temp = heapData[index];
                    heapData[index] = heapData[childToSwap];
                    heapData[childToSwap] = temp;
                }else{
                    break;
                }
                index = childToSwap;
            }else{
                break;
            }
        }
    }

    private boolean isFull(){
        return currentPosition == heapData.length - 1;
    }

    @Override
    public String toString(){
        return Arrays.deepToString(this.heapData);
    }

    public static void main(String[] args) {
        Heap heap = new Heap(10);
        heap.insert(10);
        heap.insert(15);
        heap.insert(27);
        heap.insert(5);
        heap.insert(2);
        heap.insert(21);
//		System.out.println(heap.deleteRoot());
        heap.heapSort();
        System.out.println(heap);
        Heap another = Heap.heapify(new int[]{73,16,40,1,46,28,12,21,22,44,66,90,7});
        another.heapSort();
        System.out.println(another);
    }

}
