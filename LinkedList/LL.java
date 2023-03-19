package LinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i = 0; i<index-1; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    public void display(){
        Node temp = head; // this does not create a new object it just points to the same object as head does
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <=1){
            return deleteFirst();
        }

        int value = tail.value;
        Node temp = head;
        for(int i = 1; i<size-1; i++){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        return value;
    }

    public int delete(int index){
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        int value = temp.next.value;
        temp.next = temp.next.next;
        return value;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
