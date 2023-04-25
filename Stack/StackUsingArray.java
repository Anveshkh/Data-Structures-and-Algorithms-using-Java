package Stack;

import java.util.Scanner;

public class StackUsingArray {
    static int[] arr = new int[5];
    static int idx = 0;
    void push(int data){
        if(idx == arr.length){
            System.out.println("Stack is full");
            return;
        }
        arr[idx++] = data;
    }

    int pop(){
        if(idx == 0){
            System.out.println("Stack is empty");
            return -1;
        }

        int elem = arr[idx-1];
        idx--;
        arr[idx] = 0;
        return elem;
    }

    void display(){
        if(idx == 0){
            System.out.println("Stack is empty ! Nothing to print !");
            return;
        }
        System.out.println("Printing stack elements from first inserted to last inserted");
        for(int i = 0; i<idx; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    boolean isFull(){
        return idx == arr.length;
    }

    boolean isEmpty(){
        return idx == 0;
    }




    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.display();

        stack.pop();
        stack.display();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();

        stack.pop();
        stack.display();

        stack.pop();
        stack.display();

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}
