package Programs;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 5696;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n == 0){
            return 1;
        }
        return (n % 10) + sum(n/10);
    }
}
