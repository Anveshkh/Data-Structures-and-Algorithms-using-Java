package dsa_leetcode;

public class IntersectionLL {
    private Node intersection(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        int l1 = 0;
        int l2 = 0;

        while(temp1!=null){
            l1++;
            temp1 = temp1.next;
        }
        while(temp2!=null){
            l2++;
            temp2 = temp2.next;
        }
        if(l1 > l2){
            temp1 = head1;
            for(int i = 1; i<= (l1-l2); i++){
                temp1 = temp1.next;
            }
        }else{
            temp2 = head2;
            for(int i = 1; i<= (l2-l1); i++){
                temp2 = temp2.next;
            }
        }

        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}
