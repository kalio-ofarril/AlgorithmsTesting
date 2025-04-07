package BinarySearchTrees;

import java.util.Arrays;

public class BinarySearchTree {

    private TreeNode root;

    public void insert(Integer data){
        if(root == null){
            this.root = new TreeNode(data);
        } else {
            root.insert(data);
        }
    }

    public TreeNode find(Integer data){
        if(root != null){
            this.root.find(data);
        }
        return null;
    }

    public void deleteSoft(Integer data){
        TreeNode toDelete = find(data);
        toDelete.delete();
    }

    public void delete(Integer data){
        TreeNode current = this.root;
        TreeNode parent = this.root;
        boolean isLeftChild = false;

        if(current == null){
            return;
        }

        while(current != null && current.getData() != data){
            parent = current;

            if(data < current.getData()){
                current = current.getLeftChild();
                isLeftChild = true;
            }else{
                current = current.getRightChild();
                isLeftChild = false;
            }
        }

        if(current == null){
            return;
        }

        if(current.getLeftChild() == null && current.getRightChild() == null){
            if(current == root){
                root = null;
            } else {
                if(isLeftChild){
                    parent.setLeftChild(null);
                } else {
                    parent.setRightChild(null);
                }
            }
        } else if(current.getRightChild() == null){
            if(current == root){
                root = current.getLeftChild();
            } else if(isLeftChild){
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }
        } else if(current.getLeftChild() == null){
            if(current == root){
                root = current.getRightChild();
            } else if(isLeftChild){
                parent.setLeftChild(current.getRightChild());
            } else {
                parent.setRightChild(current.getRightChild());
            }
        } else {
            TreeNode successor = getSuccesor(current);
            if(current == root){
                root = successor;
            } else if (isLeftChild){
                parent.setLeftChild(successor);
            } else {
                parent.setRightChild(successor);
            }
            successor.setLeftChild(current.getLeftChild());
        }
    }

    private TreeNode getSuccesor(TreeNode node){
        TreeNode parentOfSuccessor = node;
        TreeNode successor = node;
        TreeNode current = node.getRightChild();

        while(current != null){
            parentOfSuccessor = successor;
            successor = current;
            current = current.getLeftChild();
        }

        if(successor != node.getRightChild()){
            parentOfSuccessor.setLeftChild(successor.getRightChild());
            successor.setRightChild(node.getRightChild());
        }
        return successor;
    }

    public Integer smallest(){
        if(this.root != null){
            return root.smallest();
        }
        return null;
    }

    public Integer largest(){
        if(this.root != null){
            return root.largest();
        }
        return null;
    }

    public Integer numberOfLeafs(){
        return this.root.numberOfLeafs();
    }

    public void traverseInOrder(){
        if(this.root != null)
            this.root.traverseInOrder();
        System.out.println();
    }

    public void traversePreOrder(){
        if(this.root != null)
            this.root.traversePreOrder();
        System.out.println();
    }

    public void traversePostOrder(){
        if(this.root != null)
            this.root.traversePostOrder();
        System.out.println();
    }

    public int height(){
        return this.root.height();
    }

    public void insertBalanced(int[] array){
        int halfIndex = (int) array.length/2;
        this.insert(array[halfIndex]);

        int[] leftHalf = Arrays.copyOfRange(array, 0, halfIndex);
        if(leftHalf.length != 0)
            this.insertBalanced(leftHalf);
        int[] rightHalf = Arrays.copyOfRange(array, halfIndex+1, array.length);
        if(rightHalf.length != 0)
            this.insertBalanced(rightHalf);
    }

    public void insertSorted(int[] data){
        BinarySearchTree bst = new BinarySearchTree();
        if(data != null && data.length>0){
            bst.root = TreeNode.addSorted(data,0,data.length-1);
        }
    }

    public static void main(String[] args) {
        int[] sample = { 1, 2, 6, 7, 10, 12, 111};

        BinarySearchTree bst = new BinarySearchTree();

        bst.insertBalanced(sample);

        bst.traverseInOrder();
        System.out.println(bst.numberOfLeafs());
        System.out.println(bst.height());
    }

}
