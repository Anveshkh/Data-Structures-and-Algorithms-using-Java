package Programs;

public class Fibo {
    public static void main(String[] args) {
        int ans = Fibo(5);
        System.out.println(ans);
    }
    static int Fibo(int n){
        if(n < 2){
            return n;
        }

        return Fibo(n - 1) + Fibo(n-2);
    }
}
