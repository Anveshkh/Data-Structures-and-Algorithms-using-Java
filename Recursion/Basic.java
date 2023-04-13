package Recursion;

public class Basic {
    public static void main(String[] args) {
        func();
    }
    static int count = 0;
    static void func(){
        if(count == 5){
            return;
        }
        System.out.println("Anvesh Khambadkar");
        count++;
        func();
    }
}
