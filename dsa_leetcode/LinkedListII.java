package dsa_leetcode;

public class LinkedListII {
    public Node reverseBetween(Node head, int left, int right){
        if(left == right){
            return head;
        }

        Node prev = null;
        Node curr = head;

        for(int i =1 ; i<left; i++){
            prev = curr;
            curr = curr.next;
        }

        Node newEnd = curr;
        Node next = curr.next;
        Node last = prev;

        for(int i = 1; i<=right-left+1; i++){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = curr.next;
            }
        }

        last.next = prev;
        newEnd.next = curr;
        return head;
    }
}
