package dsa_leetcode;

public class LengthLL extends LLParent {
    public int length(Node head){
        int length = 0;
        Node fast = head;
        Node slow = head;

        while(fast.next != null && fast != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                Node temp = slow;

                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LengthLL list = new LengthLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();

    }
}
