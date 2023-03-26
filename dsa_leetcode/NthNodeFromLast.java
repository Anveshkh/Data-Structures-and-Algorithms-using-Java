package dsa_leetcode;

public class NthNodeFromLast extends LLParent{
    private Node delete(Node head, int pos){
        // first find the length of the linked list
        Node temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        // nth node from last means (m-n+1)th node from first where m => size of LL
        int m = size - pos + 1;

        temp = head;
        for(int i =1; i<=m-1; i++){
            temp = temp.next;
        }
        return temp;
    }

    private Node deleteOneTraversal(Node head, int pos){
        Node fast = head;
        Node slow = head;

        for(int i =1; i<=pos; i++){
            fast = fast.next;
        }
        while(fast!= null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        NthNodeFromLast list = new NthNodeFromLast();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(7);
        list.display();
        System.out.println(list.delete(list.head, 3).data);
        System.out.println(list.deleteOneTraversal(list.head, 2).data);


    }
}
