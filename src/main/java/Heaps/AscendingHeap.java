package Heaps;

public class AscendingHeap {

    private Integer[] heapData;
    private int currentPosition = -1;

    public AscendingHeap(int size){
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
        heapData[0] = heapData[currentPosition-1];
        heapData[currentPosition+1] = null;
        fixDown(0);
        return result;
    }

    private void fixUp(int index){
        int i =  (index-1)/2;
        while(i >= 0 && heapData[i] > heapData[index]){
            int temp = heapData[i];
            heapData[i] = heapData[index];
            heapData[index] = temp;
            index = i;
            i = (index-1)/2;
        }
    }

    public void fixDown(int index){
        while(index <= currentPosition){
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 1;
            if(leftChild <= rightChild){
                int childToSwap;
                if(rightChild > leftChild){
                    childToSwap = leftChild;
                }else{
                    childToSwap = heapData[leftChild] < heapData[rightChild] ? leftChild : rightChild;
                }

                if(heapData[index] > heapData[childToSwap]){
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
        return currentPosition == heapData.length-1;
    }

}
