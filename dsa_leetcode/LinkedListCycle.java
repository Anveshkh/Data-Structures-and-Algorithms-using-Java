package dsa_leetcode;

public class LinkedListCycle {

    private Node head;
    private int size;

    LinkedListCycle(){
        this.size = 0;
    }

    void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    void circular(int data){
        if(head == null){
            System.out.println("circular not possible");
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head.next;
        size++;
    }

    void display(){
        if(head == null){
            System.out.println("Nothing to display");
            return;
        }
        Node temp = head;
        int i =1;
        while(temp != null && i<=size ){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            i++;
        }
        System.out.println("End");
    }

    public boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null || fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkedListCycle list = new LinkedListCycle();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
//        list.circular(8);
        System.out.println(list.hasCycle(list.head));
        list.display();
    }
}
