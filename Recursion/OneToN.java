package Recursion;

public class OneToN {
    public static void main(String[] args) {
//        func(1, 5);
        backtracking(5);
    }
    static void func(int num, int n){
        if(num == n+1){
            return;
        }
        System.out.println(num);
        func(num+1, n);
    }
    static void backtracking(int num){
        if(num <1){
            return;
        }
        backtracking(num-1);
        System.out.println(num);
    }
}
