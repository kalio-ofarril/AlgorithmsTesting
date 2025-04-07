package BinarySearchTrees;

public class TreeNode {

    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private boolean isDeleted = false;

    TreeNode(Integer data){
        this.data = data;
    }

    public TreeNode find(Integer data){
        if(this.data == data && !isDeleted){
            return this;
        }
        if(data < this.data && leftChild != null){
            return leftChild.find(data);
        }
        if(rightChild != null){
            return rightChild.find(data);
        }
        return null;
    }

    public void insert(Integer data){
        if(data >= this.data){
            if(this.rightChild == null){
                this.rightChild = new TreeNode(data);
            }else{
                rightChild.insert(data);
            }
        }else{
            if(this.leftChild == null){
                this.leftChild = new TreeNode(data);
            }else{
                leftChild.insert(data);
            }
        }
    }

    public Integer smallest(){
        if(this.leftChild == null){
            return this.data;
        }
        return this.leftChild.smallest();
    }

    public Integer largest(){
        if(this.rightChild == null){
            return this.data;
        }
        return  this.rightChild.largest();
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void delete(){
        this.isDeleted = true;
    }

    public TreeNode traverseInOrder(){
        if(this.getLeftChild() != null)
            this.getLeftChild().traverseInOrder();
        System.out.print(this.data + " ");
        if(this.getRightChild() != null)
            this.getRightChild().traverseInOrder();
        return null;
    }

    // Need to test
    public TreeNode traversePreOrder(){
        System.out.print(this.data + " ");
        if(this.getLeftChild() != null)
            this.getLeftChild().traversePreOrder();
        if(this.getRightChild() != null)
            this.getRightChild().traversePreOrder();
        return null;
    }

    // Need to test
    public TreeNode traversePostOrder(){
        if(this.getLeftChild() != null)
            this.getLeftChild().traversePostOrder();
        if(this.getRightChild() != null)
            this.getRightChild().traversePostOrder();
        System.out.print(this.data + " ");
        return null;
    }

    public Integer numberOfLeafs(){
        if(isLeaf())
            return 1;
        int rightLeaves = 0;
        int leftLeaves = 0;
        if(this.leftChild != null){
            leftLeaves = this.leftChild.numberOfLeafs();
        }
        if(this.rightChild != null){
            rightLeaves = this.rightChild.numberOfLeafs();
        }
        return rightLeaves + leftLeaves;
    }

    public boolean isLeaf(){
        return this.leftChild == null && this.rightChild == null;
    }

    public int height(){
        if(isLeaf())
            return 1;
        int leftCount = 0;
        int rightCount = 0;
        if(this.leftChild != null){
            leftCount = this.leftChild.height();
        }
        if(this.rightChild != null){
            rightCount = this.rightChild.height();
        }
        return leftCount > rightCount ? leftCount+1 : rightCount+1;
    }

    public static TreeNode addSorted(int[] data, int start, int end){
        if(end >= start){
            int mid = (start+end)/2;
            TreeNode newNode = new TreeNode(data[mid]);
            newNode.leftChild = addSorted(data,start,mid-1);
            newNode.rightChild = addSorted(data, mid+1, end);
            return newNode;
        }
        return null;
    }

}
