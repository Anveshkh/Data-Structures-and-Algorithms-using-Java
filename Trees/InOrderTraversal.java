package Trees;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class InOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    static Node createTree(){

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        if(data == -1) return null;

        Node node = new Node(data);
        System.out.println("Enter left for " + data);
        node.left = createTree();
        System.out.println("Enter right for " + data);
        node.right = createTree();
        return node;
    }

    static void print(Node root){
        if(root.left == null){
            System.out.print(root.data + " ");
            return;
        }
        if(root.right == null){
            System.out.print(root.data + " ");
            return;
        }

        System.out.print(root.data);
        print(root.left);
        print(root.right);

    }

    static void inorder(Node root){
        if(root.left == null) return;
        System.out.print(root.data + " ");
        if(root.right == null) return;
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        System.out.println("Enter data:- ");
        Node root = createTree();
        print(root);
    }

}
