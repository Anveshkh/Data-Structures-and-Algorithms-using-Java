package dsa_leetcode;

public class PallindromeLLHighMemory {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode secondHead = func(temp);
        ListNode prev= null;
        ListNode curr = head;
        ListNode next = curr.next;
        int size = 0;
        while(curr != null){
            size++;
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = curr.next;
            }
        }

        head = prev;
        for(int i = 1; i<=size; i++){
            if(secondHead.val != head.val){
                return false;
            }else{
                head = head.next;
                secondHead = secondHead.next;
            }
        }
        return true;

    }

    private ListNode func(ListNode temp){
        if(temp == null){
            return null;
        }
        ListNode newNode = new ListNode(temp.val);
        temp = temp.next;
        ListNode forward = func(temp);
        newNode.next = forward;
        return newNode;
    }

    class ListNode{
        int val;
        ListNode next;

        ListNode(){

        }
        ListNode(int val) {
            this.val = val;
        }
    }
}
