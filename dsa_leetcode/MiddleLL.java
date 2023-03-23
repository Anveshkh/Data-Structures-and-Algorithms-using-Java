package dsa_leetcode;

public class MiddleLL extends LLParent {


    private static int middle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        LLParent parent = new LLParent();
        parent.insertLast(1);
        parent.insertLast(2);
        parent.insertLast(3);
        parent.insertLast(4);
        parent.insertLast(5);
        parent.insertLast(6);
        parent.display();
        middle(parent.head);

        System.out.println(middle(parent.head));
    }
}
