package LinkedList.SinglyLL;

public class SinglyLinked {

    private Node head;
    private Node tail;

    private int size;

    SinglyLinked(){
        this.size = 0;
    }

    void insertFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    void insertLast(int data){
        if(head == null){
            insertFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        // temp has now reached the last node
        temp.next = newNode;
    }

    void deleteFirst(){
        if(head == null){
            System.out.println("List is empty! Nothing to delete");
            return;
        }

        head = head.next;
    }

    void deleteLast(){
        if(head == null){
            System.out.println("Nothing to delete!");
            return;
        }

        if(head.next == null){
            head = null;
            tail = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }

        // lastNode and secondLastNode are at their correct position
        secondLastNode.next = null;
    }

    void deleteRandom(int index){

        Node temp = head;
        for(int i = 0; i<index-1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinked list = new SinglyLinked();
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(29);
        list.insertFirst(10);

        list.display();

        list.insertLast(99);
        list.display();

        list.deleteLast();
        list.display();

        list.deleteRandom(3);
        list.display();
    }
}
