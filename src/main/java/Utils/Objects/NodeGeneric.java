package Utils.Objects;

public class NodeGeneric<T> {
    private T data;
    private NodeGeneric<T> nextNode;

    public NodeGeneric(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public NodeGeneric<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodeGeneric<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Data: " + this.data;
    }

}
