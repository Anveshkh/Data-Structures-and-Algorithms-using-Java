package dsa_leetcode;

public class ReverseLL {
    public Node reverse(Node head){
        if(head == null){
            return null;
        }

        Node prev = null;
        Node curr = head;
        Node next = head.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;

            if(next != null){
                next = curr.next;
            }
        }

        head = prev;
        return head;
    }
}
