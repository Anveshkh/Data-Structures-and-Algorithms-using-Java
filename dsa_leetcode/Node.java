package dsa_leetcode;

public class Node {
    int data;
    Node next;

    Node(){
        this.next = null;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
