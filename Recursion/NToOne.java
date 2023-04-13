package Recursion;

public class NToOne {
    public static void main(String[] args) {
//        func( 5);
//        System.out.println("second");
//        func2(1, 5);
        backtracking(1, 5);
    }

    static void func( int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        func(n-1);
    }

    static void func2(int num, int n){
        if(num == n){
            System.out.println(num);
            return;
        }
        func2(num+1, n);
        System.out.println(num);
    }

    static void backtracking(int num, int n){
        if(num > n){
            return;
        }
        backtracking(num+1, n);
        System.out.println(num);
    }
}
