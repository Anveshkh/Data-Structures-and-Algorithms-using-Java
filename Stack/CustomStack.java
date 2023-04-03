package Stack;

public class CustomStack {
    protected int[] arr;
    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;

    CustomStack(){
        this(DEFAULT_SIZE);
    }

    CustomStack(int size){
        this.arr = new int[size];
    }

    public boolean push(int val){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }

        arr[++ptr] = val;
        return true;
    }


    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
        return arr[ptr--];
    }


    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }
        return arr[ptr];
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public boolean isFull() {
        return ptr == arr.length-1;
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }

        for(int i = 0; i<=ptr; i++){
            System.out.print(arr[i] + " <- ");
        }
        System.out.println("End");
    }
}
