package Trees;

// Preorder traversal using Iteration

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        preorder(root);
    }

    static List<Integer> preorder(Node root){
        if (root == null) return null;
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            root = stack.pop();
            list.add(root.data);

            if(root.right != null){
                stack.push(root.right);
            }
            if(root.left != null){
                stack.push(root.left);
            }
        }
        return list;
    }
}
