package LinkedList.DoublyLL;

public class DoublyLinked {

    private Node head;
    private Node tail;
    private int size;

    DoublyLinked(){
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
        head.prev = newNode;
        head = newNode;
    }

    void insertLast(int data){
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
        newNode.prev = temp;
    }

    void display(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data + " -><- ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.prev = null;
    }

    void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node lastNode = head.next;
        Node lastSecondNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            lastSecondNode = lastSecondNode.next;
        }

        lastSecondNode.next = null;
        lastNode.prev = null;
    }

    class Node{
        private int data;
        private Node next;
        private Node prev;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        DoublyLinked list = new DoublyLinked();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.display();

        list.deleteLast();
        list.display();

        list.deleteFirst();
        list.display();

        list.insertLast(87);
        list.display();
    }
}
