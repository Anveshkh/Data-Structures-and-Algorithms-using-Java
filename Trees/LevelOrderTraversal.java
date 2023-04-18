package Trees;

import java.util.PriorityQueue;
import java.util.Queue;

public class LevelOrderTraversal {
    public class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    Queue<Node> queue = new PriorityQueue<>();
    Queue<Integer> ans = new PriorityQueue<>();

    void inOrderTraversal(Node root){
        if(root.left == null && root.right == null){
            ans.add(root.data);
            return;
        }
        Node curr = queue.poll();
        queue.add(curr.left);
        queue.add(curr.right);
        ans.add(curr.data);

    }

    public static void main(String[] args) {
        LevelOrderTraversal cl = new LevelOrderTraversal();

    }
}
