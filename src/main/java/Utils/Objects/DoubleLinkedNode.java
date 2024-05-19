package Utils.Objects;

public class DoubleLinkedNode {

    private int data;
    private DoubleLinkedNode previousNode;
    private DoubleLinkedNode nextNode;

    public DoubleLinkedNode(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }

    public void setData(int data){
        this.data = data;
    }

    public DoubleLinkedNode getNextNode(){
        return this.nextNode;
    }

    public DoubleLinkedNode getPreviousNode(){
        return this.previousNode;
    }

    public void setNextNode(DoubleLinkedNode node){
        this.nextNode = node;
    }

    public void setPreviousNode(DoubleLinkedNode node){
        this.previousNode = node;
    }

    @Override
    public String toString(){
        return "Data: " + this.data;
    }

}
