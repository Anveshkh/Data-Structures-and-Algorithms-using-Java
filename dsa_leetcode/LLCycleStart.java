package dsa_leetcode;

public class LLCycleStart {
    public Node cycleStart(Node head){
        int length = 0;
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                Node temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while (temp != slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }

        Node f = head;
        Node s = head;

        while(length > 0){
            s = s.next;
            length--;
        }

        while(s != f){
            s = s.next;
            f = f.next;
        }

        return s;
    }
}
