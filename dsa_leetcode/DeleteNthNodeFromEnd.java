package dsa_leetcode;

public class DeleteNthNodeFromEnd extends LLParent {
    private Node delete(Node head, int pos){
        Node fast = head;
        Node slow = head;

        for(int i =1 ; i<=pos ; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = fast;
        return head;
    }

    public static void main(String[] args) {
        DeleteNthNodeFromEnd list = new DeleteNthNodeFromEnd();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.display();
        list.delete(list.head, 2);
        list.display();
    }
}
