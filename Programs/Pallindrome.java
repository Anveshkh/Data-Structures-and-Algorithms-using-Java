package Programs;

public class Pallindrome {
    public static void main(String[] args) {
        int n = 22322;
        isPallindrome(n);
    }
    static void isPallindrome(int n) {
        if ((n & (1 >> n - 1)) == n % 10) {
            System.out.println("last numbers match");
        }
    }
}
