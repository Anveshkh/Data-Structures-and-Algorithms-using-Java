package easy_recursion;

public class Reverse {
    public static void main(String[] args) {
        int n = 1221;
        int num = reverse(n,0);
        if(num == n){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a pallindrome");
        }
    }
    static int reverse(int n, int sum){
        if(n == 0){
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return reverse(n/10, sum);
    }
}
