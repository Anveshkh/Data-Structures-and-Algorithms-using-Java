package Trees;
public class BinarySearchTree {
    static class Node{
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data){
            this.data = data;
        }
    }

    static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.data){
            root.leftChild = insert(root.leftChild, val);
        }else{
            root.rightChild = insert(root.rightChild, val);
        }

        return root;
    }

    static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.leftChild);
        System.out.println(root.data);
        inorder(root.rightChild);
    }

    public static void main(String[] args) {
        int[] BST = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for(int i = 0; i<BST.length; i++){
            root = insert(root, BST[i]);
        }

    }
}
