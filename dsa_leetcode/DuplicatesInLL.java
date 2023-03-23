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

    private void insertLast(int data){
        if(head == null){
            insertFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = newNode;
        newNode.next = null;

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
        Node (){
            this.data = 0;
            this.next = null;
        }
        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node(int data, Node node){
            this.data = data;
            this.next = node;
        }
    }

    private DuplicatesInLL mergeLL(DuplicatesInLL list1, DuplicatesInLL list2){
        Node ptr1 = list1.head;
        Node ptr2 = list2.head;

        DuplicatesInLL ans = new DuplicatesInLL();
        while(ptr1 != null && ptr2 != null){
            if(ptr1.data > ptr2.data){
                ans.insertLast(ptr2.data);
                ptr2 = ptr2.next;
            }else{
                ans.insertLast(ptr1.data);
                ptr1 = ptr1.next;
            }
        }
        while(ptr1 != null){
            ans.insertLast(ptr1.data);
            ptr1 = ptr1.next;
        }
        while(ptr2 != null){
            ans.insertLast(ptr2.data);
            ptr2 = ptr2.next;
        }

        return ans;

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
