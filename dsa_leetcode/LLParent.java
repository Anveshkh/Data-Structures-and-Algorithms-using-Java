package dsa_leetcode;

import javax.crypto.spec.PSource;

public class LLParent  {

    public Node head;

    public void insertFirst(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            insertFirst(data);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display(){
        if(head == null){
            System.out.println("Nothing to display i.e List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
