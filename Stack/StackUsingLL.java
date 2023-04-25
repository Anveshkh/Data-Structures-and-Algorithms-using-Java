package Stack;

public class StackUsingLL {

    // This is user defined data type called Node.
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    private static Node head = null;
    private static int size = 0;

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    int pop(){
        if(head == null){
            System.out.println("Stack is empty! Nothing to print!");
            return -1;
        }
        int elem = head.data;
        head = head.next;
        return elem;
    }

    void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
        System.out.println();
    }

    boolean isEmpty(){
        return head == null;
    }

    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.display();

        stack.pop(); // Last added will be removed first
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();

        System.out.println(stack.isEmpty());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
    }



}
