package dsa_leetcode;

public class DuplicatesInLL {

    private Node head;

    private int size;
    DuplicatesInLL(){
        this.size = 0;
    }

    void insertFirst(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void display(){
        if(head == null){
            System.out.println("Nothing to display");
            return;
        }
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("END");
    }

    private Node removeDuplicates(){
        Node ptr = head;
        while(ptr.next != null){
            if(ptr.data == ptr.next.data){
                ptr.next = ptr.next.next;
            }else{
                ptr = ptr.next;
            }
        }
        return head;
    }
    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node(int data, Node node){
            this.data = data;
            this.next = node;
        }
    }

    public static void main(String[] args) {
        DuplicatesInLL list = new DuplicatesInLL();
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(4);
        list.display();
        System.out.println("List after removing Duplicates is :- ");
        System.out.println(list.removeDuplicates());
        list.display();
    }
}
