public class Callstack {
    public static void main(String[] args) {
//        print(1);
//        int start = 0, second = 1;
//        fibonacci(start, second, 2);
        // recursion means a function that calls itself
        int ans = fibo(7);
        System.out.println(ans);

    }
//    static void print(int n){
//        if(n == 5){
//            System.out.println(n);
//            return;
//        }
//
//        System.out.println(n);
//        print(n+1);
//    }

    static void fibonacci(int start , int second, int n){
        int sum = start + second;
        if(n == 7){
            System.out.println(sum);
            return;
        }

        fibonacci(second, sum, n = n + 1);
    }

    static int fibo(int n){

        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
