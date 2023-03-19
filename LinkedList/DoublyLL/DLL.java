package LinkedList.DoublyLL;

public class DLL {

    private Node head;
    private Node tail;
    private int size;
    public DLL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.value = value;
        if(head == null){
            node.next = head;
            node.prev = null;
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int value){
        if(head == null){
            insertFirst(value);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(value);
        temp.next = node;
        node.next = null;
        node.prev = temp;
        tail = node;

        size++;
    }

    public void insert(int index, int value){
        if(index == 0){
            insertFirst(value);
        }
        if(index == size){
            insertLast(value);
        }
        Node node = new Node(value);
        Node temp = head;
        int i;
        for(i = 0; i<index-1; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;

        size++;
    }

    private class Node{
        private int value;
        private Node prev;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
